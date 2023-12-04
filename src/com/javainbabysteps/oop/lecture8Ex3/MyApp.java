package com.javainbabysteps.oop.lecture8Ex3;

public class MyApp
{
    public static void main(String[] args)
    {
        Person p1;
        p1 = new Person();
        p1.setName("Mina");
        Student s1 = new Student();
        s1.setName("Said");
        s1.setId(5);
        Person p2 = new Student();
        p2.setName("ahmed");
        //p2.setId(4); //illegal

        Student  s2 = (Student) p2;
        s2.setId(15);
        System.out.println();

//        Student  s3 = (Student) p1;
//        s3.setId(15);
//        System.out.println();

        p1.sayHello();
        s1.sayHello();
        p2.sayHello();
        s2.sayHello();
    }
}

