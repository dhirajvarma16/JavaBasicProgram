import java.util.Scanner;
public class Item {

	public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
          String str=null;
          str=sc.next();
          if(str.matches("[A-Z]{1}")) {
        	  System.out.print("Lower case");
          }
          else if(str.matches("[a-z]{1}")) {
        	  System.out.println("Upper case");
          }
          else if(str.matches("[0-9]{1}")) {
        	  System.out.println("digit");
          }
          else {
        	  System.out.println("damaged");
          }
          
	}

}
