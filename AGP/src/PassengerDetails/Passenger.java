package PassengerDetails;

public class Passenger{
    private int ticketid;
    private String name;
    private String gender;
    private String address;
    
    public Passenger()
    {
        this.ticketid=ticketid;
        this.name=name;
        this.gender=gender;
        this.address=address;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public String getAddress(){
        return address;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public String getGender(){
        return gender;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setTicketid(int ticketid){
        this.ticketid=ticketid;
    }
    public int getTicketid(){
        return ticketid;
    }
    
    
    public String toString(){
        return String.format("ticketid:"+getTicketid()+","+"name:"+getName()+","+"gender:"+getGender()+","+"address:"+getAddress());
    }
}