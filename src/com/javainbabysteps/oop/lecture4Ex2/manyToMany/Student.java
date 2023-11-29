package com.javainbabysteps.oop.lecture4Ex2.manyToMany;

import java.util.ArrayList;

public class Student {
    protected String studentId;
    protected String name;
    protected ArrayList<Course> courseList;

    public Student() {
        this.courseList = new ArrayList<>();
    }

    public void addCourse(Course c){
        this.courseList.add(c);
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public String toString() {
        String result =  "Student{" +
                "studentId='" + studentId + '\'' +
                "name='" + name + '\'' +
                ", has " + courseList.size() +" courses ";
        for(int i=0; i< courseList.size(); i++){
            result = result + "\n course number "+i+
                    " has manufacturer "+courseList.get(i).getName();
        }

        result = result + '}';
        return result;
    }
}
