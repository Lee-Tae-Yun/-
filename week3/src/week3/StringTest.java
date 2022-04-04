package week3;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String  name;
		System.out.print("이름입력 :");
		name = sc.next();
		//if(name == "홍길동")
		if(name.equals("홍길동")){
			System.out.println("홍길동이 맞습니다.");
		}
		else {
			System.out.println("홍길동이 아닙니다.");
		}
	}

}
