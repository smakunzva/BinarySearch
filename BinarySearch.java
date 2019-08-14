

// Makes assumption that elements are in sorted order

package datastractures.binary;

public class BinarySearch {
	

	private static int[] theArray = {2, 10, 12, 14, 23, 34, 51,52,53, 54, 60 , 72, 89, 90 };

	public static void main(String[] args) {

		int numIndex = recursiveSearch(theArray,0,theArray.length, 12);
		System.out.print(numIndex);

	}

	public static int recursiveSearch(int[] myArray, int start, int end, int search) {

		// Break statement for the recursive function
		if(start >= end) {
			return -1;
		}

		int middle = (start + end) / 2;

		if(myArray[middle] == search) {
			return middle;
		} else if(myArray[middle] > search) {
		//If middle element is greater than search then search the left side
			return recursiveSearch(myArray, start, middle, search);

		} else {
		//If middle element is less than search then search the right side
			return recursiveSearch(myArray, middle + 1, end, search);
		}

	}


	public static int iterativeSearch(int[] myArray, int value) {

		int start = 0;
		int end = myArray.length;

		while(start < end) {

			int middle = (start + end) /2;

			if(myArray[middle] == search) {
				return middle;
			} else if(myArray[middle] > search) {
				end = middle;
			} else if(myArray[middle] < search) {
				start = middle + 1;
			}
		}

		return -1;
	}

}