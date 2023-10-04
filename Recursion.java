package DSA;

public class Recursion {
	public static void PrintIncreasing(int N) {
		if(N==0) {
			return;
		}
		PrintIncreasing(N-1);
		System.out.println(N);
	}
	public static void PrintArray(int[] arr , int i) {
		if(i == arr.length) {
			return;
		}
		System.out.println(arr[i]);
		PrintArray(arr, i+1);
	}	
	public static int FirstIndex(int[] arr , int x , int i) {
		if(i == arr.length) {
			return -1;
		}
		if(arr[i] == x) {
			return i;
		}
		else {
			int idx = FirstIndex(arr, x, i+1);
			return idx;
		}
	}
	public static int Factorial(int N) {
		if(N==0) {
			return 1;
		}
		int NumFact = Factorial(N-1);
		return  N*NumFact;
	}

	public static void main(String[] args) {
  		PrintIncreasing(7);
		int[] arr = {2,3,6,9,3,2,6,2,4};
		PrintArray(arr, 0);
		int x =2;
		System.out.println( FirstIndex(arr, x, 0));
		System.out.println(Factorial(5));
	}
}
