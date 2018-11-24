package pl.sdacademy;

public class ThreeDimArrayExample {
	public static void main(String[] args) {
		int[][][] cube = new int[3][4][5];

		for (int i = 0; i < cube.length; i++) {
			cube[i] = twoDimArray();
		}

		int value = cube[0][0][0];

		System.out.println(String.format("[0][0][0] = %d", value));
	}

	private static int[][] twoDimArray() {
		return new int[][]{
			// first row
			{0, 0},
			// second row
			{1, 1}};
	}
}
