package com.javainbabysteps.oop.lecture4Ex2.manyToMany;

import java.util.ArrayList;

public class Professor {

    private String name;
    private ArrayList<Course> courses;

    public Professor() {
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course c){
        this.courses.add(c);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
}
