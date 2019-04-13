import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class StringContainsSpecialCharactersExample {
  public static void main(String[] args) {
 
      Pattern pattern = Pattern.compile("[a-zA-Z0-9\\s]*");
 
      String str = "abc97 ";
      Matcher matcher = pattern.matcher(str);
 
      
      System.out.println(!matcher.matches());
      
      if (!matcher.matches()) {
           System.out.println("string '"+str + "' contains special character");
      } else {
           System.out.println("string '"+str + "' doesn't contains special character");
      }
 
  }
}