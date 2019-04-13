package BonusCalculation;

public class PermanentEmployee extends Employee
{
    private int pf;
    public void setPf(int pf){
        this.pf=pf;
    }
    public int getPf(){
        return pf;
    }
    float new_bonus,NetSalary;
    public float calculateSalary(){
        
         if(getPf()<1000)
         {
             new_bonus=(float) (getBasic_salary()*0.1);
             setBonus(new_bonus);
         }
         else if(getPf()>=1000 && getPf()<1500)
         {
          new_bonus=(float) (getBasic_salary()*0.115);
          //System.out.println("new Bonus"+new_bonus);
          setBonus(new_bonus);   
         }
         else if(getPf()>=1500 && getPf()<1800)
         {
          new_bonus=(float) (getBasic_salary()*0.12);
          setBonus(new_bonus);   
         }
          else if(getPf()>=1800)
         {
          new_bonus=(float) (getBasic_salary()*0.15);
          setBonus(new_bonus);   
         }
         NetSalary=getBasic_salary()-getPf();
         setNet_salary(NetSalary);
		return NetSalary;
        
    }
    
    
}