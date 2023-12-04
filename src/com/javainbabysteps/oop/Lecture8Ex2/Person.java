package com.javainbabysteps.oop.Lecture8Ex2;

public class Person {
    static private int counter =0;
    public static  int getCounter() { return counter; }
    protected int id;
    public Person(int anId) {
        counter++;
        id = anId;
        System.out.println("Person with id "+ id+" is the object nb "+counter+
                " that this class has constructed");     }

    public void setId(int id) {
        this.id = id;
    }



    public void setId(float id) {
        this.id = (int)id;
    }

    public void setId(long id) {
        this.id = (int)id;
    }
}
