package BonusCalculation;

public abstract class Employee{
    public abstract float calculateSalary();
    int id;
    private String name;
    private float basic_salary;
    private float bonus;
    private float net_salary;
    
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setBasic_salary(float basic_salary){
        this.basic_salary=basic_salary;
    }
    public float getBasic_salary(){
        return basic_salary;
    }
    public void setBonus(float bonus){
        this.bonus=bonus;
    }
    public float getBonus(){
        return bonus;
    }
    public void setNet_salary(float net_salary){
        this.net_salary=net_salary;
    }
    public float getNet_salary(){
        return net_salary;
    }
    
}