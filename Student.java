class SampleStudent{
	int id; String name;
	
	public void initilize(int id,String name)
	{
		this.id = id;
		this.name = name;
	}
}
public class Student {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SampleStudent s1 = new SampleStudent();
		
		// Initialization through reference
		
		s1.id = 10;
		s1.name = "Indunil";
		
		System.out.println(s1.id);
		System.out.println(s1.name);
		
		SampleStudent s2 = new SampleStudent();
		
		s2.id = 20;
		s2.name = "SONY";
		System.out.println("details of 2nd Student");
		System.out.println(s2.id);
		System.out.println(s2.name);
		
	   // Initialization through reference	
	
		SampleStudent s3 = new SampleStudent();
		
		s3.initilize(25, "Manel");
		
		System.out.println("details of 3rd Student");
		System.out.println(s3.id);
		System.out.println(s3.name);

		
		
	}

}
