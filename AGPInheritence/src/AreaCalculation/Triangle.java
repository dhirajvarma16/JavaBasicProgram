package AreaCalculation;

public class Triangle extends Shape{
    private float base;
    private float height;
    
    public void setBase(float base){
        this.base=base;
    }
    public float getBase(){
        return base;
    }
    public void setHeight(float height){
        this.height=height;
    }
    public float getHeight(){
        return height;
    }
    public double calculateArea(){
        double total;
        total=getBase()*getHeight()*0.5;
        return total;
    }
    
}