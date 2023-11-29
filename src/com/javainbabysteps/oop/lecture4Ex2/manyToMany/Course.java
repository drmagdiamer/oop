package com.javainbabysteps.oop.lecture4Ex2.manyToMany;

import java.util.ArrayList;

public class Course {
    protected String courseId;
    protected String name;
    protected ArrayList<Student> students;

    protected ArrayList<Professor> profList;

    public Course() {
        this.students = new ArrayList<>();
        this.profList = new ArrayList<>();
    }

    public void addStudent(Student s){
        this.students.add(s);
    }

    public void addProfessor(Professor p){
        this.profList.add(p);
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
