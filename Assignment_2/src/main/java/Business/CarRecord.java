/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author manasa
 */
public class CarRecord {
    private ArrayList<Car> carList;

    public CarRecord() {
        this.carList = new ArrayList<Car>();
    }

    public ArrayList<Car> getCarList() {
        return carList;
    }

    public void setCarList(ArrayList<Car> carList) {
        this.carList = carList;
    }

    
    public Car addCar(){
        Car car = new Car();
        carList.add(car);
        return car;
    }
    
    public void updateCar(Car car){
        carList.add(car);
    }
    
    public void deleteCar(Car car){
        carList.remove(car);
    }
    
 /*   public Car searchAccount(String carNumber){        
        for(Car car:carList){
            if(car.getCarNumber().equals(carNumber)){
                return car;
            }
        }
        return null;
    }*/


}
