package day1.college;
public abstract class   Student {
	private int studentId;
	private String studentName;
	private String department;
	private String gender;
	private String category;
	private double collegeFee;
	public int getStudentId() {
		
		return this.studentId;
	}
	public String getStudentName() {
		return this.studentName;
	}
	public String getDepartment() {
		return this.department;		
	}
	public String getGender() {
		return this.gender;
	}
	public String getCategory() {
		return this.category;
	}
	public double getCollegeFee() {
		return this.collegeFee;
	}
	public void  setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public void  setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void  setDepartment(String department) {
		this.department = department;
	}
	public void  setGender(String gender) {
		this.gender = gender;
	}
	public void  setCategory(String category) {
		this.category = category;
	}
	public void  setCollegeFee(double collegeFee) {
		this.collegeFee = collegeFee;
	}
	public Student(int studentId, String studentName, String category, String department, String gender, double collegeFee )
	{
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.department = department;
		this.gender = gender;
		this.category = category;
		this.collegeFee = collegeFee;
	}
	public abstract double calculateTotalFee();
}  