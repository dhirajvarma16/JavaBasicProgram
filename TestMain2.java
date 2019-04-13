import java.util.Scanner;
class TestMain2{
    
    public static BusTicket getTicketDetails(){
           String name;
          char g;
          int age;
          int noft;
          float price;
         Person p=new Person();
    BusTicket1 bs=new BusTicket1();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the passenger name:");
        name=sc.nextLine();
        System.out.println("Enter the gender(M or F):");
        g=sc.next().charAt(0);
        System.out.println("Enter the age:");
        age=sc.nextInt();
        System.out.println("Enter the ticket no:");
        noft=sc.nextInt();
        System.out.println("Enter the ticket price");
        price=sc.nextFloat();
        
        p.setName(name);
        p.setGender(g);
        p.setAge(age);
        
        bs.setNo(noft);
        bs.setPerson(p);
        bs.setPrice(price);
     return bs;
        }
    public static void main(String[] args){
        TestMain ob=new TestMain();
        BusTicket1 t;
        t=ob.getTicketDetails();
        Person p1;
        p1=t.getPerson();
        t.calculateTotal();
        System.out.println("Ticket no:"+t.getNo());
        System.out.println("Passenger Name:"+p.getName());
        System.out.println("Price of a ticket:"+t.getPrice());
       // bs.calculateTotal();
        System.out.println("Total amount:"+t.getAmount());
        
    
        
        
        
    }
}