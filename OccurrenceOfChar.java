import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class OccuranceOfChar{
        public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a word:");
String word=sc.next();

Pattern p=Pattern.compile("[A-Za-z]+");
Matcher m1=p.matcher(word);
boolean b1=m1.matches();

if(!b1){
    System.out.println("Not a valid string");
    System.exit(0);
}
System.out.println("Enter the character:");
char character=sc.next().charAt(0);

String char_str=String.valueOf(character);

Matcher m2=p.matcher(char_str);
boolean b2=m2.matches();
if(!b2){
    System.out.println("Given character is not an alphabet");
    System.exit(0);
}
int count=0;
int no_count=0;
for(int i=0;i<word.length();i++){
    if(word.charAt(i)==character){
        no_count++;
    }
    else if(word.charAt(i)!= character)
    {
        no_count++;
        
    }
}
if(no_count ==word.length()){
    System.out.println("The given character '"+character+"' not present in the given word.");
    
}
System.out.println("No of '"+character+"' present in the given word is "+count+".");
}
    
}    
