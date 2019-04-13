abstract class Sample {

    public int x;

    Sample()      {

        x = 10;

    }

    abstract final public void display(); 

}

 

class Test extends Sample { 

    final public void display()   {

        System.out.println("x = " + x);

    }

    public static void main(String[] args)   {

        Test t = new Test();

        t.display();        

    }}