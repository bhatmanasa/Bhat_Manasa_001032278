/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.DeliveryMan.DeliveryMan;
import Business.Employee.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harold
 */
public class CustomerDirectory {
        private List<Customer> customerList;


    public CustomerDirectory(){
               customerList = new ArrayList<Customer>(); 
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
    
    public Customer createCustomer(Customer customer){
        customerList.add(customer);
        return customer;
    } 
        public void removeCustomer(int id){
        for(Customer c: customerList){
            if(c.getEmpId() == id){
                customerList.remove(c);
            }
        }
    } 
        public void updateCustomer(Customer customer,int id){
       for(Customer c: customerList){
        if(c.getEmpId() == id){
             c.setName(customer.getName());
             c.setAddress(customer.getAddress());
             c.setEmpId(customer.getEmpId());
             c.setPhone(customer.getPhone());
             c.setUpdateDate(customer.getUpdateDate());
             c.setPassword(customer.getPassword());
        }
       }
    } 
    
}