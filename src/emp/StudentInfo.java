package emp;

public class StudentInfo {
	public void studentDetails()
	{
		System.out.println("Student Details");
		
	}
	public void stdID()
	{
		System.out.println("Student id : 123");
	}
	
	public void stdName() {
		System.out.println("Student Name : sureka");
	}
public static void main(String[] args) {
	StudentInfo std= new StudentInfo();
	std.studentDetails();
	std.stdID();
	std.stdName();
	
}
}
