package pl.sdacademy;

/**
 * A simple class to perform utility operations on arrays.
 */
class ArrayOperations {
	/**
	 * Removes an element from given array and returns a new array
	 * without this element.
	 *
	 * @param array an input array
	 * @param index an index indicating the element to remove
	 * @return the new array without the removed element
	 */
	static String[] removeElementAtIndex(String[] array, int index) {
		// TODO: implement

		// given empty array
		// 	=> empty array

		// given array with 1 element and index 0
		//	=> empty array

		// given array with 1 element and index < 0 || index > 0
		//	=> the same array

		// given array with 1 element and index == 0
		//	=> empty array

		// given array with 2 elements and index < 0 || index > 1
		//	=> the same array

		// given array with n elements and index < 0 || index > n - 1
		//	=> the same array

		// given array with 2 elements and index == 0
		//	=> array with 1 element, array[0] == oldArray[1]

		// given array with 2 elements and index == 1
		//	=> array with 1 element, array[0] == oldArray[0]

		// given array with 3 elements and index == 1
		//	=> array with 2 elements,
		// 		array[0] = oldArray[0]
		//		array[1] = oldArray[2]

		if (index < 0 || index > array.length - 1) {
			return array;
		}

		String[] result = new String[array.length - 1];
		for (int i = 0; i < index; i++) {
			result[i] = array[i];
		}
		for (int i = index + 1; i < array.length; i++) {
			result[i - 1] = array[i];
		}

		return result;
	}
}
