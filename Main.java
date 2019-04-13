import java.util.*;
public class Main {
    //int per;
   
    public static Employee getEmployeeDetails(){
        Employee e=new Employee();
        System.out.println("Id: "+ e.getEmployeeId());
        System.out.println("Name: "+ e.getEmployeeName());
        System.out.println("Salary: "+ e.getSalary());
        System.out.println("Net Salary: "+ e.getNetSalary());
        return e;
    }
    
    public static int getPFPercentage(){
    	Scanner sc=new Scanner(System.in);
        int per;
        System.out.println("Enter the PF percentage:");
        per=sc.nextInt();
        
        return per;
        
    }
    
    public static void main(String[] arg){
    	Scanner sc=new Scanner(System.in);
    	int id;
    	 Employee emp=new Employee();
       
     System.out.println("Enter Id:");
     id=sc.nextInt();
     String name;
     System.out.println("Enter name:");
     name=sc.next();
     double sal;
     System.out.println("Enter salary:");
     sal=sc.nextDouble();
    
     //int n;
     //System.out.println("Enter the PF percentage:");
     int n=getPFPercentage();
     emp.setEmployeeId(id);
     emp.setEmployeeName(name);
     emp.setSalary(sal);
     //Employee ep=new Employee();
     emp.calculateNetSalary(n);
     getEmployeeDetails();
     
    }
    
}