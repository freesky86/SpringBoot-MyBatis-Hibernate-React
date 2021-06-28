import React, { Component } from 'react';
import { Button, ButtonGroup, Container, Table } from 'reactstrap';
import AppNavbar from './AppNavbar';
import { Link } from 'react-router-dom';

class UserList extends Component {

    constructor(props) {
        super(props);
        this.state = {users: []};
    }

    componentDidMount() {
        fetch('/hibernate/users')
            .then(response => response.json())
            .then(data => this.setState({users: data}));
    }
    
    render() {
        const {users} = this.state;

        const userList = users.map(user => {
            return <tr key={user.id}>
                <td style={{whiteSpace: 'nowrap'}}>{user.firstName}</td>
                <td>{user.lastName}</td>
                <td>{user.email}</td>
                <td>
                    <ButtonGroup>
                        <Button size="sm" color="primary" tag={Link} to={"/users/" + user.id}>Edit</Button>
                        <Button size="sm" color="danger" onClick={() => this.remove(user.id)}>Delete</Button>
                    </ButtonGroup>
                </td>
            </tr>
        });

        return (
            <div>
                <AppNavbar/>
                <Container fluid>
                    <div className="float-right">
                        <Button color="success" tag={Link} to="/users/new">Add user</Button>
                    </div>
                    <h3>User List</h3>
                    <Table className="mt-4">
                        <thead>
                        <tr>
                            <th width="30%">First Name</th>
                            <th width="30%">Last Name</th>
                            <th width="30%">Email</th>
                            <th width="40%">Actions</th>
                        </tr>
                        </thead>
                        <tbody>
                        {userList}
                        </tbody>
                    </Table>
                </Container>
            </div>
        );
    }
}
export default UserList;