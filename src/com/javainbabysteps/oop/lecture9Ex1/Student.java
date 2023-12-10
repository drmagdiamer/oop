package com.javainbabysteps.oop.lecture9Ex1;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String code;
    private String studentId;
    private List<Book> borrowList;

    public Student() {
        this.borrowList = new ArrayList<>();
    }

    public Student(String name, String code, String studentId) {
        this();
        this.name = name;
        this.code = code;
        this.studentId = studentId;
    }

    public void addBook(Book b){
        this.borrowList.add(b);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public List<Book> getBorrowList() {
        return borrowList;
    }

    public void setBorrowList(List<Book> borrowList) {
        this.borrowList = borrowList;
    }

    @Override
    public String toString() {
        String result = "Student{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", studentId='" + studentId + '\'' ;
        result += "\n, has borrowed "+this.borrowList.size()+" book(s) ";
        for(int i=0; i< this.borrowList.size(); i++){
            result = result + "\n "+(i+1)+
                    " book "+this.borrowList.get(i).getTitle();
        }
                //", borrowList=" + borrowList +
        result += '}';
        return result;
    }
}
