/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

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

    public Restaurant(String name,String location) {
        this.name = name;
        this.location=location;
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

    @Override
    public String toString() {
        return "Restaurant{" + "name=" + name + ", managerID=" + managerID + ", menuMap=" + menuMap + ", location=" + location + '}';
    }
    
    
}
