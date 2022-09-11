
// Has-A kind of relationship
public class Student {
	private int studentRegNo;
	private String studentName;
	private Date dtOfAdmission;
	
	public Student(int studentRegNo, String studentName, Date dtOfAdmission) {
		this.studentRegNo = studentRegNo;
		this.studentName = studentName;
		this.dtOfAdmission = dtOfAdmission;
	}
	
	public int getStudentRegNo() {
		return studentRegNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public Date getDtOfAdmission() {
		return dtOfAdmission;
	}

	public void displayStudent() {
		System.out.println("Student id is - " + this.studentRegNo + " Student name is - " + this.studentName + " Date of admission is - "+ this.dtOfAdmission.displayDate());
		
	}
	

}
