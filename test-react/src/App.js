import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import Home from './Home';
import Users from './Users';
import UserList from './UserList';

class App extends Component {
  render() {
    return (
        <Router>
          <Switch>
            <Route path='/' exact={true} component={Home}/>
            <Route path='/users' exact={true} component={Users}/>
            <Route path='/userList' exact={true} component={UserList}/>
          </Switch>
        </Router>
    )
  }
}

export default App;
