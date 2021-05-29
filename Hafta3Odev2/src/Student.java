
public class Student extends User{
 
	 private String studentnumber ;
	 
	 public Student(int id, String firstName, String lastName,String email, String pasword,  String studentnumber) {
			super(id, firstName, lastName, pasword, email);
			this.studentnumber = studentnumber;
		}


		public String getStudentnumber() {
			return studentnumber;
		}

		public void setStudentnumber(String studentnumber) {
			this.studentnumber = studentnumber;
		}
	
	
}
