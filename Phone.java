
public class Phone {
	Phone(int price,String name){
		
		System.out.println("Price :" + price);
		System.out.println("Namae :" + name);
		
	}
	
	Phone(int price,String name,String brand){
		
		System.out.println("Price :" + price);
		System.out.println("Namae :" + name);
		System.out.println("Brand :" + brand);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Phone p1 = new Phone(1000,"J5 Prime");
		Phone p2 = new Phone(2000,"Xperia Z2","SONY");

	}

}
