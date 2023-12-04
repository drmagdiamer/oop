package com.javainbabysteps.oop.lecture8Ex3;

public class Person {
    protected String name;
    public void setName(String aName)
    {  name = aName; }
    public String getName( )
    { return name; }

    public void sayHello( )
    {System.out.println("Person "+name+ " is saying Hello"); }

}

