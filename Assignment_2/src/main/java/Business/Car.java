/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author karthik
 */
public class Car {
    public String carDesc;
    public String carModel;
    public int carMakeYear;
    public int totalSeats;
    public boolean carAvailability;
    public String carMake;
    public String carSerialNum;
    public String carCity;
    public String maintenanceDate;
    public int seatsAvail;

    public Car(String carDesc, String carModel, int carMakeYear, int totalSeats, boolean carAvailability, String carMake, String carSerialNum, String carCity, String maintenanceDate, int seatsAvail) {
        this.carDesc = carDesc;
        this.carModel = carModel;
        this.carMakeYear = carMakeYear;
        this.totalSeats = totalSeats;
        this.carAvailability = carAvailability;
        this.carMake = carMake;
        this.carSerialNum = carSerialNum;
        this.carCity = carCity;
        this.maintenanceDate = maintenanceDate;
        this.seatsAvail = seatsAvail;
    }

    public Car(){
        
    }
    public String getCarDesc() {
        return carDesc;
    }

    public void setCarDesc(String carDesc) {
        this.carDesc = carDesc;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public int getCarMakeYear() {
        return carMakeYear;
    }

    public void setCarMakeYear(int carMakeYear) {
        this.carMakeYear = carMakeYear;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public boolean isCarAvailability() {
        return carAvailability;
    }

    public void setCarAvailability(boolean carAvailability) {
        this.carAvailability = carAvailability;
    }

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCarSerialNum() {
        return carSerialNum;
    }

    public void setCarSerialNum(String carSerialNum) {
        this.carSerialNum = carSerialNum;
    }

    public String getCarCity() {
        return carCity;
    }

    public void setCarCity(String carCity) {
        this.carCity = carCity;
    }

    public String getMaintenanceDate() {
        return maintenanceDate;
    }

    public void setMaintenanceDate(String maintenanceDate) {
        this.maintenanceDate = maintenanceDate;
    }

    public int getSeatsAvail() {
        return seatsAvail;
    }

    public void setSeatsAvail(int seatsAvail) {
        this.seatsAvail = seatsAvail;
    }

    @Override
    public String toString() {
        return carDesc;
    }
    
    
    
    
}


