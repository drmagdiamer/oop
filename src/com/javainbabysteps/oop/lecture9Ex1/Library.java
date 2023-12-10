package com.javainbabysteps.oop.lecture9Ex1;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private String code;
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public Library(String name, String code) {
        this();
        this.name = name;
        this.code = code;
    }

    public Library addBook(Book b){
        this.books.add(b);
        return this;
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

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        String result = "Library{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'';
        result += "\n, has "+this.books.size()+" book(s) ";
        for(int i=0; i< this.books.size(); i++){
            result = result + "\n "+(i+1)+
                    " book is "+this.books.get(i).getTitle();
        }
        result +='}';
        return result;
    }
}
