import java.util.Scanner;
public class Main
    {
    public static Hosteller getHostellerDetails()
    {
       Hosteller hs=new Hosteller();
       hs.getHostelName();
       hs.getRoomNumber();
       hs.getId();
       hs.getName();
      hs.getDepartmentId();
      hs.getGender();
      hs.getPhone();
       return hs;
    }
    
    public static void main(String[] args){
        Hosteller st=getHostellerDetails();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Details : ");
        System.out.println("Student Id:");
        int id;
        id=sc.nextInt();
        st.setId(id);
        st.getId();
        System.out.println("Student Name: ");
        String name;
        name=sc.next();
        st.setName(name);
        st.getName();
        System.out.println("Department Id:");
        int did;
        did=sc.nextInt();
        st.setDepartmentId(did);
        st.getDepartmentId();
        System.out.println("Gender:");
        String gender;
        gender=sc.next();
        st.setGender(gender);
        st.getGender();
        System.out.println("Phone Number:");
        String phone;
        phone=sc.next();
        st.setPhone(phone);
        st.getPhone();
        System.out.println("Hostel Name:");
        String hostname;
        hostname=sc.next();
        Hosteller host=getHostellerDetails();
        host.setHostelName(hostname);
        System.out.println("Room Number:");
        int Rno;
        Rno=sc.nextInt();
        host.setRoomNumber(Rno);
        System.out.println("Modify Room Number(Y/N):");
        String y1;
        y1=sc.next();
        if(y1.equalsIgnoreCase("Y")){
            System.out.println("New Room Number:");
            Rno=sc.nextInt();
            host.setRoomNumber(Rno);
        }
        String phone1;
        System.out.println("Modify Phone Number(Y/N):");
        String y;
        y=sc.next();
        if(y.equalsIgnoreCase("Y")){
            System.out.println("New Phone Number:");
            phone1=sc.next();
            st.setPhone(phone1);
        }
      System.out.println("The Student Details:");
      System.out.println(st.getId()+" "+st.getName()+" "+st.getDepartmentId()+" "+st.getGender()+" "+st.getPhone()+" "+host.getHostelName()+" "+host.getRoomNumber());
        
        
    }
    
}