public class Movie2{
    private String movieName;
    private  String movieCategory;
   static private int ticketCost;
    
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
        //System.out.println("ticketCost:"+ticketCost);
    }
    
    public int getTickectCost(){
        return ticketCost;
    }
    //String category=getMovieCategory();
  
    public int calculateTicketCost(String circle){
    	  	System.out.println("category :"+ getMovieCategory());
    	  	System.out.println("Silver :"+ circle);
        if(circle.equals("gold") && (getMovieCategory().equals("2D")))
        		{
        	System.out.println("No issue with condition");
        	ticketCost=300;
        	setTicketCost(ticketCost);
        	return 400 ;
        	}
		return 350;
    }
}