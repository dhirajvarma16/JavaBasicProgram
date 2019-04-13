import java.util.*;
public class TestMain
{ 
    
    public static BusTicket getTicketDetails()
    {
         Person p = new Person();
         BusTicket b= new BusTicket();
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the passenger name:");
        String na= sc.next();
        System.out.println("Enter the gender(M or F):");
        char g= sc.next().charAt(0);
        System.out.println("Enter the age:");
        int a= sc.nextInt();
        System.out.println("Enter the ticket no:");
        int no= sc.nextInt();
        System.out.println("Enter the ticket price:");
        float ta= sc.nextFloat();
        p.setName(na);
        p.setGender(g);
        p.setAge(a);
        b.setPerson(p);
        b.setTicketNo(no);
        b.setTicketPrice(ta);
        return b;
    }
    public static void main(String [] ar)
    { 
        TestMain ob= new TestMain();
        BusTicket t;
        t=ob.getTicketDetails();
        Person p1;
        p1= t.getPerson();
        t.calculateTotal();
        System.out.println("Ticket no:"+ t.getTicketNo());
        System.out.println("Passenger Name:"+ p1.getName());
        System.out.println("Price of a ticket: "+ t.getTicketPrice());
        System.out.println("Total Amount:"+ t.getTotalAmount());
        } 
    }
