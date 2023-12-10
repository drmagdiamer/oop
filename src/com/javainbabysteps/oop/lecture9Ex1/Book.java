package com.javainbabysteps.oop.lecture9Ex1;

import java.util.ArrayList;
import java.util.List;

public abstract class Book {
    protected Library library;
    protected int code;
    protected String title;
    protected List<Student> borrowers;

    public Book() {
        this.borrowers = new ArrayList<>();
    }

    public Book(int code, String title) {
        this();
        this.code = code;
        this.title = title;
    }

    public void addStudent(Student s){
        this.borrowers.add(s);
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Student> getBorrowers() {
        return borrowers;
    }

    public void setBorrowers(List<Student> borrowers) {
        this.borrowers = borrowers;
    }

    @Override
    public String toString() {
        String result =  "Book{" +
                "library" + (library==null?" is null ":"'s name is "+library.getName()) +
                ", code=" + code +
                ", title='" + title + '\'' ;
        result += "\n, was borrowed by "+this.borrowers.size()+" student(s) ";
        for(int i=0; i< this.borrowers.size(); i++){
            result = result + "\n "+(i+1)+
                    " borrower is "+this.borrowers.get(i).getName()+" ["+this.borrowers.get(i).getCode()+"] ";
        }
        result +='}';
        return result;

    }
}
