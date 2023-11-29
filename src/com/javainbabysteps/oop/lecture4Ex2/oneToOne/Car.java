package com.javainbabysteps.oop.lecture4Ex2.oneToOne;

public class Car {
    private String id;
    private Motor motor;

    @Override
    public String toString() {
        return "Car{" +
                "id='" + id + '\'' +
                ", motor manufactured year is " + motor.getManufacturedYear() +
                '}';
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
}
