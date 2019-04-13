package StudentDetails;

import java.util.*;

import DepartmentDetails.Student;
public class StudentMain {
    public static Student getStudentDetails(){
    	//Student st=Student.init(...);
        Scanner sc=new Scanner(System.in);
        Student s=new Student();
        System.out.println("Enter the id:");
        int id=sc.nextInt();
        System.out.println("Enter the name:");
        String name=sc.next();
        System.out.println("Enter the no of subjects:");
        int no=sc.nextInt();
        
        label1:
        while(no<=0){
            System.out.println("Invalid number of subject");
            System.out.println("Enter the no of subjects:");
            no=sc.nextInt();
            continue label1;
        }
        if(no>0){
        int[] mark=new int[no];
        for(int i=1;i<=no;i++){
            System.out.println("Enter mark for subject "+i+":");
            mark[i-1]=sc.nextInt();
            label1:
            while(mark[i-1]<0 || mark[i-1]>100){
                System.out.println("Invalid Mark");
                System.out.println("Enter mark for subject "+i+":");
                mark[i-1]=sc.nextInt();
                continue label1;
            }
            
        }
        //.setId(id);
        //st.setName(name);
        }
        return s;
    } 
    
    
  public static void main(String[] args)
  {
      
      Student std=getStudentDetails();
      //std.getId();
      //std.getName();
      System.out.println("Id:"+std.getId());

      System.out.println("Name:"+std.getName());
      //std.findGrade();
      //std.calculateAvg();
      //System.out.println("Average:"+std.getAverage());
      //System.out.println("Grade:"+std.getGrade());
      
       
  }
    
}