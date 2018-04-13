class Rectangle{
	
	int length;
	int width;
	
	public void insert(int length,int width)
	{
		this.length = length;
		this.width = width;
	}
	
	public void displayArea() {System.out.println("Aarea = :" + length * width);
}
}
public  class TestRectangle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Rectangle r1 = new Rectangle();
		
		r1.insert(20, 10);
		r1.displayArea();

	}

}
