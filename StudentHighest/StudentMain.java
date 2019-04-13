package StudentHighest;

import java.util.*;


public class StudentMain {
    public static Student1 getStudentDetails(){
    	//Student st=Student.init(...);
    	int[] mark = null;
        Scanner sc=new Scanner(System.in);
        
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
       mark=new int[no];
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
        Student1 st=new Student1(id,name,mark);
        return st;
    } 
    
    
  public static void main(String[] args)
  {
      
      Student1 std=getStudentDetails();
      //std.getId();
      //std.getName();
      System.out.println("Id:"+std.getId());

      System.out.println("Name:"+std.getName());
      std.calculateAvg();
      std.findGrade();
      //std.findGrade();
      //std.calculateAvg();
      //System.out.println("Average:"+std.getAverage());
      //System.out.println("Grade:"+std.getGrade());
      
       
  }
    
}