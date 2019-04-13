import java.util.*;

public class Main extends Employee{
    
	static double salary=0;
    public static Employee getEmployeeDetails(){
          Employee emp=new Employee();
          Scanner sc=new Scanner(System.in);
          String empname;
          int id;
          //double salary=0;
          System.out.println("Enter id:");
          id=sc.nextInt();
          emp.setEmployeeId(id);
          System.out.println("Enter Name:");
          empname=sc.next();
          emp.setEmployeeName(empname);
          System.out.println("Enter salary:");
          salary=sc.nextDouble();
          emp.setEmployeeSalary(salary);
        
          System.out.println("Id:"+id);
          System.out.println("Name:"+empname);
          System.out.println("Salary:"+salary);
		return emp;
       

    }
public static   int getPFPercentage(){
	         Employee emp=new Employee();
             Scanner sc=new Scanner(System.in);
             int pernet,netpay=0;
             System.out.println("Enter PF percentage:");
             pernet=sc.nextInt();
             //System.out.println("salary"+ emp.setEmployeeSalary(salary) );
             int sum=(int) (emp.setEmployeeSalary(salary)*pernet/100);
             netpay=(int)(emp.setEmployeeSalary(salary)- sum);
             System.out.println("Sum :"+sum );
             System.out.println("NetPay:"+netpay);
	         return 0;
    
}  
public static void main(String[] args) {
	getEmployeeDetails();
	getPFPercentage();
	
}
    
}