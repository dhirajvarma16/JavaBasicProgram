class Parent1{

      public int display(String str, int... data)throws Exception{

            String s = "(String, int[])";

            System.out.println("Parent "+str + " " + s);

            return 1;

      }

}

 

class Child extends Parent1{

      public int display(String str, int... data){

            String s = "(String, int[])";

            System.out.println("Overridden: "+ str+" " +s);

            return 0;

      }

 

      public static void main(String... args) {

              try {                   

            Parent1 sb = new Child();

            sb.display("Welcome", 5);

            }

            catch(Exception e) {

 

            } 

      }

}