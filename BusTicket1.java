class BusTicket1{
    private int ticketNo;
    private float ticketPrice;
    private float totalAmount;
    private Person person;
    
    public void setNo(int ticketNo){
        this.ticketNo=ticketNo;
    }
    public int getNo(){
        return ticketNo;
    }
    public void setPrice(float ticketPrice){
        this.ticketPrice=ticketPrice;
    }
    public float getPrice(){
        return ticketPrice;
    }
    public void setAmount(float totalAmount){
        this.totalAmount=totalAmount;
    }
    public float getAmount(){
        return totalAmount;
    }
    
    public void setPerson(Person person){
        this.person=person;
    }
    public Person getPerson(){
        return person;
    }
  void calculateTotal()
    {
        int a=person.getAge();
        char g=person.getGender();
        char s=Character.toUpperCase(g);
     if(a<16){
         totalAmount=(float) (ticketPrice - ticketPrice*0.5);
     }else if(a >= 60){
         totalAmount=(float) (ticketPrice-ticketPrice*0.25);
         
     }else if(g =='F'){
         totalAmount=(float) (ticketPrice-ticketPrice*0.1);
         
     }else{
         totalAmount=ticketPrice;
     }  
        
    }

}