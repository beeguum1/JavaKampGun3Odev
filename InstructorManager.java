package inheritanceOdev;

public class InstructorManager {
	
	public void add(Instructor instructor) {
		System.out.println(instructor.getFirstName()+ " "+ instructor.getLastName()+ " eðitmen listesine eklendi.");
	}
	
	public void delete(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" " + instructor.getLastName()+ " eðitmen listesinden silindi.");
	}
	
	public void addGivenCourses(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" "+ instructor.getLastName()+ ", "+instructor.getGivenCourses()+ " kursunu ekledi!");
	}
	
	public void addHomeworks(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" "+ instructor.getLastName()+ ", "+instructor.getGivenHomeworks()+ " ödevini ekledi!");
	}
	

}
