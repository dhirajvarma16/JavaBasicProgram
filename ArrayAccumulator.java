import java.util.*;
class ArrayAccumulator{
	
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n1,n2;
    int[] a;
    int[] b;
    int[] c;
   
    System.out.println("Enter the size of first array:");
    n1=sc.nextInt();
    if(n1<=0){
        System.out.println("Invalid array size");
    }
    else{
    a=new int[n1];
    System.out.println("Enter elements for first array:");
    for(int i=0; i<n1;i++){
        a[i]=sc.nextInt();
    }
    System.out.println("Enter the size of second array:");
    n2=sc.nextInt();
    if(n2<=0){
        System.out.println("Invalid array size");
    }
    else{
    b=new int[n2];
    System.out.println("Enter elements for Second array:");
    for(int i=0; i<n2;i++){
        b[i]=sc.nextInt();
    }
    System.out.println("a length:"+a.length);    
    System.out.println("b length:"+b.length);    
    if(a.length>b.length) {
    c= new int[a.length];
    int n=c.length;
    System.out.println("Length:"+n);
    c=new int[n];
    for(int i=0;i<=n;i++)
    {
        c[i]=a[i]+b[i];
    }
    for(int i=0;i<n;i++)
    {
        System.out.println(c[i]);
    }}
    } 
    }
}}