package array;

public class PassingArrays {

	
	private static void printArray(int[] arr) 
	{
		System.out.println("Array method:");
		
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {

		
		int[] intArray = { 10, 20, 30, 40, 50, 60, 70, 80 };

		

		printArray(intArray); 

	}
}