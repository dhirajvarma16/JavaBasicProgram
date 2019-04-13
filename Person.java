public class Person
{
    private String name;
    private char gender;
    private int age;
    public void setName(String n)
    {
        this.name= n;
    }

    public String getName(){
        return name;
    }
    public char getGender(){
        return gender;
    }
    public void setGender(char ch)
    {
        this.gender= ch;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int a){
        this.age = a;
    }
}
