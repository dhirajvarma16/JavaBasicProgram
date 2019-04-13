import java.util.*;

class Customer{
    public static void main(String[] agrs){
    String name,gender,City;
    int age;
    Scanner in= new Scanner(System.in);
    Scanner line= new Scanner(System.in);
    System.out.println("");
    System.out.print("Enter your name:");
    name= in.next();
    System.out.print("Enter age:");
    age=in.nextInt();
    System.out.print("Enter gender:");
    gender = in.next();
    System.out.print("Hailing from:");
    City = line.nextLine();
    System.out.println();
    System.out.println("Welcome,"+""+name+"!");
    System.out.println("Age:"+age);
    System.out.println("Gender:"+gender);
    System.out.println("City:"+City);
    
    
        
    
    
    } 
    
}