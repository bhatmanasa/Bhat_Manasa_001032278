/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.Date;

/**
 *
 * @author raunak
 */
public class Employee {
    
    private String name;
    private int id;
    private Date createDate;
    private Date updateDate;
    private static int count = 1;

    public Employee() {
        id = count;
        count++;
        createDate = new Date();
    }

    public int getId() {
        return id;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
    

    public Date getCreateDate() {
       return createDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
