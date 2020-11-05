/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author manasa
 */
public class Order {
    private ArrayList<OrderItem> orderItemList;
    private int orderNum ;
    private static int count = 0;
    private Double totalPrice;
    private Date orderCreateDate;
    private String custId;
    private String restaurantName;
    private String Status;
    
    public Order(){
        count++;
        orderNum=count;
        orderItemList = new ArrayList<OrderItem>();
        orderCreateDate = new Date();
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    
    public OrderItem addOrderItem(String food, int q, Double price,String size){
        OrderItem o = new OrderItem();
        o.setFood(food);
        o.setQuantity(q);
        o.setSalesPrice(price);
        o.setSize(size);
        orderItemList.add(o);
        return o;
    }
    
    public void removeOrderItem(OrderItem o){
        orderItemList.remove(o);
    }

    public Date getOrderCreateDate() {
        return orderCreateDate;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
    

    @Override
    public String toString() {
        return "Order{" + "orderItemList=" + orderItemList + ", orderNum=" + orderNum + ", totalPrice=" + totalPrice + ", orderCreateDate=" + orderCreateDate + '}';
    }
    
    
    
}
