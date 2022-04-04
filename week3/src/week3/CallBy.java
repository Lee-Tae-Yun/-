package week3;

public class CallBy {
	public static void SampleAccess(int B[],int n) {
		B[n] = 8;
		n++;
	}
	public static void main(String[] args) {
		int[] A = new int[10];
		A[5] = 7;
		int k = 5;
		SampleAccess(A, k);
		for (int i : A) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(A[k]);
	}

}
