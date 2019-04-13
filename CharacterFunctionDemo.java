
public class CharacterFunctionDemo
{
  public static void main(String args[])
  {
 
    char ch1 = '5';                            // observe, it is digit
    char ch2 = 'A';                            // observe, it is not digit, it is letter
 
     boolean b1 = Character.isDigit(ch1);
     boolean b2 = Character.isDigit(ch2);
 
     
     if(Character.isDigit(ch)==true){
         
     }
     
     System.out.println(ch1 + " is digit: " + b1);     
     System.out.println(ch2 + " is digit: " + b2);     
 
     System.out.println("\n+ is digit: " + Character.isDigit('+'));       // observe, it is not digit, it is special character
     System.out.println("$ is digit: " + Character.isDigit('$'));         // observe, it is not digit, it is special character
  }}