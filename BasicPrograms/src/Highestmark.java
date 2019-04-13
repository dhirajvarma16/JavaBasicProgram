import java.util.*;
class Highestmark
{
    public static void main(String[] args){
        int n,max;
        Scanner s=new Scanner(System.in);
        //System.out.println();
       // n=s.nextInt();
        int a[]=new int[6];
        System.out.println();
        max=a[0];
        for(int i=0;i<6;i++){
            a[i]=s.nextInt();
        //} 
            if(a[i]>=0) {       
        //for(int i=0;i<6;i++){
            if(max<a[i]){
                max=a[i];
            }
        }else {System.out.print("Invaild mark");}
            }
        
        System.out.println("Highest Number :"+max);
        
    }
}
