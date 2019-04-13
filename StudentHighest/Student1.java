package StudentHighest;

import java.util.*;
public class Student1{
    private int id;
    private String name;
    private int[] marks;
    private float average;
    private char grade;
    
    public Student1(int id,String name,int[] marks)
    {   this.id=id;
        this.name=name;
        this.marks=marks;
        //this.grade=grade;
    }
   

	public int getId(){
        return id;
    }
   
    public String getName(){
        return name;
    }
    
    public int[] getMarks(){
        return marks;
    }
    
    /*public float getAverage(){
        return average;
    }
    
    public char getGrade(){
        return grade;
    }*/
public void calculateAvg(){
        float sum=0;
        for(int i=0;i<getMarks().length;i++){
            sum=sum+getMarks()[i];
        }
        average=(float)sum/getMarks().length;
        System.out.println("average"+ average);
        String str=String.format("%.2f",average);
        
        System.out.println("Average:"+str);
        
    }
public  void findGrade(){
        for(int i=0;i<getMarks().length;i++){
            if(getMarks()[i]<50)
            {
                grade='F';
                break;
            }
            else{
                if(average>=80 && average<=100){
                    grade='O';
                }
                else{
                    grade='A';
                    
                }
            }
        }
        System.out.println("Grade:"+grade);
    }

    
}
