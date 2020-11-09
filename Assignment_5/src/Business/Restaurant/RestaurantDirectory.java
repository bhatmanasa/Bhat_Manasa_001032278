/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    private List<Restaurant> restaurantList;
    private DefaultMutableTreeNode node;

    public RestaurantDirectory() {
        restaurantList = new ArrayList<Restaurant>();
    }

    public List<Restaurant> getRestaurantList() {
        return restaurantList;
    }

    public void setRestaurantList(List<Restaurant> restaurantList) {
        this.restaurantList = restaurantList;
    }
    public void addRestaurantList(Restaurant r) {
        this.restaurantList.add(r);
    }
    public void updateMenu(Restaurant r,Map<String, Double> menuMap) {
        for(Restaurant restaurant:restaurantList){
            if(restaurant.getName().equalsIgnoreCase(r.getName())){
                restaurant.setMenuMap(menuMap);
            }
        }
    }
    public Restaurant checkIfRestaurantIsUnique(String name){
        for(Restaurant r: restaurantList){
            if(r.getName().equals(name)){
                return r;
            }
        }
        return null;
    }
    public int getManager(String restaurantName){
        for(Restaurant r: restaurantList){
            if(r.getName().equals(restaurantName)){
                return r.getManagerID();
            }
        }
        return 0;
    }
    public String getName(int id){
        for(Restaurant r: restaurantList){
            if(r.getManagerID() == (id)){
                return r.getName();
            }
        }
        return null;
    }
    
    public void setMenuNode(DefaultMutableTreeNode node){
        this.node = node;
    }
    
    public DefaultMutableTreeNode getMenunode(){
        return node;
    }
    
}

