package com.javainbabysteps.oop.lecture8Ex3;

public class Student extends Person {
    protected int id;
    public void setId(int anId)
    {  id = anId; }
    public int getId( )
    { return id; }

    public void sayHello( )
    {System.out.println("Student "+name+ " is saying Hello"); }

}
