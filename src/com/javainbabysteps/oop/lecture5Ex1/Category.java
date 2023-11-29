package com.javainbabysteps.oop.lecture5Ex1;
import java.util.ArrayList;

public class Category {
    private int id;
    private String name;
    private String description;

    private ArrayList<Book> books;

    public Category() {
        this.books = new ArrayList<>();
    }

    public Category(int id, String name, String description) {
        this.books = new ArrayList<>();
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public void addBook(Book b){
        this.books.add(b);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        String result =  "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\''  ;
        result = result + ", has " + books.size() +" books ";
        for(int i=0; i< books.size(); i++){
            result = result + "\n Book number "+i+
                    " is "+books.get(i).getTitle();
        }
        return result;
    }
}
