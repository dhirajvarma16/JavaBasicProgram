import java.util.*;
class Highestmark
	{
	    public static void main(String[] args){
	        int n;
	     int max;
	        Scanner s=new Scanner(System.in);
	        //System.out.println();
	       // n=s.nextInt();
	        int a[]=new int[6];
	        System.out.println();
	        for(int i=0;i<6;i++){
	            a[i]=s.nextInt();
	            if(a[i]<0){
	                System.out.println("Invaild mark");
	                break;
	            }
	            else {
	            	max=a[0];
	    	        if(max<a[i]){
	    	         max=a[i];	    	            
	            }
	    	        System.out.println("Highest mark is: "+ max);
	        }
	        
	        }
	        
	        
	    }
	}
