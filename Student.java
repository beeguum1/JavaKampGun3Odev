package inheritanceOdev;

public class Student extends User{
	private String takenCourses;
	private String doneHomework;
	
	public Student() {
		
		
	}

	public Student(String takenCourses, String doneHomework) {
		super();
		this.takenCourses = takenCourses;
		this.doneHomework = doneHomework;
	}

	public String getTakenCourses() {
		return takenCourses;
	}

	public void setTakenCourses(String takenCourses) {
		this.takenCourses = takenCourses;
	}

	public String getDoneHomework() {
		return doneHomework;
	}

	public void setDoneHomework(String doneHomework) {
		this.doneHomework = doneHomework;
	}

}
