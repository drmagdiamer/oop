package com.javainbabysteps.oop.lecture4Ex2.oneToMany;



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
        System.out.println(c1);

        Tire t1 = new Tire();
        t1.setPressure(32);
        t1.setManufacturer("Michelin");

        Tire t2 = new Tire();
        t2.setPressure(32);
        t2.setManufacturer("Michelin");

        Tire t3 = new Tire();
        t3.setPressure(32);
        t3.setManufacturer("BlackBridge");

        Tire t4 = new Tire();
        t4.setPressure(32);
        t4.setManufacturer("BlackBridge");

        t1.setCar(c1);
        c1.addTire(t1);

        t2.setCar(c1);
        c1.addTire(t2);

        t3.setCar(c1);
        c1.addTire(t3);

        t4.setCar(c1);
        c1.addTire(t4);

        System.out.println(c1);
        System.out.println(t1);



    }

}
