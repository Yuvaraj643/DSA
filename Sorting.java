package DSA;

public class Sorting {
	public static void SelectionnSort(int[] arr) {
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			int minval = arr[i];
			int minidx =i;
			for(int j=i+1; j<n;j++) {
				if(arr[j]< minval) {
					minval = arr[j];
					minidx =j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[minidx];
			arr[minidx] = temp;
		}
		for(int val : arr) {
			System.out.print(val);
		}
	}
	
	public static void BubbleSort(int [] arr) {
		int n= arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1-i;j++) {
				if(arr[j]> arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}

		}
		for(int val : arr) {
			System.out.print(val);
		}
		
	}
	public static void InsertionSort(int [] arr) {
		for(int i=1;i<arr.length;i++) {
			int key = arr[i];
			
			int j = i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1]= arr[j];
				j--;
			}
			
			arr[j+1] = key;
		}
		for(int val : arr) {
			System.out.print(val);
		}
	}

	public static void main(String[] args) {
		int[] arr = {2,1,5,9,4,3,7};
		System.out.println("Selection Sort:");
        SelectionnSort(arr);
        System.out.println();

        System.out.println("Bubble Sort:");
        BubbleSort(arr);
        System.out.println();

        System.out.println("Insertion Sort:");
        InsertionSort(arr);

	}

}
