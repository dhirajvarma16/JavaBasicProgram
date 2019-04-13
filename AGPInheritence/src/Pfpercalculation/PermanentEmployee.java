package Pfpercalculation;

import Inheritence.Employee;

public class PermanentEmployee extends Employee{
    private float pfpercentage;
    private float pfamount;
    
    public void setPfPecentage(float pfpercentage){
        this.pfpercentage=pfpercentage;
    }
    public float getPfPecentage(){
        return pfpercentage;
    }
    public void setPfAmount(float pfamount){
        this.pfamount=pfamount;
    }
    public float getPfAmount(){
        return pfamount;
    }
     boolean flag;
   boolean validateInput(float salary,float pf){
        if(salary>0 && pf>=0){
            flag=true;
        }else{
            flag=false;
        }
		return flag;
    }
   float netsal;
    public void findNetSalary(){
    	System.out.println("flag"+flag);
        if(flag==true){
        pfamount=getSalary()*getPfPecentage()/100;
    
        netsal=getSalary()-getPfAmount();
        setNetsalary(netsal);
        setPfAmount(pfamount);
        }
        else{
            System.out.println("Error!!! Unable to calculate the NetSalary.");
            System.exit(0);
        }
    }
    
    
    
}