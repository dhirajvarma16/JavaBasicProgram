package Inheritence;

public class PermanentEmployee extends Employee{
    private float pfpercentage;
    private float pfamount;
    
    public void setPfpercentage(float pfpercentage){
        this.pfpercentage=pfpercentage;
    }
    public float getPfpercentage(){
        return pfpercentage;
    }
    public void setPfamount(float pfamount){
        this.pfamount=pfamount;
    }
    public float getPfamount(){
        return pfamount;
    }
boolean flag;
 public boolean validateInput(float salary,float pf){
        if(salary>0 && pf>=0)
        {
            flag=true;
        }else{
            flag=false;
        }
        return flag;
    }
    float netsal;
    public void findNetSalary(){
        //if(flag==false){
            //System.out.println("Error!!! Unable to calculate the NetSalary.");
              
        
        /*pfamount=getSalary()*getPfpercentage()/100;
        netsal=getSalary()-getPfamount();
        setNetsalary(netsal);
        setPfamount(pfamount);*/
        //}
        //else{
            //System.out.println("Error!!! Unable to calculate the NetSalary.");
        pfamount=getSalary()*getPfpercentage()/100;
        netsal=getSalary()-getPfamount();
        setNetsalary(netsal);
        setPfamount(pfamount);
           
        //}
    }
   
}