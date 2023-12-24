package com.javainbabysteps.oop.lecture11Ex1;

import java.util.Date;
import java.util.GregorianCalendar;

public class MyApp {
    public static void main(String[] args) {
        Hotel  h1 = new Hotel("Cairo Pyramids Hotel", "C001");
        Facility f1 = new Facility("Jacuzzi", "F001", "Jacuzzi Bath Tub");
        Facility f2 = new Facility("Home Theatre", "F002", "Home Theatre with seating for up to 8 people");
        SingleRoom s1 = new SingleRoom("S001", 101, h1);
        h1.addRoom(s1);
        SingleRoom s2 = new SingleRoom("S002", 102, h1);
        h1.addRoom(s2);
        SingleRoom s3 = new SingleRoom("S003", 201, h1);
        h1.addRoom(s3);
        DoubleRoom d1 = new DoubleRoom("D001", 103, h1, 3);
        h1.addRoom(d1);
        DoubleRoom d2 = new DoubleRoom("D002", 104, h1, 4);
        h1.addRoom(d2);
        DoubleRoom d3 = new DoubleRoom("D003", 202, h1, 4);
        h1.addRoom(d3);
        DoubleRoom d4 = new DoubleRoom("D004", 203, h1, 3);
        h1.addRoom(d4);
        Wing w1 = new Wing("w001", 110, h1);
        h1.addRoom(w1);
        Wing w2 = new Wing("w002", 210, h1);
        h1.addRoom(w2);

        w1.addFacility(f1);
        f1.addWing(w1);
        w2.addFacility(f1);
        f1.addWing(w2);
        w2.addFacility(f2);
        f2.addWing(w2);

        Customer magdi = new Customer("Magdi Amer", "C001");
        Customer tom = new Customer("Tom Hanks", "C002");

        GregorianCalendar calendar1 = new GregorianCalendar(2023, 12, 25);
        Date startDate1 = calendar1.getTime();

        GregorianCalendar calendar2 = new GregorianCalendar(2024, 1, 10);
        Date endDate1 = calendar2.getTime();

        GregorianCalendar calendar3 = new GregorianCalendar(2024, 02, 15);
        Date startDate2 = calendar3.getTime();

        GregorianCalendar calendar4 = new GregorianCalendar(2024, 2, 25);
        Date endDate2 = calendar4.getTime();

        GregorianCalendar calendar5 = new GregorianCalendar(2024, 6, 1);
        Date startDate3 = calendar5.getTime();

        GregorianCalendar calendar6 = new GregorianCalendar(2024, 6, 7);
        Date endDate3 = calendar6.getTime();

        Reservation r1 = new Reservation("r001",  startDate1, endDate1, magdi);
        magdi.addReservation(r1);
        r1.addRoom(s1);
        s1.addReservation(r1);

        r1.addRoom(d1);
        d1.addReservation(r1);

        r1.addRoom(w1);
        w1.addReservation(r1);


        Reservation r2 = new Reservation("r002",  startDate2, endDate2, tom);
        tom.addReservation(r2);

        r2.addRoom(w1);
        w1.addReservation(r2);
        r2.addRoom(w2);
        w2.addReservation(r2);

        Reservation r3 = new Reservation("r003",  startDate3, endDate3, tom);
        tom.addReservation(r3);

        r3.addRoom(w1);
        w1.addReservation(r3);

        System.out.println(h1);
        System.out.println("\n************************************\n");
        System.out.println(w1);
        System.out.println("\n************************************\n");
        System.out.println(w2);
        System.out.println("\n************************************\n");
        System.out.println(magdi);
        System.out.println("\n************************************\n");
        System.out.println(tom);

        System.out.println("\n************************************\n");
        System.out.println(r2);




    }
}
