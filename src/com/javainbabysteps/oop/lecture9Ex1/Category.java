package com.javainbabysteps.oop.lecture9Ex1;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String name;
    private String code;
    private String description;
    private List<LiteratureBook> books;

    public Category() {
        this.books = new ArrayList<>();
    }

    public Category(String name, String code, String description) {
        this();
        this.name = name;
        this.code = code;
        this.description = description;
    }

    public void addLiteratureBook(LiteratureBook lb){
        this.books.add(lb);
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<LiteratureBook> getBooks() {
        return books;
    }

    public void setBooks(List<LiteratureBook> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        String result =  "Category{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", description='" + description + '\'' ;
        result += "\n, include "+this.books.size()+" book(s) ";
        for(int i=0; i< this.books.size(); i++){
            result = result + "\n "+(i+1)+
                    " book is "+this.books.get(i).getTitle();
        }
        result +='}';
        return result;
    }
}
