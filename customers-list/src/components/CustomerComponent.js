import React from 'react';
import CustomerService from '../services/CustomerService';

class CustomerComponent extends React.Component{

    constructor(props){
        super(props)
        this.state = {
            customers:[]
        }
    }

    componentDidMount(){
        CustomerService.getCustomers().then((response) => {
            this.setState({customers:response.data})

        });
    }
    render(){
        return(
            <div>
                <h1 className="text-center">List of Contacts</h1>
                <table className="table table-striped">
                    <thead>
                        <tr>
                            <td>Id</td>
                            <td>Name</td>
                            <td>Email Id</td>
                            <td>Country</td>

                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.state.customers.map(
                                customer =>
                                <tr key = {customer.id}>
                                    <td>{customer.id}</td>
                                    <td>{customer.fullName}</td>
                                    <td>{customer.email}</td>
                                    <td>{customer.country}</td>

                                    </tr>

                            )
                        }
                    </tbody>

                </table>
            </div>
        )
    }

}



export default  CustomerComponent