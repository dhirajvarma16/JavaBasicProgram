package BonusCalculation;

import java.util.Scanner;

public class Main{
	
	int id;
	static Scanner sc=new Scanner(System.in);
	 public void display() {
		 System.out.println("Employee Id:");
		 id=sc.nextInt();
		 
	 }
public static void main(String[] args){
    //Scanner sc=new Scanner(System.in);
    TemporaryEmployee te[]=new TemporaryEmployee[5];
    PermanentEmployee	pe[]=new PermanentEmployee[5];
    int pcount=0,tcount=0;
    System.out.println("Enter the details:");
    System.out.println("Enter the number of Employees:");
    int n=sc.nextInt();
    
    for(int i=1;i<=n; i++){
        System.out.println("Enter the type of Employee:");
        String type=sc.next();
        ++pcount;
        if(type.equalsIgnoreCase("Permanent")){
           pe[i]=new PermanentEmployee();
           System.out.println("Employee Id:");
           int id=sc.nextInt();
           pe[i].setId(id);
           System.out.println("Employee Name");
           String name=sc.next();
           pe[i].setName(name);
           System.out.println("Basic Salary:");
           float basicSal;
           basicSal=sc.nextFloat();
           pe[i].setBasic_salary(basicSal);
           System.out.println("PF:");
           int pef;
           pef=sc.nextInt();
           pe[i].setPf(pef);
           
        }
        else{ 
        	te[i]=new TemporaryEmployee();
        	++tcount;
        	System.out.println("Employee Id:");
            int id=sc.nextInt();
            te[i].setId(id);
            System.out.println("Employee Name:");
            String name=sc.next();
            te[i].setName(name);
            System.out.println("Daily Wages:");
            int DailySal;
            DailySal=sc.nextInt();
            te[i].setDailywages(DailySal);
            System.out.println("No.of days worked:");
            int noofday;
            noofday=sc.nextInt();
            te[i].setNo_of_days(noofday);
        	
        	
          } 
        }
   
        System.out.println("The details are:");
       // PermanentEmployee	pe[]=new PermanentEmployee[pcount];

        for(int i=1;i<=pcount;i++) {
        System.out.println("Employee Id:"+pe[i].getId());
        System.out.println("Employee Name:"+pe[i].getName());
        System.out.println("Basic Salary:"+pe[i].getBasic_salary());
        System.out.println("PF:"+pe[i].getPf());
        System.out.println("Bonus"+pe[i].getBonus());
        System.out.println("Net Salary:"+pe[i].getNet_salary());
        System.out.println("calculateSalary"+pe[i].calculateSalary());
        }
    
    }

    
}

