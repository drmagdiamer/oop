package com.javainbabysteps.oop.lecture3Ex1;
public class Main {
    public static void main(String[] args) {
        Category c1 = new Category();
        //Category c2 = new Category(1, "Novel", "Arabic Novel");
        c1.setId(1);
        c1.setName("Novel");
        c1.setDescription("Arabic Novel");

        System.out.println(c1);
        //System.out.println(c2);

        Author author1 = new Author();
        author1.setFirstName("Tawfeek");
        author1.setFamilyName("El hakeem");
        author1.setNationalId(728632);

        System.out.println(author1);

        Author author2 = new Author("Nageeb", "Mahfooz", 763212);
        System.out.println(author2);

        Book book1 = new Book();
        book1.setTitle("Asfoor Men Elshark");
        book1.setId(11);
        book1.setAuthor(author1);
        book1.setCategory(c1);
        System.out.println(book1);

        Book book2 = new Book();
        book2.setTitle("sookareya");
        book2.setId(10);
        book2.setAuthor(author2);
        book2.setCategory(c1);
        System.out.println(book2);



    }
}