package com.javainbabysteps.oop.lecture7Ex1;

import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Plan p1 = new Plan("Plan Speak More", "P101", 560, 2.50F);
        Plan p2 = new Plan("Pay Less", "P205", 1200, 0.50F);

        Customer c1 = new Customer("Ahmed", "101 Bank St", 101 );
        Customer c2 = new Customer("Tom", "101 First St", 504 );

        GregorianCalendar calendar1 = new GregorianCalendar(2023, 0, 1);
        Date startDate1 = calendar1.getTime();
        Contract ct1 = new Contract("111", startDate1, p1, c1);
        p1.addContract(ct1);
        c1.addContract(ct1);

        GregorianCalendar calendar2 = new GregorianCalendar(2023, 4, 1);
        Date startDate2 = calendar2.getTime();
        Contract ct2 = new Contract("456", startDate2);
        ct2.setPlan(p2);
        p2.addContract(ct2);
        ct2.setCustomer(c1);
        c1.addContract(ct2);

        GregorianCalendar calendar3 = new GregorianCalendar(2023, 11, 1);
        Date startDate3 = calendar3.getTime();
        Contract ct3 = new Contract("111", startDate3, p1, c2);
        p1.addContract(ct3);
        c2.addContract(ct3);

        System.out.println(c1);
        System.out.println("**********");
        System.out.println(c2);
        System.out.println("**********");
        System.out.println(p1);
        System.out.println("**********");
        System.out.println(p2);


    }
}
