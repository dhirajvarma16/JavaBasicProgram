package CompareProject;
import java.util.*;
public class Main extends Customer{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Customer ct1=new Customer();
        System.out.println("Enter the name:");
        String name;
        name=sc.next();
        ct1.setName(name);
        System.out.println("Enter the panno:");
        String panno;
        panno=sc.next();
        ct1.setPanno(panno);
        System.out.println("Enter the emailid:");
        String emailid;
        emailid=sc.next();
        ct1.setEmailid(emailid);
        System.out.println("Enter the Salary:");
        int salary;
        salary=sc.nextInt();
        ct1.setSalary(salary);
        
        Customer ct2=new Customer();
        System.out.println("Enter the name:");
        String name2;
        name2=sc.next();
        ct2.setName(name2);
        System.out.println("Enter the panno:");
        String panno2;
        panno2=sc.next();
        ct2.setPanno(panno2);
        System.out.println("Enter the emailid:");
        String emailid2;
        emailid2=sc.next();
        ct2.setEmailid(emailid2);
        System.out.println("Enter the Salary:");
        int salary2;
        salary2=sc.nextInt();
        ct2.setSalary(salary2);
        
        if(ct1.getEmailid().equals(ct2.getEmailid()) && ct1.getPanno()ct2.getPanno())
        {
         System.out.println("Both the objects are equal.");
            
        }
        else{
            System.out.println("Both the objects are not equal.");
        }
        
    }
}