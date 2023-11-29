package com.javainbabysteps.oop.lecture5Ex1;
import java.util.ArrayList;

public class Author {
    private String firstName;
    private String familyName;
    private int nationalId;

    private ArrayList<Book> books;

    public Author() {
        this.books = new ArrayList<>();
    }

    public Author(String firstName, String familyName, int nationalId) {
        this();
        this.firstName = firstName;
        this.familyName = familyName;
        this.nationalId = nationalId;
    }

    public void addBook(Book b){
        this.books.add(b);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public int getNationalId() {
        return nationalId;
    }

    public void setNationalId(int nationalId) {
        this.nationalId = nationalId;
    }

    @Override
    public String toString() {
        String result =  "Author{" +
                "firstName='" + firstName + '\'' +
                ", familyName='" + familyName + '\'' +
                ", nationalId=" + nationalId ;
        result = result + ", has " + books.size() +" books ";
        for(int i=0; i< books.size(); i++){
            result = result + "\n Book number "+i+
                    " is "+books.get(i).getTitle();
        }
        return result;
    }
}
