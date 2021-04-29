package inheritanceOdev;

public class MainOdev {

	public static void main(String[] args) {
		
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(0);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiro�");
		instructor1.setGivenCourses("JAVA+REACT");
		instructor1.setGivenCourses("C#+ANGULAR");
		instructor1.setGivenCourses("Programlamaya giri�");
		instructor1.setGivenHomeworks("G�n 3 Inheritance");
		
		Student student1= new Student();
		student1.setId(1);
		student1.setFirstName("Beg�m");
		student1.setLastName("G�ven");
		student1.setDoneHomework("G�n 3 Inheritance");
		student1.setTakenCourses("JAVA+REACT");
		
		UserManager userManager= new UserManager();
		userManager.add(instructor1);
		userManager.add(student1);
		userManager.delete(instructor1);
		userManager.delete(student1);
		userManager.update(instructor1);
		userManager.update(student1);
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		studentManager.delete(student1);
		studentManager.addCourses(student1);
		studentManager.done(student1);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);
		instructorManager.delete(instructor1);
		instructorManager.addGivenCourses(instructor1);
		instructorManager.addHomeworks(instructor1);
		
		
		
		
		

	}

}
