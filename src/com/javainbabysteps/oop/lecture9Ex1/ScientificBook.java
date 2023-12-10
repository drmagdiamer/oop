package com.javainbabysteps.oop.lecture9Ex1;

import java.util.ArrayList;
import java.util.List;

public class ScientificBook extends Book{
    List<Author> authors;

    public ScientificBook() {
        this.authors = new ArrayList<>();
    }

    public ScientificBook(int code, String title) {
        super(code, title);
        this.authors = new ArrayList<>();
    }

    public void addAuthor(Author a){
        this.authors.add(a);
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        String result =  "ScientificBook{" +
                "library" + (library==null?" is null ":"'s name is "+library.getName()) +
                ", code=" + code +
                ", title='" + title + '\'' ;
        result += "\n, was written by "+this.authors.size()+" author(s) ";
        for(int i=0; i< this.authors.size(); i++){
            result = result + "\n "+(i+1)+
                    " author is "+this.authors.get(i).getName();
        }
        result += "\n, was borrowed by "+this.borrowers.size()+" student(s) ";
        for(int i=0; i< this.borrowers.size(); i++){
            result = result + "\n "+(i+1)+
                    " borrower is "+this.borrowers.get(i).getName()+" ["+this.borrowers.get(i).getCode()+"] ";
        }
        result +='}';
        return result;
    }
}
