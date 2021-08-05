package sr.unasat.BinarySearchSimple;

public class BinarySearch {

	public static void binarySearch(int arr[], int left, int right, int key) {
		int mid = (left + right) / 2;
		while (left <= right) {
			if (arr[mid] < key) {
				left = mid + 1;
			} else if (arr[mid] == key) {
				System.out.println("Element is found at index: " + mid);
				break;
			} else {
				right = mid - 1;
			}
			mid = (left + right) / 2;
		}
		if (left > right) {
			System.out.println("Element is not found!");
		}
	}

	public static void main(String args[]) {
		int arr[] = { 10, 20, 30, 40, 50 };
		int key = 30;
		int last = arr.length - 1;
		binarySearch(arr, 0, last, key);
	}
}