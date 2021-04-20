import axios from 'axios';

const REST = 'http://localhost:8082/api/customers';

class CustomerService{
    getCustomers(){
        return axios.get(REST);
    }
}

export default new CustomerService();