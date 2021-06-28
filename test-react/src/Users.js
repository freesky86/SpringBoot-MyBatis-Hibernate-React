import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import AppNavbar from './AppNavbar';

class Users extends React.Component {
    state = {
      isLoading: true,
      users: []
    };
  
    async componentDidMount() {
      const response = await fetch('/hibernate/users');
      const body = await response.json();
      this.setState({ users: body, isLoading: false });
    }
  
    render() {
      const {users, isLoading} = this.state;
  
      if (isLoading) {
        return <p>Loading...</p>;
      }
  
      return (
        <div className="App">
          <AppNavbar/>
          <header className="App-header">
            <img src={logo} className="App-logo" alt="logo" />
            <div className="App-intro">
              <h2>User List</h2>
              {users.map(user =>
                <div key={user.id}>
                  {user.firstName} - {user.lastName} - {user.email}
                </div>
              )}
            </div>
          </header>
        </div>
      );
    }
  }
  
  export default Users;
  