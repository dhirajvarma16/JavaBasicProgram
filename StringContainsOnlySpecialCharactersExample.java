import java.util.Scanner;

public class StringContainsOnlySpecialCharactersExample {
  public static void main(String[] args) {
 
  
      String inputString="@321@";
      String splChrs = "-/@#$%^&_+=()" ;
      boolean found = inputString.matches("[" + splChrs + "]+");
      System.out.println("Founded:"+ found);
  
  
  }
  
}
 
/*
 
string '@#!' contains only special character
 
*/