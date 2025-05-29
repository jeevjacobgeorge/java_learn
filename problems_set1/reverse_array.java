package problems_set1;

public class reverse_array {
	public static void reverseArray(int[] arr) { //passed by reference
		int start = 0;
		int end = arr.length - 1;
		//Swapping the front and last elements one by one
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++; end--;
		}
	}
	public static void printArray(int[] arr) {
		System.out.print("\nArray: ");
		for (int num: arr) {
			System.out.print(num+" ");
		}
	}
	public static void main(String args[]) {
		int [] arr = {1,3,2,4,1,5,3,2,7};
		printArray(arr);
		reverseArray(arr);
		printArray(arr);
	}
}
