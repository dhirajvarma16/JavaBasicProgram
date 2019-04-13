package classes_programs;


public class Employee1{
    private static int employeeId;
    private static String employeeName;
    private static double salary;
    private static  double netSalary;
    
    public static int getEmployeeId() {
		return employeeId;
	}
	public static void setEmployeeId(int employeeId) {
		Employee1.employeeId = employeeId;
	}
	public static String getEmployeeName() {
		return employeeName;
	}
	public static void setEmployeeName(String employeeName) {
		Employee1.employeeName = employeeName;
	}
	public static double getSalary() {
		return salary;
	}
	public static void setSalary(double salary) {
		Employee1.salary = salary;
	}
	public static double getNetSalary() {
		return netSalary;
	}
	public static void setNetSalary(double netSalary) {
		Employee1.netSalary = netSalary;
	}
		/*public void setEmployeeID(int employeeId){
        this.employeeId=employeeId;
    }
    public void setEmployeeName(String employeeName){
        this.employeeName=employeeName;
    }
    public void setEmployeeSalary(double salary){
        this.salary=salary;
    }     
    public int getEmployeeId(){
        return employeeId;
    }
    public String getEmployeeName(){
        return employeeName;
    }
    
    public double getSalary(){
        return salary;
    }*/
        public void calculateNetSalary(int pfpercentage)
        {
        	netSalary=getSalary()-getSalary()*pfpercentage/100;
    }
    public double setEmployeeNet(){
        return netSalary;
    }
    public static Employee getEmployeeDetails() {
    	System.out.println("Id :"+ employeeId);
    	System.out.println("Name :"+ employeeName);
    	System.out.println("salary :"+ salary);
    	System.out.println("salary :"+ netSalary);
    	
    	
    	
		return null;
    }
    
    }