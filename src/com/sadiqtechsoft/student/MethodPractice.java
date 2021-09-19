package com.sadiqtechsoft.student;

public class MethodPractice {
    public static void main(String[] args) {

        bookname();
        author();
        publisher();
        publisheddate();
        price(19, 1);

    }

    public static void bookname() {
        System.out.println("Book Name:" + " " + "Sanchita");
    }

    public static void author() {
        System.out.println("Author:" + " " + "Kazi Nazrul Islam");
    }

    public static void publisher() {
        System.out.println("Publisher:" + " " + "Sahitya Sambhar");
    }

    public static void publisheddate() {
        System.out.println("Published Date:" + " " + "Boishakh 1428");
    }

    public static void price(int a, int b) {
        System.out.println("Book Price with Tax:" + " " + (a + b));

    }

}


