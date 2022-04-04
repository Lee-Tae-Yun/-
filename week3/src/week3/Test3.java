package week3;

public class Test3 {

	public static void main(String[] args) {
		int i;
		for( i=1;i<10;i+=2) {
			System.out.print(i);
		}
		System.out.println();
		for( i=0;i<10;i++) {
			if(i%2==1) {
				System.out.print(i);
			}
		}
		for( i=1;i<=10;i++) {
			if(i%2==0) {
				continue;
				
			}
		}
		while(i<=10) {
			if(i%2==0) {
				i++;
				continue;
				
			}
			
		}
		
	}
}
