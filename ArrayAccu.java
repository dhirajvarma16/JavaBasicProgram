import java.util.Scanner;
public class ArrayAccu {

	
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the size of first array:");
	        int n1 = sc.nextInt();
	        
	        if(n1 <= 0)
	        {
	        System.out.println("Invalid array size");
	        System.exit(0);    
	        }
	        
	        System.out.println("Enter elements for first array:");
	        int arr[] = new int[n1];
	        for(int i = 0; i < n1; i++) 
	        {
	            arr[i] = sc.nextInt();
	        }

	        System.out.println("Enter the size of second array:");
	        int n2 = sc.nextInt();
	        
	        if(n2 <= 0)
	        {
	        System.out.println("Invalid array size");
	        System.exit(0);    
	        }
	        
	        System.out.println("Enter elements for second array:");
	        int arr2[] = new int[n2];
	        for(int i = 0; i < n2; i++) 
	        {
	            arr2[i] = sc.nextInt();
	        }
	        
	        int n3 = 0;
	        
	        if(n1 > n2)
	        {
	            n3 = n1;
	        }
	        else
	        {
	             n3 = n2;
	        }
	        
	        
	        
	            
	       
	        
	        
	        int[] sums = new int[n3];
	        for (int i = 0; i < n3; i++) {
	            if (arr.length > i) {
	                sums[i] += arr[i];
	            }
	            
	            
	        }
	        
	        
	        
	        
	        
	        
	        
	        for (int i = 0; i < n3; i++) {
	            System.out.println(sums[i]);
	            
	        }
	        System.out.println();
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        

	    }
	}








