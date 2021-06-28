import React, { Component } from 'react';
import './App.css';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import Home from './Home';
import Users from './Users';
import UserList from './UserList';
import UserEdit from './UserEdit';

class App extends Component {
  render() {
    return (
        <Router>
          <Switch>
            <Route path='/' exact={true} component={Home}/>
            <Route path='/users' exact={true} component={Users}/>
            <Route path='/userList' exact={true} component={UserList}/>
            <Route path='/user/:id' component={UserEdit}/>
          </Switch>
        </Router>
    )
  }
}

export default App;
