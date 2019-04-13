import java.util.Scanner;
public class HighestMarkPerSem{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter no of semester:");
    int n1,na,nb,nc;
    n1=sc.nextInt();
    System.out.println("Enter no of subjects in 1 semester:");
     na=sc.nextInt();
   
     System.out.println("Enter no of subjects in 2 semester:");
     nb=sc.nextInt();
     System.out.println("Enter no of subjects in 3 semester:");
     nc=sc.nextInt();
    int[]a =new int[na];
    System.out.println("Marks obtained in semester 1:");
    for(int i=0;i<a.length;i++)
    {
    a[i]=sc.nextInt();
    }
    
   System.out.println("Marks obtained in semester 2:");    
   int b[]=new int[nb];
    
 for(int i=0;i<b.length;i++)
    {
    b[i]=sc.nextInt();
    if(b[i]<0 || b[i]>100) {
    	System.out.println("You have entered invalid mark.");
        System.exit(0);
    }
    }
    
    System.out.println("Marks obtained in semester 3:");
   int c[]=new int[nc];
    
    for(int i=0;i<c.length;i++)
    {
    c[i]=sc.nextInt();
    }
    int total1=0,total2=0,total3=0;
    for(int i=0; i< a.length;i++){
    if(a[i]<=0 && a[i]>=100){
    	System.out.println("You have entered invalid mark.");
        System.exit(0);
    }
    else{
        
        if(a[i]>total1){
            total1=a[i];
        }
    }
    }
System.out.println("Maximum mark in 1 semester:"+total1);

for(int i=0; i< b.length;i++){
    if(b[i]>=0 && b[i]<=100){
    if(b[i]>total2){
        total2=b[i];
    }
    }
    else{
        System.out.println("You have entered invalid mark.");
        System.exit(0);
    }
    }
System.out.println("Maximum mark in 2 semester:"+total2);


for(int i=0;i<c.length;i++){
    if(c[i]>=0 && c[i]<=100){
    if(c[i]>total3){
        total3=c[i];
    } }
    else{
        System.out.println("You have entered invalid mark.");
        System.exit(0);
    }
    }
System.out.println("Maximum mark in 3 semester:"+total3);
}
}