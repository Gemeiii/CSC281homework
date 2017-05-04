/**
 * 
 * @author Arianna Liles, Brianna Ngo, Medina Nurmanova
 *
 */
package sort;

public class Bubble {

	
	public static int Descending(int[] intArray) {
		int n = intArray.length;
		int temp = 0;
		int assignmentCounter =0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (intArray[j - 1] < intArray[j]) {
					temp = intArray[j - 1];
					intArray[j - 1] = intArray[j];
					intArray[j] = temp;
					assignmentCounter = assignmentCounter+3;
				}
			}
		}
		return assignmentCounter;
	}

	public static int Ascending(int[] intArray) {
		int n = intArray.length;
		int temp = 0;

		int assignmentCounter =0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (intArray[j - 1] > intArray[j]) {
					temp = intArray[j];
					intArray[j] = intArray[j - 1];
					intArray[j - 1] = temp;
					assignmentCounter = assignmentCounter+3;
				}
			}
		}
		return assignmentCounter;
	}
}
