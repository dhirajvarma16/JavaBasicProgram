package AreaCalculation;

public class Circle extends Shape{
    private int radius;
    
    public void setRadius(int radius){
        this.radius=radius;
    }
    public int getRadius(){
        return radius;
    }
    public double calculateArea(){
        double total;
        total=Math.PI*getRadius()*getRadius();
        return total;
    }
}