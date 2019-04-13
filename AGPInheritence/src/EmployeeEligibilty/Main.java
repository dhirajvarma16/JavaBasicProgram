package EmployeeEligibilty;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        PermanentEmployee pe=new PermanentEmployee();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the details:");
        int empid;
        System.out.println("Employee Id:");
        empid=sc.nextInt();
        
        System.out.println("Employee Name:");
        String name;
        name=sc.next();
        
        System.out.println("Age:");
        int age;
        age=sc.nextInt();
       
        System.out.println("Basic Salary:");
        int salary;
        salary=sc.nextInt();
        System.out.println("Incentive:");
        int incentive;
        incentive=sc.nextInt();
        pe.setIncentive(incentive);
        
        System.out.println("The details are:");
        System.out.println("Employee Id:"+pe.empid);
        System.out.println("Employee Name:"+pe.name);
        System.out.println("Age:"+pe.age);
        System.out.println("Basic Salary:"+pe.salary);
        System.out.println("Incentive:"+pe.getIncentive());
        System.out.println("Total Salary:"+pe.getNetSalary());
        pe.calculateEligibleAmount();
        
        
        
    }
}