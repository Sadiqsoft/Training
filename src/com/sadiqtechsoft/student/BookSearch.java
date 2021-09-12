package com.sadiqtechsoft.student;

public class BookSearch {
    
    public static void main(String[] args) {

        BookLibrary bookLibrary1 = new BookLibrary("Himu", "Humayun Ahmed", "Prokash", 1, 1);

        BookLibrary bookLibrary2 = new BookLibrary("Sanchita", "Kazi Nazrul Islam", "Sahitya", 1,2);

        BookLibrary bookLibrary3 = new BookLibrary("Bhumiputra","Imdadul Haq Milon","Anya Prokash",1,3);

        System.out.println("bookLibrary1 Book Name:  "+ bookLibrary1.bookName +"   Author: "+ bookLibrary1.author +"   Publisher:  "+
                bookLibrary1.publisher +"   Self Number: "+ bookLibrary1.selfNumber +"   Row Number: "+ bookLibrary1.rowNumber);

        System.out.println("bookLibrary2 Book Name:  "+ bookLibrary2.bookName +"   Author: "+ bookLibrary2.author +"   Publisher:  "+
                bookLibrary2.publisher +"   Self Number: "+ bookLibrary2.selfNumber +"   Row Number: "+ bookLibrary2.rowNumber);

        System.out.println("bookLibrary3 Book Name:  "+ bookLibrary3.bookName +"   Author: "+ bookLibrary3.author +"   Publisher:  "+
                bookLibrary3.publisher +"   Self Number: "+ bookLibrary3.selfNumber +"   Row Number: "+ bookLibrary3.rowNumber);
    }
}
