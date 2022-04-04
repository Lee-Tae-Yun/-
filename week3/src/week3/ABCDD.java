package week3;

class TestAnIm implements InterFaceTest{

@Override
public void prt1() {
	System.out.println("인터페이스는 다중 상속이 가능합니다.");
	
}

@Override
public void prt2() {
	System.out.println("implements 다음에 인터페이스를 여러 개 적을 수 있습니다.");
	
	} 
}
public class ABCDD{
	public static void main(String[] args) {
	TestAnIm a = new TestAnIm();
	a.prt1();
	a.prt2();
	}
}
