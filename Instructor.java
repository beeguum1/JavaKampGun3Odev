package inheritanceOdev;

public class Instructor extends User {
	private String givenCourses;
	private String givenHomeworks;
	
	public Instructor() {
	
		
	}

	public Instructor(String givenCourses, String givenHomeworks) {
		super();
		this.givenCourses = givenCourses;
		this.givenHomeworks = givenHomeworks;
	}

	public String getGivenCourses() {
		return givenCourses;
	}

	public void setGivenCourses(String givenCourses) {
		this.givenCourses = givenCourses;
	}

	public String getGivenHomeworks() {
		return givenHomeworks;
	}

	public void setGivenHomeworks(String givenHomeworks) {
		this.givenHomeworks = givenHomeworks;
	}

}
