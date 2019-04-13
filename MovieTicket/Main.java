package MovieTicket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main{
    public static Movie getMovieDetails() {
        Movie mv=new Movie();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the movie name:");
        String name=sc.nextLine();
        System.out.println("Enter the movie category:");
        String ct=sc.nextLine();
        mv.setMovieName(name);
        mv.setMovieCategory(ct);
        return mv;
    }
    public static String getCircle()
    {
        System.out.println("Enter the circle:");
        //BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);
        String crl=sc.nextLine().toUpperCase();
        return crl;
    }
    
    public static void main(String[] arg){
        Movie mo=getMovieDetails();
        String clrvalue=getCircle();
        
        int value;
        mo.calculateTicketCost(clrvalue);
        
        value=mo.calculateTicketCost(clrvalue);
        /*if(value == 0){
           
        }*/
       // System.out.println("Ticket cost is="+value);
        if(value==-1){
        	System.out.println("Movie Name="+ mo.getMovieName());
            System.out.println("Movie Category="+mo.getMovieCategory());
            System.out.println("Sorry there is no "+mo.getMovieCategory()+" type of category in theater.");
        }
        else if(value ==-2){
        	System.out.println("Movie Name="+ mo.getMovieName());
            System.out.println("Movie Category="+mo.getMovieCategory());
            System.out.println("Sorry!!! Circle is Invalid.");
        }
        else if(value==-3){
        	System.out.println("Movie Name="+ mo.getMovieName());
            System.out.println("Movie Category="+mo.getMovieCategory());
            //System.out.println("Ticket cost is="+mo.getTicketCost());
            System.out.println("Sorry!!! Both circle and category are Invalid.");
        }
        else {
        System.out.println("Movie Name="+ mo.getMovieName());
        System.out.println("Movie Category="+mo.getMovieCategory());
        System.out.println("Ticket cost is="+mo.getTicketCost());
            
        }
    }
    
}