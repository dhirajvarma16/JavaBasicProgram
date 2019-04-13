package classes_programs;

public class Student {

	int studentId;
	String name;
	String department;
	float score;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		if(score>=0 && score<=10)
		this.score = score;
	}

	public Student(int studentId, String name, String department) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.department = department;
		
	}
	
	public Student(int studentId, String name, String department, float score) {
		this (studentId,name,department);
		this.score = score;
	}
	public void display() {
		System.out.println("ID"+studentId);
		System.out.println("name"+name);
		System.out.println("Department"+department);
        System.out.println("Score"+score);		
	}
	
}
