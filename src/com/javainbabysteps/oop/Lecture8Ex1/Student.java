package com.javainbabysteps.oop.Lecture8Ex1;

public class Student  {
    private char[] name = new char[50];
    public void setName(String aName)
    {  name = aName.toCharArray();   }
    public String getName( )
    {   return (this.name==null)?null:new String(this.name);   }
}

