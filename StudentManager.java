package inheritanceOdev;

public class StudentManager {
	
	public void add(Student student) {
		System.out.println(student.getFirstName()+" "+ student.getLastName()+ " ��renci listesine eklendi.");
	}
	
	public void delete(Student student) {
		System.out.println(student.getFirstName()+" "+ student.getLastName()+ " ��renci listesinden silindi.");
	}
	
	public void done(Student student) {
		System.out.println(student.getFirstName()+" "+ student.getLastName()+", "+ student.getDoneHomework()+ " �devini tamamlad�.");
	}
	
	public void addCourses (Student student) {
		System.out.println(student.getFirstName()+" "+ student.getLastName()+", "+ student.getTakenCourses()+ " kursunu ald�.");
	}


}
