package com.javainbabysteps.oop.lecture4Ex2.manyToMany;

public class MyMain {
    public static void main(String[] args) {
        Course c1 = new Course();
        c1.setName("OOP");

        Course c2 = new Course();
        c2.setName("Database");

        Student s1 = new Student();
        s1.setStudentId("12");
        s1.setName("Ahmed");

        Student s2 = new Student();
        s2.setStudentId("15");
        s2.setName("Morcos");

        c1.addStudent(s1);
        s1.addCourse(c1);

        c1.addStudent(s2);
        s2.addCourse(c1);

        c2.addStudent(s1);
        s1.addCourse(c2);

        System.out.println(s1);
        System.out.println(s2);
    }
}
