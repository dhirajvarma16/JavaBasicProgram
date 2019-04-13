import java.util.*;
import java.util.regex.*;
public class Asd{
    
    public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    String str=s.nextLine();
    
    Pattern p = Pattern.compile("^[ A-Za-z]+$");
    System.out.println("p "+p);
    Matcher m1=p.matcher(str);
    System.out.println("m1 "+m1);
    boolean b1=m1.matches();
    System.out.println("b1"+b1);
    if(b1){
        int length_str=str.length();
        System.out.println("No of charaters is:"+length_str);
    }
    else{
        System.out.println("Invalid String");
    }



    } 
}