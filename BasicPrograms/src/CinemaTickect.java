import java.text.DecimalFormat;
import java.util.Scanner;
public class CinemaTickect{
    public static void main(String args[]){
        int n,num,num1;
        int k=75,q=150,r=50;
        char a,b,c;
        double value1=0,value2=0,tickectCost=0,tickectCost1=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of ticket:");
        n=sc.nextInt();
        if(n>=5 && n<=40){
            System.out.print("Do you want refreshment:");
            a=sc.next().charAt(0);
            System.out.print("Do you want coupon code:");
            b=sc.next().charAt(0);
            System.out.print("Enter the cicle:");
            c=sc.next().charAt(0);
            num=n*k;
            num1=n*q;
            int s=r*n;
            if(c=='k'||c=='q'){
                if(c=='k'){
                    value1=num;
                }
                else{
                    value1=num1;
                }
            if(n>=20){
                value2=(value1-(value1*10/100));
            }
            else{
                value2=value1;
            }
            if(b=='y'){
                tickectCost=(value2-(value2*2/100));
            }
            else{
                tickectCost=value2;
            }
            if(a=='y'){
                tickectCost1=tickectCost+n*50;
            }
            else{
                tickectCost1=tickectCost;
            }
            double x=tickectCost1;
            DecimalFormat df=new DecimalFormat("#.00");
            System.out.println("Ticket cost:"+(df.format(x/100.0)));
            }
            else{
                System.out.print("Invalid input");
            }}
            else{
                System.out.print("Minimum of 5 and Maximimum of 40 Tickects");
            }
        }
    }

