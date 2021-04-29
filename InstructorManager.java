package inheritanceOdev;

public class InstructorManager {
	
	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName()+ " "+ instructor.getLastName()+ " e�itmen listesine eklendi.");
	}
	
	public void delete(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" " + instructor.getLastName()+ " e�itmen listesinden silindi.");
	}
	
	public void addGivenCourses(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" "+ instructor.getLastName()+ ", "+instructor.getGivenCourses()+ " kursunu ekledi!");
	}
	
	public void addHomeworks(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" "+ instructor.getLastName()+ ", "+instructor.getGivenHomeworks()+ " �devini ekledi!");
	}
	

}
