import java.util.*;
import java.lang.*;
import java.io.*;
public class ReplaceWord{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=s.nextLine();
        System.out.println("Enter the word to be searched:");
        String search=s.nextLine();
        System.out.println("Enter the word to be replace:");
        String replace=s.nextLine();
        if(str.contains(search)){
            String replaced=str.replaceAll(search,replace);
            System.out.println(replaced);
        }
        else{
            System.out.println("The word "+search+" not found");
            System.exit(0);
        }
        
    }
}