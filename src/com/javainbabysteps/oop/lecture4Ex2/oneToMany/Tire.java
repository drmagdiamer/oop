package com.javainbabysteps.oop.lecture4Ex2.oneToMany;

public class Tire {
    private float pressure;
    private String manufacturer;
    private Car car;

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Tire{" +
                "pressure=" + pressure +
                ", manufacturer='" + manufacturer + '\'' +
                ", car id is " + car.getId() +
                '}';
    }
}
