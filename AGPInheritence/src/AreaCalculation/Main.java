package AreaCalculation;

import java.util.Scanner;
public class Main
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the shape :");
        String shape;
        shape=sc.next();
        if(shape.equalsIgnoreCase("Circle"))
        {
            Circle cr=new Circle();
            System.out.println("Enter the radius :");
            int r=sc.nextInt();
            cr.setRadius(r);
            cr.calculateArea();
            System.out.println("The area of Circle is : "+cr.calculateArea());
        }
        else if(shape.equalsIgnoreCase("Rectangle"))
        {
         Ractangle rec=new Ractangle();   
         System.out.println("Enter the width :");
         int wd=sc.nextInt();
         System.out.println("Enter the height :");
         int hgt=sc.nextInt();
         rec.setWidth(wd);
         rec.setHeight(hgt);
         System.out.println("The area of Rectangle is :"+ rec.calculateArea());
        }else{
            Triangle Tr=new Triangle();   
         System.out.println("Enter the base :");
         int bs=sc.nextInt();
         System.out.println("Enter the height :");
         int hg=sc.nextInt();
         Tr.setBase(bs);
         Tr.setHeight(hg);
         System.out.println("The area of Rectangle is :"+ Tr.calculateArea());
        }
    
        
    }
}