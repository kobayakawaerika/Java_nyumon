
public class Test extends Foo{
	Test(){
		System.out.println("Test()  ");
	}
	
	Test(String s){
		System.out.println("Test(String s)");
	}
	
	public static void main(String[] args) {
		Test obj = new Test("test");
	}
}
