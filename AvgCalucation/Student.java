package AvgCalucation;

import java.util.*;
public class Student{
    private int id;
    private String name;
    private int[] marks;
    private float average;
    private char grade;
    
    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setMarks(int[] mark){
       marks=mark;
    }
    public int[] getMarks(){
        return marks;
    }
    public void setAvg(float avarage){
        this.average=average;
    }
    public float getAvg(){
        return average;
    }
    public void setGrade(char grade){
        this.grade=grade;
    }
    public char getGrade(){
        return grade;
    }
    
    void calculateAvg() {
    	int sum=0;
    	for(int i=0;i<getMarks().length;i++) {
    		sum=sum+getMarks()[i];
    		}
    	average=sum/getMarks().length;
    	setAvg(average);
    	//System.out.println("Avarage:"+average);
    	//System.out.println("Avarage:"+getAvg());
    }
    void findgrade()
    {
    	//grade=0;
    	for(int i=0;i<getMarks().length;i++) {
    		if(getMarks()[i]<50) {
    			grade='F';
    		}
    		else{
    		if(average>=80 && average<=100) {
    			grade='O';
        		//setGrade(gd);            
        	}
        	else {
        		grade='A';
        		//setGrade(gd);
        	}
    	}
    	}
    	setGrade(grade);
    	//System.out.println("Grade:"+grade);
    		
    	}
    	
 }

