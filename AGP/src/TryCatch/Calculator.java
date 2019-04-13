package TryCatch;

import java.util.*;
public class Calculator{
   static int a,b;
   static  int c;
    static char op;
    static Scanner sc=new Scanner(System.in);
    public static int getNumber() throws InputMismatchException
    {
        System.out.print("Enter the first Number:");
        a=sc.nextInt();
        System.out.print("Enter the second Number:");
        b=sc.nextInt();
        //throw new InputMismatchException("Sorry You have entered an Invalid number");
        return a;
        
        }
    public static char getOperator() throws InvalidOperatorException
    {
        System.out.print("Enter the Operator(+,-,*,/):");
        return op=sc.next().charAt(0);
        
        //throw new InputMismatchException("Sorry You have entered an Invalid Operator");
        
    }
    public static int calculateResult(int num1, int num2,char operator) throws ArithmeticException{
         
         switch(op){
        
        case '+':{
            c=a+b ;
            System.out.println("The Answer is: "+c);
            break;
        }
        case  '-':{
            if (a>b){
                c=a-b;
                System.out.println("The Answer is: "+c);
                }
            else{
                c=b-c;
                System.out.println("The Answer is: "+c);
                
            }
            break;
        }
        case '*':
        {
            c=a*b;
            System.out.println("The Answer is: "+c);
            break;
        }
        case '/':{
            if(b==0)
            {
                
                throw new ArithmeticException("Sorry! Division By Zero is not Possible");
                }
            else
            {
            c=a/b;
            System.out.println("The Answer is: "+c);
            }
            break;
        }
        default :{
            System.out.println("Sorry You have entered  Invalid Operator");
            break;
        }
        
}   return 0;
    }
    public static void main(String[] args){
          //Calculator cal=new Calculator();
         try{
             getNumber();
         }catch(InputMismatchException e){
               System.out.println("Sorry You have entered an Invalid number");            
         }
         try {
             getOperator();
         }catch(InvalidOperatorException e){
               System.out.println("Sorry You have entered an Invalid number");            
         }
         try{
             calculateResult(a,b,op);
         }catch(ArithmeticException e){
             System.out.println("Sorry! Division By Zero is not Possible");
         }
    }}
//}