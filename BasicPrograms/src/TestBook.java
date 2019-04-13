import java.util.*;

public class TestBook{
    public static void main(String[] args){
        Book bk=new Book();
        Scanner sc=new Scanner(System.in);
        String bname;
        System.out.println("Enter the Book name:");
        bname=sc.next();
        int prce;
        System.out.println("Enter the Price:");
        prce=sc.nextInt();
        String Aname;
        System.out.println("Enter the Author name:");
        Aname=sc.next();
        System.out.println("Book Details");
        bk.setName(bname);
        bk.setbookPrice(prce);
        bk.setauthorName(Aname);
    }
}