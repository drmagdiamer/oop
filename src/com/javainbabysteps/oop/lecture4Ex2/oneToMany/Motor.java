package com.javainbabysteps.oop.lecture4Ex2.oneToMany;


public class Motor {
    private int manufacturedYear;
    private Car car;
    @Override
    public String toString() {
        return "Motor{" +
                "manufacturedYear=" + manufacturedYear +
                ", car id is" + car.getId() +
                '}';
    }
    public int getManufacturedYear() {
        return manufacturedYear;
    }
    public void setManufacturedYear(int manufacturedYear) {
        this.manufacturedYear = manufacturedYear;
    }
    public Car getCar() {
        return car;
    }
    public void setCar(Car car) {
        this.car = car;
    }
}
