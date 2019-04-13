import java.util.*;
class EvenNumber{
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,sum=0,count=0;
        System.out.println("Enter the size of an array:");
        n=sc.nextInt();
        if(n<=0){
            System.out.println("Invalid array size");
            System.exit(0);
        }
        String[] str=new String[n];
        System.out.println("Enter the array elements:");
        for(int i=0; i< n;i++){
            str[i]=sc.next();
        }
        for(int i=0;i< n;i++){
            //System.out.println("str[i].length()"+str[i].length());
            if(str[i].length()==1){
                if(Integer.parseInt((str[i]))%2==0){
                    sum=sum*10+Integer.parseInt((str[i]));
                    count++;
                    
                }else {
                	count=0;
                }
                
            }
           
        }
        if(count==0) {
        	System.out.println("no sigle digit even number");
        }else {
         System.out.println(sum);
        }
    }
}