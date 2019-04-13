package Pfpercalculation;


import java.util.*;
public class Main{
    public static void main(String[] args){
        PermanentEmployee pe=new PermanentEmployee();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name:");
        String name=sc.nextLine();
        pe.setName(name);
        System.out.println("Enter the salary:");
        float salary=sc.nextFloat();
        System.out.println("Enter the pfpercentage:");
        float pfpercentage=sc.nextFloat();
        pe.setPfPecentage(pfpercentage);
        pe.validateInput(pe.getSalary(),pe.getPfPecentage());
        pe.findNetSalary();
        System.out.println("Employee Name:"+pe.getName());
        System.out.println("PF Amount:"+pe.getPfAmount());
        System.out.println("NetSalary:"+pe.getNetsalary());
        
    }
    
}