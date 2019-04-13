import java.util.*;
class Count{
    
      public static void main(String[] arg){
    
    	  Scanner keyboard=new Scanner(System.in);
    	  String name;
    	  System.out.println("Enter name:");
    	  name = keyboard.nextLine();
    	  if (!name.matches("[A-Z_]+")) {
    	      System.out.println("Invalid name");
    	  }
    	  String number;
    	  System.out.println("Enter number:");
    	  number = keyboard.nextLine();
    	  if (!number.matches("[0-9]+")) {
    	      System.out.println("Invalid number");
    	  }
    }
    
    }
