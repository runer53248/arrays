package pl.sdacademy;

public class Main {

	public static void main(String[] args) {
		String[] result;
		String[] array;
		int index;

		// given empty array
		// 	=> empty array
		array = new String[]{};
		index = 0;
		result = ArrayOperations.removeElementAtIndex(array, index);
		showCase(array, index, result);

		// given array with 1 element and index 0
		//	=> empty array
		array = new String[]{"hello"};
		index = 0;
		result = ArrayOperations.removeElementAtIndex(array, index);
		showCase(array, index, result);

		// given array with 1 element and index < 0 || index > 0
		//	=> the same array
		array = new String[]{"hello"};
		index = -1;
		result = ArrayOperations.removeElementAtIndex(array, index);
		showCase(array, index, result);

		index = 1;
		result = ArrayOperations.removeElementAtIndex(array, index);
		showCase(array, index, result);

		// given array with 2 elements and index < 0 || index > 1
		//	=> the same array
		array = new String[]{"0", "1"};
		index = -1;
		result = ArrayOperations.removeElementAtIndex(array, index);
		showCase(array, index, result);

		// given array with n elements and index < 0 || index > n - 1
		//	=> the same array
		array = new String[]{"0", "1", "2", "3", "4", "5"};
		index = -1;
		result = ArrayOperations.removeElementAtIndex(array, index);
		showCase(array, index, result);

		// given array with 2 elements and index == 0
		//	=> array with 1 element, array[0] == oldArray[1]
		array = new String[]{"0", "1"};
		index = 0;
		result = ArrayOperations.removeElementAtIndex(array, index);
		showCase(array, index, result);

		// given array with 2 elements and index == 1
		//	=> array with 1 element, array[0] == oldArray[0]
		array = new String[]{"0", "1"};
		index = 1;
		result = ArrayOperations.removeElementAtIndex(array, index);
		showCase(array, index, result);

		// given array with 3 elements and index == 1
		//	=> array with 2 elements,
		// 		array[0] = oldArray[0]
		//		array[1] = oldArray[2]
		array = new String[]{"0", "1", "2"};
		index = 1;
		result = ArrayOperations.removeElementAtIndex(array, index);
		showCase(array, index, result);

		array = new String[]{"0", "1", "2", "3", "4", "5", "6"};
		index = 3;
		result = ArrayOperations.removeElementAtIndex(array, index);
		showCase(array, index, result);

		// remove multiple elements
		array = new String[]{"0", "1", "2", "3"};
		result = ArrayOperations.removeElements(array, 1, 2);
		printArray(result);
	}

	private static void showCase(String[] array, int index, String[]
		result) {
		System.out.println("given:");
		System.out.print("	array: ");
		printArray(array);
		System.out.println("	index: " + index);
		System.out.print(" =>");
		printArray(result);
		System.out.println("===========");
	}

	private static void printArray(String[] array) {
		for (String element : array) {
			System.out.print(element + " ");
		}
		System.out.println();
	}
}
