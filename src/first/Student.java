package first;

public class Student {
	@Override
	protected void finalize()  {
		System.err.println("finalizze executed");
		
	}
	 int studentID;
	 String studentName;
	 String CourseName;
	 int marks;
	 
	 static String CollegeName="VQube";
	 static String PrincipalName="Phaneeeendra bhupati";
	 
	 void DisplayStudentDetails() {
		 System.out.println("studentID:"+studentID);
		 System.out.println("studentName:"+studentName);
		 System.out.println("CourseName:"+CourseName);
		 System.out.println("marks:"+marks);
	 }
	 void DisplayCollegeDetails() {
		 System.out.println("College Name:"+ CollegeName);
		 System.out.println("Principal:"+PrincipalName);
	 }
	 void changePrincipal() {
		 System.out.println(PrincipalName="Phani");
	 }
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		
		s1.studentID=1;
		
		s1.studentName="Ganesh";
		s1.CourseName="JFS";
		s1.marks=100;
		s1.DisplayCollegeDetails();
		s1.changePrincipal();
		
		s2.studentID=2;
		s2.studentName="Ganeshhhhhh";
		s2.CourseName="JFS";
		s2.marks=100;
		s2.DisplayCollegeDetails();
		s2.changePrincipal();
		s3=null;
		System.gc();

	}

}
