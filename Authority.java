import java.util.*;
import java.util.regex.*;
class Authority{
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Inmate's name:");
        String name=sc.nextLine();
        System.out.println("Inmate's father's name");
        String father=sc.nextLine();
        Pattern p=Pattern.compile("^[A-Za-z]+$");
        Matcher m1=p.matcher(name);
        Matcher m2=p.matcher(father);
        boolean b1=m1.matches();
        boolean b2=m2.matches();
        System.out.println("m1.matches()"+m1.matches()+"m1.matches()"+m1.matches());
        if(b1&&b2){
            name=name.concat(" "+father);
            System.out.println(name);     
            }
            else{
                System.out.println("Invalid name");
            }
        
    }
}