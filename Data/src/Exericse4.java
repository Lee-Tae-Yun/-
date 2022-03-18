
public class Exericse4 {
	static int count = 0;
	static int count2 = 0;
	public static void move(int n,char a,char b,char c) {
		count++;
		if(n>0) {
			count2++;
			move(n-1,a,c,b);
			System.out.println(n+"번째 원반이 "+ a + " 기둥에서  " + b + " 기둥으로 이동");
			move(n-1,c,b,a);
			
		}
		
	}
		
	public static void main(String[] args) {
		
		move(2,'a','b','c');
		System.out.println("move함수가 호출된 횟수는 "+count+"번");
		System.out.println("원반을 옮긴 횟수는 "+count2+"번");
		
	}

}
/*
 * 
 */

