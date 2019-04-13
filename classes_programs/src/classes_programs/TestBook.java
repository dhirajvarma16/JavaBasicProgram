package classes_programs;

import java.util.*;
public class TestBook{
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        String bname;
        System.out.println("Enter the Book name:");
        bname=sc.next();
        int prce;
        System.out.println("Enter the Price:");
        prce=sc.nextInt();
        String Aname;
        System.out.println("Enter the Author name:");
        Aname=sc.next();
        
        Book bk=new Book(bname,prce,Aname);
        System.out.println("Book Details");
        bk.display();
        
        
    }
}