import java.util.*;
import java.util.regex.Pattern;
public class FirstOccurence{
    public static void main(String[] args){
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.nextLine();
        System.out.println("Enter the character to be searched:");
        String sch=sc.nextLine();
        System.out.println("Enter the character to replace:");
        String rep=sc.next();
        
        String result=str.replaceFirst(Pattern.quote(sch),rep);
        if(result.equals(str)){
        	System.out.println("character not found");
        	
        }else {
        System.out.println("Result:"+result);
        }
    }
}