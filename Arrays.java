package DSA;
import java.util.*;

public class Reversearray {
	public static void reverse( int arr [])
	{
		int temp;
		int n=arr.length;
		for(int i=0;i<n/2;i++) {
			temp = arr[i];
			arr[i]= arr[n-i-1];
			arr[n-i-1] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void transpose(int[][]arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void Rotate2DAraay(int[][]arr) {
		int n= arr.length;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<i;j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		for(int i=0;i<n;i++) {
			int left =0;
			int right = n-1;
			while(left<right) {
				int temp = arr[i][left];
				arr[i][left] = arr[i][right];
				arr[i][right] =temp;
				left++;
				right--;
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<arr[0].length;j++) {
				System.out.print(arr[i][j] + " ");
			 
			}
			System.out.println();
		}
	}
	public static void SubArrays(int []arr) {
		int i=0;
		int j=0;
		int n=arr.length;
		for(i=0;i<n;i++) {
			for(j=i;j<n;j++) {
				for(int k=i;k<=j;k++) {
					System.out.print(arr[k]+ " ");
				}
				System.out.println();
			}
		}
	}
	

	public static void main(String[] args) {
		int arr [] = {1,2,3,4,5};
		System.out.print("The initial Array1 is ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.print("The Reverse of  Array1 is ");
		reverse(arr);
		System.out.print("The SubArrays of  Array1 is ");
		SubArrays(arr);
		int [][]arr2 = {{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}};
		System.out.print("The initial 2DArray is ");
		System.out.println();
		for(int i=0;i<arr2.length;i++) {
			for(int j=0;j<arr2[0].length;j++) {
				System.out.print(arr2[i][j] + " ");
			 
			}
			System.out.println();
		}
		System.out.print("The Transpose of a  2DArray is ");
		System.out.println();
		transpose(arr2);
		System.out.print("By Rotating 2DArray by 90 degrees the array will be");
		System.out.println();
		Rotate2DAraay(arr2);
  }
}
