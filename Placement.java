import java.util.Scanner;

class Placement{

    public static void main(String[] args){

        int num1,num2,num3;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no of students placed in CSE:");

        num1 = sc.nextInt();

        System.out.println("Enter the no of students placed in ECE:");

        num2 = sc.nextInt();

        System.out.println("Enter the no of students placed in MECH:");

        num3 = sc.nextInt();

        if(num1<0 || num2<0 || num3<0 )

         {

          System.out.println("Input is invalid");

         }

        else if(num1==num2 && num2==num3 && num3==num1)

        {

            System.out.println("None of the department has got the highest placement");

        }

        //Highest calculation

        else if(num1==num2)

        {

           System.out.println("Highest placement");

           System.out.println("CSE"); 

           System.out.println("ECE"); 

        }

        else if(num2==num3)

        {

           System.out.println("Highest placement");

           System.out.println("ECE"); 

           System.out.println("MECH"); 

        }

        else if(num3==num1)

        {

           System.out.println("Highest placement");

           System.out.println("CSE"); 

           System.out.println("MECH"); 

        }

        else if(num1>num2 && num1>num3)

         {

             System.out.println("Highest placement");

             System.out.println("CSE");

         }

        else if(num2>num1 && num2>num3)

         {

            System.out.println("Highest placement");

            System.out.println("ECE");

         }

        else

         {

             System.out.println("Highest placement");

             System.out.println("MECH");

         }

    }

}