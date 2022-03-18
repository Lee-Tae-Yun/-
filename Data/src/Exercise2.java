
public class Exercise2 {
	static int count = 0;
	public static int seq(int n) {
		count++;
		if(n == 1) {
		return  1;
		}
		else {
		return seq(n-1)+3;
		}
	}
	public static void main(String[] args) {
		
		System.out.println(seq(3));
		System.out.println("seq 함수가 호출된 횟수는 "+count);

	}

}
/*
 * 
 * seq(5)를 호출하게 되면 1번 호출후 if문에서 n이 1이냐 라는 조건식에서 맞지않아서 else로 감으로써 
 * 다시 seq(5-1) 즉seq(4)를 호출 그러면 2번째 마찬가지로 조건식에 맞지않으니 else로 seq(4-1) 즉 seq(3)을 호출
 * 3번째 호출 마찬가지 조건식 맞지 않으니 seq(3-1) 즉 seq(2) 호출 하여 4번 호출 하고
 * seq(2-1) 즉 seq(1)을 호출함으로 5번째 호출 조건식 이 참이니 1을 리턴.
 */