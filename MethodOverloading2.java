class Multipling {
	
	public static int mul(int x,int y)
	{
		return x * y;
	}
	
	public static double mul(double x,double y)
	{
		return x * y;
	}
}
public class MethodOverloading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Multipling.mul(10, 5));
		System.out.println(Multipling.mul(10.5, 2));

	}

}
