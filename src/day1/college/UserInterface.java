package day1.college;

public class UserInterface {
	public static void main(String []args) {
//		Student s = new Student(101,"sidd","general","mca","male",1999);
//
//		
//		System.out.printf("\n %-15s : %-15s","StudentId",s.getStudentId());
//		System.out.printf("\n %-15s : %-15s","StudentName",s.getStudentName());
//		System.out.printf("\n %-15s : %-15s","C",s.getCategory());
//		System.out.printf("\n %-15s : %-15s","Gender",s.getGender());
//		System.out.printf("\n %-15s : %-15s","Department",s.getDepartment());
//		System.out.printf("\n %-15s : %-152f","CollegeFee",s.getCollegeFee());
		 
		Student student = new Hosteller(101, "sidd", "genral", "MCA", "male", 70000, 1, 'A', "AC");
		
		double totalAmount = student.calculateTotalFee();
	
		System.out.println(totalAmount);
		
	}
}
