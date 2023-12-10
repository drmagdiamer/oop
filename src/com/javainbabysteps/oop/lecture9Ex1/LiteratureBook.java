package com.javainbabysteps.oop.lecture9Ex1;

public class LiteratureBook extends Book {
    private Author author;
    private Category category;

    public LiteratureBook() {
    }

    public LiteratureBook(int code, String title, Author author, Category category) {
        super(code, title);
//        this.code = code;
//        this.title = title;
        this.author = author;
        this.category = category;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        String result =  "LiteratureBook{" +
                "library" + (library==null?" is null ":"'s name is "+library.getName()) +
                ", code=" + code +
                ", title='" + title + '\'' +
                ", author" + (author==null?" is null ":"'s name is "+author.getName()) +
                ", category" + (category==null?" is null ":"'s name is "+category.getName()) ;
        result += "\n, was borrowed by "+this.borrowers.size()+" student(s) ";
        for(int i=0; i< this.borrowers.size(); i++){
            result = result + "\n "+(i+1)+
                    " borrower is "+this.borrowers.get(i).getName()+" ["+this.borrowers.get(i).getCode()+"] ";
        }
        result +='}';
        return result;


    }
}
