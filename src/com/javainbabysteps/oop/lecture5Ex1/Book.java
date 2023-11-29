package com.javainbabysteps.oop.lecture5Ex1;
public class Book {
    private String title;
    private int id;
    private Category category;

    private Author author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {

            return "Book{" +
                "title='" + title + '\'' +
                ", id=" + id +
                ", category " + ((this.category==null)? "is null ":"'s name is "+this.category.getName())+
                ", author"
                    +((this.author==null)?" is null ":"'s name is"+ author.getFirstName()+" "+author.getFamilyName())

                     +
                '}';

    }
}
