package Inheritence;
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
        pe.setSalary(salary);
        System.out.println("Enter the pfpercentage:");
        float pfpercentage=sc.nextFloat();
        pe.setPfpercentage(pfpercentage);
        pe.validateInput(pe.getSalary(),pe.getPfpercentage());
        pe.findNetSalary();
        if(pe.validateInput(pe.getSalary(),pe.getPfpercentage())==true){
        System.out.println("Employee Name:"+pe.getName());
        System.out.printf("PF Amount:"+"%.2f",pe.getPfamount());
        System.out.println("");
        System.out.printf("NetSalary:"+"%.2f",pe.getNetsalary());
        }
        else{
            System.out.println("Error!!! Unable to calculate the NetSalary.");
        }
    }
    
}