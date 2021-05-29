
public class UserManager extends User {

	public void add(User user) {
		System.out.println("Kullanýcý eklendi :"  + user.getFirstname() +" "+ user.getLastname());
		
	}
	
	public void delete(User user) {
		System.out.println("Kullanýcý silindi  :" + user.getFirstname()+" "+ user.getLastname());
		
	}
}
