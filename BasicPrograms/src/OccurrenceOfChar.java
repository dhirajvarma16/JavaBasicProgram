import java.util.*;

import org.apache.commons.lang3.text.WordUtils;
class OccurrenceOfChar{
    
   
	public static void main (String[] args){
		Scanner sc=new Scanner(System.in); 
		int sum=0;
		String [] b = new String [8];
		 for(int i=1;i<=8;i++) {
		  b[i]=sc.next();	 
		  System.out.println(b[i].length());
		  System.out.println("Enter the Book name:");
		  if(b[i].length()==1) 
		  {
			  if(Integer.parseInt((b[i]))%2==0) {
				  sum=sum*10+Integer.parseInt((b[i]));
				  System.out.println(""+ sum);
				  
			  }
		  }
		 }
	    	    }
	
}