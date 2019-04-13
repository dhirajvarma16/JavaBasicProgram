import java.text.DecimalFormat;
import java.util.*;
public class AreaVolumeCalculator{
    private static double length;
    private static double heigth;
    private static  double breadth;
    public AreaVolumeCalculator(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public AreaVolumeCalculator(double length,double breadth,double heigth){
        this.length=length;
        this.breadth=breadth;
        this.heigth=heigth;
        
    }
    public  double getLength(){
        return length;
    }
    
    public double getHeigth(){
        return heigth;
    }
    
    public  double getBreadth(){
        return breadth;
    }
    public  double calculateArea(){
        return getLength()*getBreadth();
    }
    public  double calculateVolume(){
        return getLength()*getBreadth()*getHeigth();
    }
    public static void main(String[] args){
    	//AreaVolumeCalculator avc=new AreaVolumeCalculator();
        Scanner sc=new Scanner(System.in);
        System.out.println("Area/Volume Calculator");
        System.out.println("1.Calculate Area of Rectangle");
        System.out.println("2.Calculate Volume of Cuboid");
        int no1;
        double length,breadth,heigth;
        DecimalFormat df=new DecimalFormat("#.00");
        int no=sc.nextInt();
        do {
        	System.out.println("Enter your choice");
        	no1=sc.nextInt();
       
        if(no1==1){
            System.out.println("Enter lenght");
            length=sc.nextDouble();
            System.out.println("Enter breath");
            breadth=sc.nextDouble();
            AreaVolumeCalculator avc1=new AreaVolumeCalculator(length,breadth);
            System.out.println("Get lenght is "+ avc1.getLength());
            System.out.println("Area of Rectangle is "+df.format(avc1.calculateArea()));
            }
        else if(no1==2){
            System.out.println("Enter lenght");
            length=sc.nextDouble();
            System.out.println("Enter height");
            heigth=sc.nextDouble();
            System.out.println("Enter breath");
            breadth=sc.nextDouble();
            AreaVolumeCalculator avc2=new AreaVolumeCalculator(length,heigth,breadth);
            System.out.println("Volume of Cuboid is "+df.format(avc2.calculateVolume()));
        }
        else {
            System.out.println("Invalid Choice");
            
        }
        }
        while(no1!= 1 || no1!= 2);
    }
	
}