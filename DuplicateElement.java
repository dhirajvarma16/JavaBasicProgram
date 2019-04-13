import java.util.Scanner;
import java.util.Arrays;
public class DuplicateElement {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of an array:");
    int n1 =sc.nextInt();
    if(n1<=0){
        System.out.println("Invalid array size");
        System.exit(0);
    }
    System.out.println("Enter the array elements:");
    int arr1[]=new int[n1];
    for(int i=0;i<n1;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("Enter the position of the element to be replicated:");
    int rep=sc.nextInt();
    if(rep >= n1){
        System.out.println("Position is greater  than  the size of an array");
    }
    int n2=n1+1;
    int[] arr2=Array.copyOf(arr1,n2);
    int element =aar1[rep];
    arr2[n2-1]=element;
    
    for(int i=0;i<n2;i++){
       System.out.pritln(arr2[i]);
        
    }
    
}    
}