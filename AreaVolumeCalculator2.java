import java.text.DecimalFormat;
import java.util.*;
public class AreaVolumeCalculator2{
    private static double length;
    private static double heigth;
    private static double breadth;
    
   public  AreaVolumeCalculator2(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
   public AreaVolumeCalculator2(double length,double heigth,double breadth){
        this.length=length;
        this.heigth=heigth;
        this.breadth=breadth;
    }
    public double getLength(){
        return length;
    }
    
    public double getHeigth(){
        return heigth;
    }
    
    public double getBreadth(){
        return breadth;
    }
    public double calculateArea(){
        return getLength()*getBreadth();
    }
    public double calculateVolume(){
        return getLength()*getBreadth()*getHeigth();
    }
    public static void main(String[] args){
        //AreaVolumeCalculation avc=new AreaVolumeCalculation();
        DecimalFormat df=new DecimalFormat("#.00");
        Scanner sc=new Scanner(System.in);
        System.out.println("Area/Volume Calculator");
        System.out.println("1. Calculate Area of Rectangle");
        System.out.println("2. Calculate Volume of Cuboid");
        System.out.println("Enter your choice");
        double length,breadth,heigth;
        int no=sc.nextInt();
        if(no==1){
            System.out.println("Enter length");
            length=sc.nextDouble();
            System.out.println("Enter breadth");
            breadth=sc.nextDouble();
           AreaVolumeCalculator2 avc1=new AreaVolumeCalculator2(length,breadth);
            System.out.println("Area of the Rectangle is "+df.format(avc1.calculateArea()));
            }
        else if(no==2){
            System.out.println("Enter length");
            length=sc.nextDouble();
            System.out.println("Enter heigth");
            heigth=sc.nextDouble();
            System.out.println("Enter breadth");
            breadth=sc.nextDouble();
            AreaVolumeCalculator2 avc1=new AreaVolumeCalculator2(length,heigth,breadth);
            System.out.println("len"+avc1.getLength());
            System.out.println("height"+avc1.getHeigth());
            System.out.println("breadth"+avc1.getBreadth());
            System.out.println("Volume of Cuboid is "+ avc1.calculateVolume());
        }
        else {
            System.out.println("Invalid Choice");
        }
    }
    
}