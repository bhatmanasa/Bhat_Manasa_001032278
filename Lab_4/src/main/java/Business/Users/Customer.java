/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

import Business.Abstract.User;
import Business.ProductDirectory;
import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author AEDSpring2019
 */
public class Customer extends User implements Comparable<Supplier>{
       private ProductDirectory directory;
       private Date createDate;
    public Customer(String password, String userName) {
        super(password, userName, "CUSTOMER");
        directory = new ProductDirectory();
        setCreateDate();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate() {
        this.createDate = new Date();
    }
    
    public ProductDirectory getDirectory() {
        return directory;
    }

    public void setDirectory(ProductDirectory directory) {
        this.directory = directory;
    }

    @Override
    public int compareTo(Supplier o) {
        return o.getUserName().compareTo(this.getUserName());
    }

    @Override
    public String toString() {
        return getUserName(); 
    }
    
    public boolean verify(String password){
        if(password.equals(getPassword()))
            return true;
        return false;
    } 
}
