// Task 1
public class BubbleSort {
	public static void main(String[] args) {
		// create array
		int[] numbers = new int[10000];
		int[] temp = new int[10000];
		int[] temp2 = new int[10000];

		// populate array with 10000 random numbers
		System.out.print("Array before sorting: ");
		for (int i = 0; i < 10000; i++) {
			numbers[i] = (int) (Math.random() * 100000);
			System.out.print(numbers[i] + ", ");
		}

		System.out.println();
		System.out.println();

		temp = numbers;

		long start = System.currentTimeMillis();
		bubbleSort(temp, 10000); // bubble sort array in ascending order
		long end = System.currentTimeMillis();
		System.out.print("Array after ascending sort: ");
		for (int i = 0; i < 10000; i++) {
			System.out.print(temp[i] + ", ");
		}
		System.out.println();
		System.out.printf("Execution time of ascending sort in milliseconds: %d", end - start);

		System.out.println();
		System.out.println();

		temp2 = numbers;

		long startDescend = System.currentTimeMillis();
		descendSort(temp2, 10000); // bubble sort array in descending order
		long endDescend = System.currentTimeMillis();
		System.out.print("Array after descending sort: ");
		for (int i = 0; i < 10000; i++) {
			System.out.print(numbers[i] + ", ");
		}
		System.out.println();
		System.out.printf("Execution time of descending sort in milliseconds: %d", endDescend - startDescend);

	}

	/*
	 function bubblesort (arr, size) 
	 	for i=0 to n-i-1 
	 		for j=0 to n-i-2 
	 			if arr[j]>arr[j+1] 
	 				swap arr[j] and arr[j+1]
	 */

	public static void bubbleSort(int[] numbers, int size) {
		// assign size to n
		int n = size;

		// perform bubble sort according to given algorithm
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (numbers[j] > numbers[j + 1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
		}
	}

	public static void descendSort(int[] numbers, int size) {
		// assign size to n
		int n = size;

		// perform descending bubble sort
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (numbers[j] < numbers[j + 1]) {
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
				}
			}
		}
	}

}
