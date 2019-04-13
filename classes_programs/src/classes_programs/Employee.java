package classes_programs;

import java.util.*;
public class Employee{
    private static int employeeId;
    private static String employeeName;
    private static double salary;
    private static  double netSalary;
    
    public static void setEmployeeID(int employeeId){
    	Employee.employeeId=employeeId;
    }
    public static void setEmployeeName(String employeeName){
    	Employee.employeeName=employeeName;
    }
    public static void setEmployeeSalary(double salary){
    	Employee.salary=salary;
    }     
    public static int getEmployeeId(){
        return employeeId;
    }
    public static String getEmployeeName(){
        return employeeName;
    }
    
    public static double getSalary(){
        return salary;
    }
        public void calculateNetSalary(int pfpercentage)
        {
        	netSalary=getSalary()-getSalary()*pfpercentage/100;
    }
    public static double getEmployeeNet(){
        return netSalary;
    }
    
    /*public static Employee getEmployeeDetails() {
    	System.out.println("Id :"+ employeeId);
    	System.out.println("Name :"+ employeeName);
    	System.out.println("salary :"+ salary);
    	System.out.println("salary :"+ netSalary);
    	return null;
    }*/
    
    
    }