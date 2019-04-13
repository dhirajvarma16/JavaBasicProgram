import java.util.*;
class Highestmark
{
    public static void main(String[] args){
        int n,max = 0;
        int count=0;
        Scanner s=new Scanner(System.in);
        //System.out.println();
       // n=s.nextInt();
        int a[]=new int[6];
        System.out.println();
         
        for(int i=0;i<6;i++){
            a[i]=s.nextInt();
               if(a[i]<0){
                    System.out.println("Invalid mark");
                    break;
                    } 
               ++count;
                  }
        System.out.println("count"+count);
       
        if(count==6) {
        	for(int i =0;i<a.length;i++)
            {
                if(a[i]>0){
            	if(max < a[i])
                {
                    max = a[i];
                }
            	}
            }     
        	 System.out.println("Maximum value:"+max);   
        	 }
    
    }
        }
    