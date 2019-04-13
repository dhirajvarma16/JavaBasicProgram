import java.util.*;
public class Main2{
    public static Movie2 getMovieDetails(){
        Movie2 mv=new Movie2();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the movie name:");
        String name=sc.nextLine();
        System.out.println("Enter the movie category:");
        String ct=sc.nextLine();
        mv.setMovieName(name);
        mv.setMovieCategory(ct);
        return mv;
    }
    public static String getCircle(){
        System.out.println("Enter the circle:");
        Scanner sc=new Scanner(System.in);
        String crl=sc.nextLine();
        return crl;
    }
    
    public static void main(String[] args){
        Movie2 mo=getMovieDetails();
        String clrvalue=getCircle();
        //System.out.println(clrvalue);
       System.out.println("Movie Name="+mo.getMovieName());
       System.out.println("Movie Category="+mo.getMovieCategory());
       int value;
       //System.out.println("Movie ="+mo.calculateTicketCost(clrvalue));
       mo.calculateTicketCost(clrvalue);
       //mo.setTicketCost(value);
       System.out.println("Ticket cost is="+ mo.getTickectCost());
    
    
    }
    
} 