package inheritanceOdev;

public class StudentManager {
	
	public void add(Student student) {
		System.out.println(student.getFirstName()+" "+ student.getLastName()+ " öğrenci listesine eklendi.");
	}
	
	public void delete(Student student) {
		System.out.println(student.getFirstName()+" "+ student.getLastName()+ " öğrenci listesinden silindi.");
	}
	
	public void done(Student student) {
		System.out.println(student.getFirstName()+" "+ student.getLastName()+", "+ student.getDoneHomework()+ " ödevini tamamladı.");
	}
	
	public void addCourses (Student student) {
		System.out.println(student.getFirstName()+" "+ student.getLastName()+", "+ student.getTakenCourses()+ " kursunu aldı.");
	}


}
