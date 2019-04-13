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
        System.exit(0);
    }
    
    a=new int[n1];
    System.out.println("Enter elements for first array:");
    for(int i=0; i<n1;i++){
        a[i]=sc.nextInt();
    }
    System.out.println("Enter the size of second array:");
    n2=sc.nextInt();
    if(n2<=0){
        System.out.println("Invalid array size");
        System.exit(0);
    }
   
    b=new int[n2];
    System.out.println("Enter elements for second array:");
    for(int i=0; i<n2;i++){
        b[i]=sc.nextInt();
    }
    int[] big = a.length > b.length ? a : b;
    int[] small = a.length <= b.length ? a : b;

    int[] summedArray = new int[big.length];
    System.arraycopy(big, 0, summedArray, 0, big.length);

    for (int i = 0; i < small.length; i++) {
        summedArray[i] += small[i];
    }

    for (int i = 0; i < summedArray.length; i++) {
        System.out.println(summedArray[i]);
    }
    }}