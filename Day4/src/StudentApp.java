
public class StudentApp {
	
	public static void main(String[] args) {
		Date date = new Date(9,9,2021);
		if(date.checkDate() == true) {
			Student student = new Student(101, "Sunil", date);
			System.out.println("Student enrolled");
			student.displayStudent();
		}else {
			System.out.println("Inavlid date format");
		}
	}
	

}
