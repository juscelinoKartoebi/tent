package sr.unasat.BinarySearchSimple;

public class LineairSearch {

	public static int lineairSearch(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String a[]) {
		int[] a1 = { 10, 20, 30, 50, 70, 90 };
		int key = 20;
		System.out.println(key + "is found at index:" + lineairSearch(a1, key));
	}
}
