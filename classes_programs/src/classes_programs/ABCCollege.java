package classes_programs;

public class ABCCollege {

	public static void main(String[] args) {
		Student studentObj=new Student(101,"Tina","ECE");
		
		studentObj.display();
		
		studentObj.setScore(9.5f);
		System.out.println(studentObj.getScore());
		
		

	}

}
