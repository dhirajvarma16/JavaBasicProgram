package AreaCalculation;

public class Ractangle extends Shape{
    private float width,height;
    
    public void setWidth(int width){
        this.width=width;
    }
    public float getWidth(){
        return width;
    }
    public void setHeight(int height){
        this.height=height;
    }
    public float getHeight(){
        return height;
    }
    public double calculateArea(){
        double total;
        total=getWidth()*getHeight();
        return total;
    }
    
}