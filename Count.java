import java.util.*;
public class Count{
    
    static void count(String str){
        char[] ch=str.toCharArray();
        int i=0;
          String s="";
        
            if(str.matches("[a-zA-Z\\'\"]+")==true)
            {
            	while(i<ch.length)
                {
                s=s+ch[i];
                i++;} 
            }
        else{
        	 System.out.println("Inavild input");
        }
        if(s.length()>0)
        {
            System.out.println(s + " has "+s.length() +" characters ");
        }
        }
   
    
    public static void main(String[] arg){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your name:");
        String str=sc.nextLine();
        System.out.println();
        count(str);
    
    }
    
    }
