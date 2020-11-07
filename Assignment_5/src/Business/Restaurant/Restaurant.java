/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author harold
 */
public class Restaurant {
    private String name;
    private int managerID;
    private Map<String,Double> menuMap;
    private String location;
    private String address;
    private int phone;
    private Date createDate;
    private Date updateDate;
    

    public Restaurant(String name,String location) {
        this.name = name;
        this.location=location;
        setCreateDate();
        menuMap = new HashMap<String,Double>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getManagerID() {
        return managerID;
    }

    public void setManagerID(int managerID) {
        this.managerID = managerID;
    }

    public Map<String, Double> getMenuMap() {
        return menuMap;
    }

    public void setMenuMap(Map<String, Double> menuMap) {
        this.menuMap = menuMap;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate() {
        this.createDate = new Date();
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "Restaurant{" + "name=" + name + ", managerID=" + managerID + ", menuMap=" + menuMap + ", location=" + location + '}';
    }
    
    
}
