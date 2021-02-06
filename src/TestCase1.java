
public class TestCase1 {
	
	int a=5;
	public void getData() {
		
		System.out.println("in get data method");
	}

	public static void main(String[] args) {
		
	
	
		TestCase1 gd=new TestCase1();
		TestCase2 gd1=new TestCase2();
		System.out.println("Hello punjaji");
		System.out.println("Hello swara");
		System.out.println("Hello Ashwini");
		
		gd.getData();
		gd1.getName();
		
		System.out.println(gd.a);

	}

}
