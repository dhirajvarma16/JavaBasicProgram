class Hosteler{
   private static String hostelName;
    private int roomNumber;
 
    public  void setHostellerDDetails(String hostelName,int roomNumber)
    {
        this.hostelName=hostelName;
        this.roomNumber=roomNumber;
        
    }
    public static String getHostellerDDetails(){
        return hostelName;
    }
    
}