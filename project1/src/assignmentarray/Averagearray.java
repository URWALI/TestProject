package assignmentarray;

public class Averagearray {

	public static void main(String[] args) {
		int[] arr = { 19, 12, 16, 200, 13 };
		int total = 0;

		for (int i = 0; i < arr.length; i++) {
			total = total + arr[i];
		}

		
		int average = total / arr.length;

		
		System.out.println("The average is:" + average);
	}
}