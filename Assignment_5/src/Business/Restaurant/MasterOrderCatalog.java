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
 * @author manasa
 */
public class MasterOrderCatalog {
    List<Order> moc;
    public MasterOrderCatalog(){
        moc = new ArrayList<Order>();
    }

    public List<Order> getMoc() {
        return moc;
    }

    public void setMoc(List<Order> moc) {
        this.moc = moc;
    }
    
    public void addMoc(Order o) {
        moc.add(o);
    }
}
