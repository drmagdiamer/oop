package com.javainbabysteps.oop.lecture6Ex1;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Mohamed", 1);
        Employee e2 = new Employee("Said", 2);
        Employee e3 = new Employee("Mona", 3);


        GregorianCalendar calendar1 = new GregorianCalendar(2023, 0, 1);
        Date startDate1 = calendar1.getTime();
        Date endDate1 = new Date(System.currentTimeMillis());
        Project p1 = new Project(1, startDate1, endDate1);

        p1.addEmployee(e1);
        e1.addProject(p1);
        p1.addEmployee(e2);
        e2.addProject(p1);
        p1.addEmployee(e3);
        e3.addProject(p1);



        GregorianCalendar calendar2 = new GregorianCalendar(2022, 11, 31);
        Date startDate2 = calendar2.getTime();
        GregorianCalendar calendar3 = new GregorianCalendar(2024, 4, 31);
        Date endDate2 = calendar3.getTime();
        Project p2 = new Project(17, startDate2, endDate2);
        p2.addEmployee(e1);
        e1.addProject(p2);
        p2.addEmployee(e3);
        e3.addProject(p2);

        Task t1 = new Task(p1.getCode()+"-001", "initialize", p1);
        p1.addTask(t1);
        Task t2 = new Task(p1.getCode()+"-002", "code", p1);
        p1.addTask(t2);
        Task t3 = new Task(p1.getCode()+"-002", "test", p1);
        p1.addTask(t3);

        System.out.println(e1);
        System.out.println(e2.toString());

        System.out.println(p1);
        System.out.println(p2);





    }
}