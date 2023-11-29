package com.javainbabysteps.oop.lecture4Ex2.oneToOne;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setId("ABC 111");

        Motor m1 = new Motor();
        m1.setManufacturedYear(2023);

        m1.setCar(c1);
        c1.setMotor(m1);

        //System.out.println("END");

        System.out.println(m1);

    }

}
