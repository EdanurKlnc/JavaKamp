
public class Main {
public static void main(String[] args ) {
	
	Instructor instructor = new Instructor(1,"Eda","Kılınç","eda@gmail.com","SİFRE","Yazılım");
	
	Student student = new Student(2 , "Engin ", "Demiroğ","engin@gmail.com","123","1200");

	InstructorManager instructorManager = new InstructorManager();
    instructorManager.add(instructor);
    
    StudentManager studentManager = new StudentManager();
    studentManager.add(student);
    
  

 

}
}



