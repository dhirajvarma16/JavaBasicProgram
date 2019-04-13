import java.util.*;
//import org.apache.commons.lang3.text.WordUtils;
class InitCap{
	static StringBuilder ret=new StringBuilder();
	
	//static StringBuilder  c=reuseForBetterPerformance(ret);
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=0;
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        String [] words=str.split(" ");
        //System.out.println();
       
        
        for(int i=0;i<words.length;i++)
        {
            if(Character.isUpperCase(words[i].charAt(0)))
            {
            	
            	ret.append(words[i]);
            	ret.append(' ');
            	n++;
            	
            }
            else{
            	//ret.append(words[i-1].substring(0,1));
            ret.append(Character.toUpperCase(words[i].charAt(0)));
            ret.append(words[i].substring(1));
            if(i<words.length-1){
                ret.append(' ');
                
            }
            }   
            }
            if(words.length==n){
            	System.out.println("First character of each word is already in uppercase");
            }else {
            	System.out.println(ret.toString());
            }
            
            
        }
         
    
    }

