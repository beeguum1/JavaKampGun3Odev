package inheritanceOdev;

public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getId()+" numaral� kullan�c� eklendi.");
	}
	
	public void delete(User user) {
		System.out.println(user.getId()+" numaral� kullan�c� silindi.");
	}
	
	public void update(User user) {
		System.out.println(user.getId()+" numaral� kullan�c� g�ncellendi.");
	}

}
