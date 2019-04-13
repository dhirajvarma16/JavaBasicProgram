package classes_programs;

import java.util.*;
public class Main{
	public static Employee getEmployeeDetails(){
        System.out.println("Enter Id: "+ Employee.getEmployeeId());
        System.out.println("Enter Name: "+ Employee.getEmployeeName());
        System.out.println("Enter Salary: "+Employee.getSalary());
        System.out.println("Net Salary: "+ Employee.getEmployeeNet());
        return null;
    }
public static void main(String[] arg) {
	Scanner sc=new Scanner(System.in);
    int id;
    System.out.println("Enter Id:");
    id=sc.nextInt();
	String name;
    System.out.println("Enter name:");
    name=sc.next();
    double sal;
    System.out.println("Enter salary:");
    sal=sc.nextDouble();
    int n;
    System.out.println("Enter the PF percentage:");
    n=sc.nextInt();
    
    Employee.setEmployeeID(id);
    Employee.setEmployeeName(name);
    Employee emp=new Employee();
    Employee.setEmployeeSalary(sal);
    emp.calculateNetSalary(n);
    getEmployeeDetails();
    
    
}
    
}