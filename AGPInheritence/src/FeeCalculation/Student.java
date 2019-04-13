package FeeCalculation;

public class Student{
    protected int id,departmentId;
    protected String name,gender,phone;
    
    public void setId(int id){
        this.id=id;
    }
    public int getId()
    {
     return id;
    }
    public void setDepartmentId(int departmentId){
        this.departmentId=departmentId;
    }
    public int getDepartmentId()
    {
     return departmentId;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName()
    {
     return name;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public String getGender()
    {
     return gender;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    public String getPhone()
    {
     return phone;
    }
    
}