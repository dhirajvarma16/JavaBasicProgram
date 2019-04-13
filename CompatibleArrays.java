import java.util.*;
public class CompatibleArrays{
    public static void main(String[] args){
        int x,y1,y2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size for First array:");
        y1=sc.nextInt();
        if(y1<=0){
            System.out.println("Invalid array size");
        }
        else{
            int a[]=new int[y1];
            System.out.println("Enter the elements for First array:");
            for(int i=0;i<y1;i++){
                a[i]=sc.nextInt();
            }
        System.out.println("Enter the size for Second array:");
        y2=sc.nextInt();
            if(y2<=0){
            System.out.println("Invalid array size");
        }
        else{
            int b[]=new int[y2];
            System.out.println("Enter the elements for Second array:");
            for(int i=0;i<y2;i++){
                b[i]=sc.nextInt();
            }
          int count=0;
          if(a.length==b.length){
              for(int i=0;i<a.length;i++){
                  if(b[i]>=a[i]){
                     count++;
                  }
              }
              
          }
          if(count==a.length)
          {
              System.out.println("Arrays are Compatible");
          }
          else{
              
              System.out.println("Arrays are not Compatible");
          }
            
            
            
        }
    }
        
    }
}