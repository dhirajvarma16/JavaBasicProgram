package Inheritence;

public class Employee{
    private String name;
    private float salary;
    private float netsalary;
    
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setSalary(){
        this.salary=salary;
    }
    public void setSalary(float salary){
        this.salary=salary;
    }
    public float getSalary(){
        return salary;
    }
    public void setNetsalary(float netsalary){
        this.netsalary=netsalary;
    }
    public float getNetsalary(){
        return netsalary;
    }
}