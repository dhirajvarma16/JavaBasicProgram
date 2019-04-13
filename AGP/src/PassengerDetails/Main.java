package PassengerDetails;


import java.util.Scanner;
public class Main extends Passenger{
    public Main(int Id,String name,String gender,String address)
    {
    super(Id,name,gender,address);    
    }
    //static String name,gender,address;
    //static int Id;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name,gender,address;
        //Passenger p2=new Passenger();
       int Id;
        int no;
        System.out.println("Enter the no.of passengers:");
        no=sc.nextInt();
        for(int i=1;i<=2;i++){
            System.out.println("Passenger "+i);
            System.out.println("Enter the ticketid:");
            Id=sc.nextInt();
            //p2.setTicketid(Id);
            System.out.println("Enter the name:");
            name=sc.next();
            System.out.println("Enter the gender:");
            gender=sc.next();
            System.out.println("Enter the address:");
            address=sc.next();
        }
        Main P1=new Main(Id,name,gender,address);
        System.out.println(P1);
    }
}