package EmployeeEligibilty;

public class PermanentEmployee extends Employee{
    private int incentive;
    private int netSalary;
    private int eligibleLoanAmount;
    
    public void setIncentive(int incentive){
        this.incentive=incentive;
    }
    public int getIncentive(){
        return incentive;
    }
    public void setNetSalary(int netSalary){
        this.netSalary=netSalary;
    }
    public int getNetSalary(){
        return netSalary;
    }
    public void setEligibleLoanAmount(int eligibleLoanAmount){
     this.eligibleLoanAmount=eligibleLoanAmount;   
    }
    public int getEligibleLoanAmount(){
        return eligibleLoanAmount;
    }
    public void calculateEligibleAmount(){
        netSalary=incentive+salary;
        setNetSalary(netSalary);
        if(netSalary>=50000){
            System.out.println("Maximum eligible loan amount is: 500000");
        }
        else if(netSalary<50000 && netSalary>=30000){
            System.out.println("Maximum eligible loan amount is: 400000");
        }
        else if(netSalary<30000 && netSalary>=15000){
           System.out.println("Maximum eligible loan amount is: 300000"); 
        }
        else{
            System.out.println("Sorry! Bavitha, your salary has not met our requirements.");
        }
        
    }
}