import java.text.DecimalFormat;
import java.util.*;
public class AreaVolumeCalculator{
    private double length;
    private double height;
    private double breadth;
    
   public  AreaVolumeCalculator(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
   public AreaVolumeCalculator(double length,double height,double breadth){
        this.length=length;
        this.height=height;
        this.breadth=breadth;
    }
    public double getLength(){
        return length;
    }
    
    public double getHeight(){
        return height;
    }
    
    public double getBreadth(){
        return breadth;
    }
    public double calculateArea(){
        return getLength()*getBreadth();
    }
    public double calculateVolume(){
        return getLength()*getBreadth()*getHeight();
    }
    public static void main(String[] args){
        //AreaVolumeCalculation avc=new AreaVolumeCalculation();
        DecimalFormat df=new DecimalFormat("#.00");
        Scanner sc=new Scanner(System.in);
        System.out.println("Area/Volume Calculator");
        System.out.println("1. Calculate Area of Rectangle");
        System.out.println("2. Calculate Volume of Cuboid");
        System.out.println("Enter your choice");
        double length,breadth,height;
        int no=sc.nextInt();
        
        while(no!=1 && no !=2){
        	 	System.out.println("Invalid Choice");
        	no=sc.nextInt();
        	continue;
        	
        }
        if(no==1){
            System.out.println("Enter length");
            length=sc.nextDouble();
            
            System.out.println("Enter breadth");
            breadth=sc.nextDouble();
            if(length<=0 || breadth<=0){
                System.out.println("Invalid Input");
                //System.exit(0);
            }else{
           AreaVolumeCalculator avc1=new AreaVolumeCalculator(length,breadth);
            System.out.println("Area of the Rectangle is "+df.format(avc1.calculateArea()));
            }}
        else if(no==2){
            System.out.println("Enter length");
            length=sc.nextDouble();
            System.out.println("Enter breadth");
            breadth=sc.nextDouble();
            System.out.println("Enter height");
            height=sc.nextDouble();
            if(length<=0 || breadth<=0 || height<=0){
                System.out.println("Invalid Input");
                //System.exit(0);
            }else{
            AreaVolumeCalculator avc1=new AreaVolumeCalculator(length,height,breadth);
            System.out.println("Volume of Cuboid is "+ df.format(avc1.calculateVolume()));
        }}
        else{
            System.out.println("Invalid Choice");
        }
    }
    
}