class AddNumbers{
	
	public static int add(int x,int y)
	{
		return x + y;
	}
	
	public static int add(int x,int y,int z)
	{
		return x + y + z;
	}
}
public class MethordOverloading1 {

	public static void main(String[] args) {
		
		System.out.println(AddNumbers.add(5,10));
		System.out.println(AddNumbers.add(10, 20,30));
		
		// TODO Auto-generated method stub

	}

}
