import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class LinearSearch{
    public static void main(String[] args) throws IOException
    {
    int c,n;
    String[] array;
    String search;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Scanner in =new Scanner(System.in);
    System.out.println("Enter no of course:");
    n=in.nextInt();
    array =new String[n+1];
    System.out.println("Enter course names:");
    for(c=0;c<=n;c++){
        array[c]=br.readLine();
    }
    System.out.println("Enter the course to be searched:");
    search=br.readLine();
    
    for(c=0; c<=n ;c++){
        if(array[c].equals(search)){
            System.out.println(search + " course is available");
        }
    }
        
    }
}