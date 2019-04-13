import java.util.Scanner;

public class uniqueCharacters {
	static final int NO_OF_CHARS =256;
    public static void main(String[] args){
        
        
        System.out.println("Enter the sentence:");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int[] count=new int[NO_OF_CHARS];
        
        
        int i;
        if(str.matches("[a-zA-Z\\s]+")==true){
        for(i=0;i< str.length();i++){
            if(str.charAt(i)!=' ')
                count[(int)str.charAt(i)]++;
          
        }int uq=0;
        	int n=i;
               for(i=0;i<n;i++){
                   if(count[(int)str.charAt(i)]==1)
                      ++uq;
               }
               if(uq>0) {
            	   System.out.println("Unique characters:");
            	   for(i=0;i<n;i++) {
            		   if(count[(int)str.charAt(i)]==1)	   
            	         System.out.println(str.charAt(i));
            	   }
               }
               else {
            	   System.out.println("No Unique");
            	   
               }
           
        }
       else{
           System.out.println("Invalid Sentence");
       }        
        
        
        
    }
}
