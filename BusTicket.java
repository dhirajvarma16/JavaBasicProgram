public class BusTicket
{
    private int ticketNo;
    private float ticketPrice;
    private float totalAmount;
    private Person person;
    
    public void setPerson(Person ob)    {
        this.person=ob;
    }

    public Person getPerson()
    {
        return person;
    }
    public void setTicketNo(int tn)
    {
        this.ticketNo=tn;
    }

    public int getTicketNo()
    {
        return ticketNo;
    }
    public void setTicketPrice(float tp)
    {
        this.ticketPrice=tp;
    }

    public float getTicketPrice()
    {
        return ticketPrice;
    }
    public void setTotalAmount(float tamt)
    {
        this.totalAmount= tamt;
    }

    public float getTotalAmount()
    {
        return totalAmount;
    }
    public void calculateTotal()
    {
        
        int a=person.getAge();
        char g=person.getGender();
        float d;
        if(a<16)
        {
            d=(float)(ticketPrice*0.5);
            totalAmount=ticketPrice-d;
        }
        else if(a>=60)
        {
            d=(float)(ticketPrice*0.25);
            totalAmount=ticketPrice-d;
        }
        else if(g =='F')
        {
            d=(float)(ticketPrice*0.1);
            totalAmount=ticketPrice-d;
        }
        else 
        totalAmount=ticketPrice;
    }

	public void setNo(int noft) {
		// TODO Auto-generated method stub
		
	}
}
