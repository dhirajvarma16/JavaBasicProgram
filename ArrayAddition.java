import java.util.Scanner;

public class ArrayAddition {
	static int[] a;
	static int[] b;
	public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    int n1,n2;
	   
	    int[] c;
	     
	   
	    System.out.println("Enter the size of first array:");
	    n1=sc.nextInt();
	    a=new int[n1];
	    System.out.println("Enter elements for first array:");
	    for(int i=0; i<n1;i++){
	    	
	        a[i]=sc.nextInt();
	    }
	    
	    System.out.println("Enter the size of first array:");
	    n2=sc.nextInt();
	    b=new int[n2];
	    for(int i=0; i<n2;i++){
	        b[i]=sc.nextInt();
	    }
	    
	  
	    if(a.length>b.length) {
	    	int len=a.length;
	    c=new int[len];
	    for(int i=0;i<len;i++)
	    {
	        c[i]=a[i]+b[i];
	    }
	    for(int i=0;i<len;i++)
	    {
	        System.out.println(c[i]);
	    }
	    }
	    
	}
}
