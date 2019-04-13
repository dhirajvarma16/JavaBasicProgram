import java.util.*;
public class TestMain{
    
      
    public static Student createStudent(){
        int did;
       String dname;
        Scanner sc=new Scanner(System.in);
        Department dp=new Department();
        Student s=new Student();
        System.out.println("Enter the Student id:");
        int sid=sc.nextInt();
        System.out.println("Enter the Student name:");
        String name=sc.next();
        
        System.out.println("Enter the Department id:");
        did=sc.nextInt();
        System.out.println("Enter the Department name:");
        dname=sc.next();
        s.setSid(sid);
        s.setSname(name);
        dp.setDepartment(s);
        dp.setDid(did);
        dp.setDname(dname);
        
        return s;
        }
  public static void main(String[] args){
        Student st=createStudent();
        Department dp=st.getDepartment();
    
        
    System.out.println("Department id:"+dp.getDid());
    System.out.println("Department name:"+dp.getDname());
    System.out.println("Student id:"+st.getSid());
    System.out.println("Student name:"+st.getSname());
        
  }
    
}