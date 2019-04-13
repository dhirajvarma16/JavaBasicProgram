import java.util.*;
public class Palindrome{
    
    public static void main(String args[]){
        String a,b="";
        //String splchars="-/@#$^&_+=()";
        
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the word:");
         a=s.nextLine();
         //if(a==)
         int n=a.length();
         if(a.matches("[a-zA-Z\\'\"]+")==true){
        	 for(int i=n-1; i>=0; i--){
                 
                 b=b+a.charAt(i);
             }
             if(a.equalsIgnoreCase(b)){
                 System.out.println(a+" is a Palindrome");
             }
             else{
                 System.out.println(a+ " is not a Palindrome");
             }
         }
         else{
         
         
             System.out.println("Invalid Input");
         }
         }
    }
