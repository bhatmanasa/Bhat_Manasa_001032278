/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harold
 */
public class RestaurantDirectory {
    private List<Restaurant> restaurantList;

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
    
    public Restaurant checkIfRestaurantIsUnique(String name){
        for(Restaurant r: restaurantList){
            if(r.getName().equals(name)){
                return r;
            }
        }
        return null;
    }
}
