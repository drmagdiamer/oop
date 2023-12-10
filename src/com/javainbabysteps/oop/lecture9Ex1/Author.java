package com.javainbabysteps.oop.lecture9Ex1;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private String code;
    private List<LiteratureBook> literatureBookList;
    private List<ScientificBook> scientificBookList;

    public Author() {
        this.literatureBookList = new ArrayList<>();
        this.scientificBookList = new ArrayList<>();
    }

    public Author(String name, String code) {
        this();
        this.name = name;
        this.code = code;
    }

    public void addLiteratureBook(LiteratureBook lb){
        this.literatureBookList.add(lb);
    }

    public void addScientificBook(ScientificBook sb){
        this.scientificBookList.add(sb);
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

    public List<LiteratureBook> getLiteratureBookList() {
        return literatureBookList;
    }

    public void setLiteratureBookList(List<LiteratureBook> literatureBookList) {
        this.literatureBookList = literatureBookList;
    }

    public List<ScientificBook> getScientificBookList() {
        return scientificBookList;
    }

    public void setScientificBookList(List<ScientificBook> scientificBookList) {
        this.scientificBookList = scientificBookList;
    }

    @Override
    public String toString() {
        String result =  "Author{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'';
        result += "\n, has written "+this.scientificBookList.size()+" scientific book(s) ";
        for(int i=0; i< this.scientificBookList.size(); i++){
            result = result + "\n scientific book "+(i+1)+
                    " title is "+this.scientificBookList.get(i).getTitle();
        }
        result += "\n, and has written "+this.literatureBookList.size()+" literature book(s) ";
        for(int i=0; i< this.literatureBookList.size(); i++){
            result = result + "\n literature book "+(i+1)+
                    " title is "+this.literatureBookList.get(i).getTitle();
        }
        result +=        '}';
        return result;
    }
}
