package BonusCalculation;

public class TemporaryEmployee extends Employee{
    private int dailywages;
    private int no_of_days;
    public void setDailywages(int dailywages){
        this.dailywages=dailywages;
    }
    public float getDailywages(){
        return dailywages;
    }
    public void setNo_of_days(int no_of_days){
        this.no_of_days=no_of_days;
    }
    public int getNo_of_days()
    {
        return no_of_days;
    }
    public float calculateSalary(){
        float new_bonus,NetSalary;
         if(getDailywages()<1000)
         {
             new_bonus=(float) (getBasic_salary()*0.1);
             setBonus(new_bonus);
         }
         else if(getDailywages()>=1000 && getDailywages()<1500)
         {
          new_bonus=(float) (getBasic_salary()*0.115);
          setBonus(new_bonus);   
         }
         else if(getDailywages()>=1500 && getDailywages()<1800)
         {
          new_bonus=(float) (getBasic_salary()*0.12);
          setBonus(new_bonus);   
         }
          else if(getDailywages()>=1800)
         {
          new_bonus=(float) (getBasic_salary()*0.15);
          setBonus(new_bonus);   
         }
         NetSalary=(float)getDailywages()*getNo_of_days();
         setNet_salary(NetSalary);
		 return NetSalary;
        
    }
    public String toString() {
        return "Employee Id=" + getId();
    }
}