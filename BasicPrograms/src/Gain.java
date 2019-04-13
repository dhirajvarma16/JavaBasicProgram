import java.text.DecimalFormat;
import java.util.*;
class Gain{
    public static void main(String[] args){
        long price,repair, soldprice=0, profit=0, totalcost;
        float gain2,loss;
        Scanner sc=new Scanner(System.in);
        System.out.println("Price of old scooter:");
        price=sc.nextLong();
        System.out.println("The amount spent for repair:");
        repair=sc.nextLong();
        totalcost=price+repair;
        System.out.println("Sold Price:");
        soldprice=sc.nextLong();
        profit=soldprice-totalcost;
        if((price<=0)||(soldprice<=0)||(repair<0))
        {
        System.out.println("Incorect Inputs");    
        }
        else if(soldprice<=totalcost){
            System.out.println("Unable to calculate Gain Percentage");
        }
       else{
        double gain=0;
    	   //gain2=(float)(profit*100)/totalcost;
       // DecimalFormat df2=new DecimalFormat(".##"); 
        //gain2=(float)(profit*100)/totalcost;
       gain=((soldprice-(totalcost))/(totalcost))*100;
       String numberAsString=String.format("%.2f",gain);
       System.out.printf("Gain percentage is"+" "+ numberAsString);
       }
}}