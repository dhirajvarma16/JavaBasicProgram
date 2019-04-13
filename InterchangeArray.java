import java.util.*;
class InterchangeArray{
    
    public static void main(String[] args){
        int x,y1,y2;
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the number of elements in the first array:");
        y1=s1.nextInt();
        if(y1>0 && y1<=20){
            int a[]=new int[y1];
            System.out.println("Enter the elements in the first array");
            for(x=0; x<a.length; x++){
                a[x]=s1.nextInt();
            }
            System.out.println("Enter the number of elements in the second array :");
            y2=s1.nextInt();
            int b[]=new int[y2];
            if(b.length<a.length ||b.length<=0){
                System.out.println("Unable to swap size differs");
                System.exit(0);
            }
            else{
            System.out.println("Enter the elements in the second array");
            for(x=0; x<b.length; x++){
                b[x]=s1.nextInt();
            }
        for(x=0;x<y2;x++){
            a[x]=a[x]+b[x];
            b[x]=a[x]-b[x];
            a[x]=a[x]-b[x];
        }
        System.out.println("The first array after swapping is :");
            for(x=0; x<a.length; x++){
                System.out.print(a[x]+" ");
            }
        System.out.println("");  
            
        System.out.println("The second array after swapping is :");
            for(x=0; x<b.length; x++){
                System.out.print(b[x]+" ");
                        }

        }
        }
        else {
        	System.out.println("Invalid range");
        }
       
       
               
    }
    
}
