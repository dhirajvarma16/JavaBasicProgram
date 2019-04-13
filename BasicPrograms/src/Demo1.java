import java.util.Scanner;

public class Demo1 {
	public static void main(String[] arg){
        String str=null;
        String number;
        Scanner sc=new Scanner(System.in);
        str=sc.next();
        if(str.hasNextInt()) {
        	number=String.valueOf(str).nextInt();
        System.out.print(number);
    }
        else if (str.matches("[A-Za-z]{1}")){
        System.out.print("Upper case");
    }
    else{
        System.out.print("damaged");
    }
}
	   
    } 
