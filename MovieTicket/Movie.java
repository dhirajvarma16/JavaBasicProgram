package MovieTicket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Movie{
    private String movieName;
    private  String movieCategory;
    private int ticketCost;
    
    public void  setMovieName(String movieName){
        this.movieName=movieName;
    }
    public String getMovieName(){
        return movieName;
    }
    
    public void setMovieCategory(String movieCategory){
        this.movieCategory=movieCategory;
    }
    
    public String getMovieCategory(){
        return movieCategory;
    }
    public void setTicketCost(int ticketCost){
        this.ticketCost=ticketCost;
    }
    
    public int getTicketCost(){
        return ticketCost;
    }
    
    public int calculateTicketCost(String circle){
    	System.out.println("2D"+movieCategory.equalsIgnoreCase("2D"));
    	System.out.println("3D"+movieCategory.equalsIgnoreCase("3D"));
    	System.out.println("silver"+circle.equalsIgnoreCase("silver"));
    	System.out.println("gold"+circle.equalsIgnoreCase("gold"));
        if(circle.equals("gold")==true && getMovieCategory().equals("2D")==true){
            ticketCost=300;
            setTicketCost(ticketCost);
            return 0;
        }
        else if(circle.equals("gold")==true && getMovieCategory().equals("3D")==true){
            ticketCost=500;
            return 0;
        }
        else if(circle.equals("silver")==true && getMovieCategory().equals("2D")==true ){
            ticketCost=250;
            return 0;
        }
        else if(circle.equals("silver")==true && getMovieCategory().equals("3D")==true){
            ticketCost=450;
            return 0;
        }
         else if((circle.equalsIgnoreCase("silver")!=true && circle.equalsIgnoreCase("gold")!=true ) && (movieCategory.equalsIgnoreCase("2D")!=true && movieCategory.equalsIgnoreCase("3D")!=true))
        {
            return -3;
        }
         else if( (movieCategory.equalsIgnoreCase("2D")!=true) && (movieCategory.equalsIgnoreCase("3D")!=true)){
             return -1;
         }
         else if( circle.equalsIgnoreCase("silver")!=true  && circle.equalsIgnoreCase("gold")!=true){
             return -2;
         }
        
       
        return 0;
            
        }
    }
