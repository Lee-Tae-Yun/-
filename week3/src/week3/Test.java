package week3;

class Test2{
	public  int a,b,c;
	public static int d = 0;
	public Test2(int a, int b) {
		this(a);
		this.b = b;
	}



	public Test2(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}



	public Test2(int a) {
		super();
		this.a = a;
	}

	@Override
	public String toString() {
		return "Test2 [a=" + a + ", b=" + b + ", c=" + c + ", getClass()=" + getClass() + "]";
	}
	public static void hiHello() {
		System.out.println("Hello,Welcome");
	}
}
public class Test {
	static int cnt = 0;
	public static void testtest() {
		System.out.println("testing");
		cnt++;
	}
	
	public static void main(String[] args) {
		testtest(); testtest(); testtest(); testtest(); testtest();
		System.out.println(cnt);
	}

}
