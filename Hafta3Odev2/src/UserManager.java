
public class UserManager extends User {

	public void add(User user) {
		System.out.println("Kullan�c� eklendi :"  + user.getFirstname() +" "+ user.getLastname());
		
	}
	
	public void delete(User user) {
		System.out.println("Kullan�c� silindi  :" + user.getFirstname()+" "+ user.getLastname());
		
	}
}
