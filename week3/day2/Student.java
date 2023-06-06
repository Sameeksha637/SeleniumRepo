package week3.day2;

public class Student {
	
	public void getStudentInfo(int id)
	{
		System.out.println("Id:"+id);
	}
	
	public void getStudentInfo(int id, String name)
	{
		System.out.println("Id:"+id+"\t"+"Name:"+name);
	}
	
	public void getStudentInfo(String email, double Pno)
	{
		System.out.println("Email:"+email+"\t"+"PhoneNo:"+Pno);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student();
		s.getStudentInfo(1234);
		s.getStudentInfo(2123,"ABC");
		s.getStudentInfo("abc11@gmail.com",9876543210d);
		

	}

}
