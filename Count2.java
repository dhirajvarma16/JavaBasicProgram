import java.util.Scanner;

public class Count2 {

	static void count(String str){
        char[] ch=str.toCharArray();
        //System.out.println(ch);
        int i=0;
            String s="";
        
        	if( str.matches(".*\\d+.*")==true ) {
        		System.out.print("Invaild input");
        		
        	}
        	else {
        		while(i<ch.length){
        		s=s+ch[i];
            i++;}
        }
        if(s.length()>0){
            System.out.println(s + " has "+s.length() +" characters ");
        }
        
    }
    
    public static void main(String[] arg){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your name:");
        String str=sc.nextLine();
        //System.out.println(str.matches(".*\\d+.*"));
        
       count(str);
    
    }
	
	
}
