
public class Instructor extends User {
	
	private String lessonname;

	public Instructor(int id, String firstName, String lastName, String email,String pasword,  String lessonname) {
		super(id, firstName, lastName, pasword, email);
		this.lessonname = lessonname;
	
		
	}

	public String getLessonname() {
		return lessonname;
	}

	public void setLessonname(String lessonname) {
		this.lessonname = lessonname;
	} 


	 
	
	 
}

	