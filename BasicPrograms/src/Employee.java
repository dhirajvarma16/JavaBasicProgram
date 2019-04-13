import java.util.*;
public class Employee{
    private int employeeId;
    private String employeeName;
    protected double salary;
    private  double netSalary;
    
    public int getEmployeeId(){
        return employeeId;
    }
    public String getEmployeeName(){
        return employeeName;
    }
    public double getSalary(){
        return salary;
    }
    public double getNetSalary(){
        return netSalary;
    }
    /*public void setEmployeeId(int Eid)
    {
        employeeId=Eid;
    }*/
    public void setEmployeeName(String empName){
        employeeName=empName;
    }
    public double setEmployeeSalary(double empSalary){
        salary=empSalary;
        return salary;
    }
    public void setEmployeeNet(double EmpNet){
        netSalary=EmpNet;
    }
	public void setEmployeeId(int id) {
		employeeId=id;
		
	}
    }