import java.util.Scanner;
public class Main
    {
    public static Hosteller getHostellerDetails()
    {
       Hosteller hs=new Hosteller();
       
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Details : ");
       System.out.println("Student Id:");
       int id;
       id=sc.nextInt();
       hs.setId(id);
       System.out.println("Student Name: ");
       String name;
       name=sc.next();
       hs.setName(name);
       System.out.println("Department Id:");
       int did;
       did=sc.nextInt();
       hs.setDepartmentId(did);
       System.out.println("Gender:");
       String gender;
       gender=sc.next();
       hs.setGender(gender);
       System.out.println("Phone Number:");
       String phone;
       phone=sc.next();
       hs.setPhone(phone);
       System.out.println("Hostel Name:");
       String hostname;
       hostname=sc.next();
       //Hosteller host=getHostellerDetails();
       hs.setHostelName(hostname);
       System.out.println("Room Number:");
       int Rno;
       Rno=sc.nextInt();
       hs.setRoomNumber(Rno);
       System.out.println("Modify Room Number(Y/N):");
       String y1;
       y1=sc.next();
       if(y1.equalsIgnoreCase("Y")){
           System.out.println("New Room Number:");
           Rno=sc.nextInt();
           hs.setRoomNumber(Rno);
       }
       String phone1;
       System.out.println("Modify Phone Number(Y/N):");
       String y;
       y=sc.next();
       if(y.equalsIgnoreCase("Y")){
           System.out.println("New Phone Number:");
           phone1=sc.next();
           hs.setPhone(phone1);
       }

       return hs;
    }
    
    public static void main(String[] args){
        Hosteller st=getHostellerDetails();
               
        st.getId();
        
        st.getName();
        
        st.getDepartmentId();
        
        st.getGender();
        
        st.getPhone();
        
       
       
      System.out.println("The Student Details:");
      System.out.println(st.getId()+" "+st.getName()+" "+st.getDepartmentId()+" "+st.getGender()+" "+st.getPhone()+" "+st.getHostelName()+" "+st.getRoomNumber());
        
        
    }
    
}