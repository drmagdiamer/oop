package com.javainbabysteps.oop.lecture4Ex2.oneToMany;


import java.util.ArrayList;

public class Car {
    private String id;
    private Motor motor;

    private ArrayList<Tire> tires;

    public Car() {
        this.tires = new ArrayList<>();
    }

    public void addTire(Tire tire){
        this.tires.add(tire);
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        String result =  "Car{" +
                "id='" + id + '\'' +
                ", motor manufactured year is " + motor.getManufacturedYear() +
                ", has " + tires.size() +" tires ";
        for(int i=0; i< tires.size(); i++){
            result = result + "\n tire number "+i+" has manufacturer "+tires.get(i).getManufacturer();
        }

        result = result + '}';
        return result;
    }
}
