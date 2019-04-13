import java.util.*;
class BikeRace {
    public static void main(String[] args){
        int count =0, num ,m=1,n=1,a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the distance travelled");
       int  dis=sc.nextInt();
        if(dis<0){
         System.out.println("Invalid input");
         }
         else if(dis==0 || dis>0){
             int b=Integer.toString(dis).length();
             int f[]=new int[10];
             for(int i=b;i>0;i++)
            {
                f[i]=dis%10;
                num=dis/10;
                dis=num;
                if(i%2==0){
                    m=m*f[i];
                }else{
                    n=n*f[i];
                }
            }
            if(m>n){	
                System.out.println("Your bonus points is "+m);
            }
            else if(n>m){
                System.out.println("Your bonus points is"+n);
                }
            else if(m==n){
                m=m*2;
                System.out.println("Your bonus point is"+m);
            }    
         }
         
    }
    
    
}



/*
while(num!=0){
             
             a=num%10;
             num/=10;
             ++count;
             
             if (count%2==0){
                 mul=mul*a;
                }
             else if (count%2!=0){
                 mul1=mul1*a;
                 
             }
          if(mul>mul1){
            System.out.println(" Your bonus points is "+mul);  
          }
        else {
            System.out.println(" Your bonus points is "+mul1);
        }    
        }
         else if(num<=0){
             System.out.println("Invalid input");
         }
         else {
             System.out.println("Invalid input");
         }

*/