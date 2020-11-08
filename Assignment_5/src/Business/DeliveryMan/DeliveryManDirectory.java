/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
        private List<DeliveryMan> deliveryManList;


    public DeliveryManDirectory(){
               deliveryManList = new ArrayList<DeliveryMan>(); 
    }

    public List<DeliveryMan> getDeliveryManList() {
        return deliveryManList;
    }

    public void setDeliveryManList(List<DeliveryMan> deliveryManList) {
        this.deliveryManList = deliveryManList;
    }
     public void removeDeliveryMan(DeliveryMan d) {
          deliveryManList.remove(d);
    }   
          public void addDeliveryMan(DeliveryMan d) {
          deliveryManList.add(d);
    } 
            public void updateDeliveryMan(DeliveryMan deliveryMan,int id){
       for(DeliveryMan d: deliveryManList){
        if(d.getEmpId() == id){
             d.setName(deliveryMan.getName());
             d.setAddress(deliveryMan.getAddress());
             d.setEmpId(deliveryMan.getEmpId());
             d.setPhone(deliveryMan.getPhone());
             d.setUpdateDate(deliveryMan.getUpdateDate());
             d.setPassword(deliveryMan.getPassword());
        }
       }
    }
     
}
