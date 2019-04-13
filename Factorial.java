import java.util.*;
public class Factorial{
    public static void main(String[] args){
        
        int n,n1;
        int sum=1,count=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]= new int[n];
        for(int i=0;i<a.length;n++){
            a[i]=sc.nextInt();
        }
        for(int j=0;j<n;j++){
            if(a[j]>0 && a[j]<10){
                count++;
                continue;
            }
            else{
                if(count==n){
                    System.out.println("No positive and single digit numbers found in array");
                    
                }
                else{
                    sum=sum+sum*a[j];
                }
            }
        }
        System.out.println("sum"+sum);
        
    }
}