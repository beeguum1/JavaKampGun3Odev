package inheritanceOdev;

public class UserManager {
	
	public void add(User user) {
		System.out.println(user.getId()+" numaralý kullanýcý eklendi.");
	}
	
	public void delete(User user) {
		System.out.println(user.getId()+" numaralý kullanýcý silindi.");
	}
	
	public void update(User user) {
		System.out.println(user.getId()+" numaralý kullanýcý güncellendi.");
	}

}
