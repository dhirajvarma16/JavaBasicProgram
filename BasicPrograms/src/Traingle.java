import java.util.*;
class Triangle{
    public static void main(String[] args){
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for side1");
        a=sc.nextInt();
        System.out.println("Enter the value for side2");
        b=sc.nextInt();
        System.out.println("Enter the value for side3");
        c=sc.nextInt();
        int sum1=a+b;
        int sum2=b+c;
        int sum3=c+a;
        if(a<=0|| b <=0 || c <=0){
            System.out.println("Invalid Input");
        }
       else if((sum1>=a)&&(sum2>=b)&&(sum3>=c))
        {
            System.out.println("Sides form a traingle");
        }
        else{
            System.out.println("Sides does not form a traingle");
        }
        }
            }
