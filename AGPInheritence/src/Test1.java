class Parent  {

    public void display()     {

        System.out.println("In Parent");

    }
    public void testMethod()  {

        System.out.println("In test parent method");

    } 

}

class Test1 extends Parent  { 

    public void display()  {

        System.out.println("In child");

    } 

    public void testMethod()  {

        System.out.println("In test method");

    } 

    public static void main(String[] args)  {

        Parent p = new Test1();

        p.display();        

        p.testMethod();

    }

}