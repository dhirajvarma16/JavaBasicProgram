import java.text.DecimalFormat;
import java.util.*;
class CarDetails{
static Scanner sc;

public static void main(String[] args){
       String name;
       int number;
       float price;
       sc = new Scanner(System.in);
       //DecimalFormat df2=new DecimalFormat(".##"); 
       System.out.println("Enter the car name:");
       name=sc.nextLine();
       System.out.println("Enter the car no:");
       number=sc.nextInt();
       System.out.println("Enter the price:");
       price=sc.nextFloat();
       DecimalFormat df=new DecimalFormat("#.00");
       System.out.println("Carname:"+name);
       System.out.println("Carno:"+number);
       //String numberAsString= String.format("%.2f",price);
       //System.out.printf("Price:"+numberAsString+" rs only");
      System.out.println("Price:"+df.format(price)+" rsonly");
}
    
}