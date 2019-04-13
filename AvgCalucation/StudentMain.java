package AvgCalucation;

import java.util.*;
public class StudentMain{
	static int no;
    public static Student getStudentDetails(){
        Scanner sc=new Scanner(System.in);
        Student st=new Student();
        System.out.println("Enter the id:");
        int id=sc.nextInt();
        System.out.println("Enter the name:");
        String name=sc.next();
        
        System.out.println("Enter the no of subjects:");
        no=sc.nextInt();
        label1:  while(no<=0) {
        	System.out.println("Invalid number of subject");
        	System.out.println("Enter the no of subjects:");
            no=sc.nextInt();
            continue label1;
        }
        if(no>0) {
        	
        	int[] mark=new int[no];
        	for(int i=1;i<=no;i++){
        	   System.out.println("Enter mark of subject "+i+":");
                mark[i-1]=sc.nextInt();
                label1: while(mark[i-1]<0 || mark[i-1]>100)
                {
                	System.out.println("Invalid Mark");
                	System.out.println("Enter mark of subject "+i+":");
                    mark[i-1]=sc.nextInt();
                	continue label1;
                }
                if(mark[i-1]>=0 || mark[i-1]<=100){
                st.setMarks(mark);
                    
                }	
            st.setId(id);
            st.setName(name);
        }
        
        }
        return st;
    } 
  public static void main(String[] args)
  {
      
      Student std=getStudentDetails();
      std.getId();
      std.getName();
      
       System.out.println("Student Id"+std.getId());
       System.out.println("Student name"+std.getName());
       //System.out.println("Length"+ std.getMarks().length);
       /*for(int i=0;i<std.getMarks().length;i++){
       //std.getMarks();
           System.out.println("Student marks"+std.getMarks()[i]);
       }*/
       std.findgrade();
       std.calculateAvg();
       System.out.println("Avarage"+std.getAvg());
       System.out.println("Grade"+std.getGrade());
  }
    
}
