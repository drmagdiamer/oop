package com.javainbabysteps.oop.lecture9Ex1;



public class MyApp {
    public static void main(String[] args) {
        Library library = new Library("Cairo University's Library", "LB001");

        Category novel = new Category("Novel", "C001", "Literature's Novel");
        Category history = new Category("History", "C002", "History Book");

        Author a1 = new Author("Tawfeek Elhakim", "L001");
        Author a2 = new Author("Nagueeb Mahfooz", "L002");
        Author a3 = new Author("Dr. Magdi Amer", "L003");

        Student s1 = new Student("Tom", "s001", "ST123");
        Student s2 = new Student("Jack", "s002", "ST302");

        LiteratureBook lb1 = new LiteratureBook( 1, "Awdat Elroh", a1, novel);
        novel.addLiteratureBook(lb1);
        a1.addLiteratureBook(lb1);
        LiteratureBook lb2 = new LiteratureBook( 2, "Ahl Elkahf", a1, novel);
        novel.addLiteratureBook(lb2);
        a1.addLiteratureBook(lb2);
        LiteratureBook lb3 = new LiteratureBook( 3, "Been Elkasreen", a2, novel);
        novel.addLiteratureBook(lb3);
        a2.addLiteratureBook(lb3);
        LiteratureBook lb4 = new LiteratureBook( 4, "Kasr Elshook", a2, novel);
        novel.addLiteratureBook(lb4);
        a2.addLiteratureBook(lb4);

        ScientificBook sb = new ScientificBook(101, "Java in baby steps");
        sb.addAuthor(a3);
        a3.addScientificBook(sb);

        library.addBook(lb1).addBook(lb2).addBook(lb3).addBook(lb4).addBook(sb);
        lb1.setLibrary(library);
        lb2.setLibrary(library);
        lb3.setLibrary(library);
        lb4.setLibrary(library);
        sb.setLibrary(library);

        s1.addBook(lb1);
        lb1.addStudent(s1);
        s1.addBook(sb);
        sb.addStudent(s1);
        s2.addBook(sb);
        sb.addStudent(s2);

        System.out.println(library);
        System.out.println("***************");
        System.out.println(s1);
        System.out.println("***************");
        System.out.println(s2);
        System.out.println("***************");
        System.out.println(a1);
        System.out.println("***************");
        System.out.println(a2);
        System.out.println("***************");
        System.out.println(a3);
        System.out.println("***************");
        System.out.println(lb1);
        System.out.println("***************");
        System.out.println(lb2);
        System.out.println("***************");
        System.out.println(lb3);
        System.out.println("***************");
        System.out.println(lb4);
        System.out.println("***************");
        System.out.println(sb);
        System.out.println("***************");
        System.out.println(novel);
        System.out.println("***************");
        System.out.println(history);



    }
}
