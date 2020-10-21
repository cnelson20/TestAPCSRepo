public class Demo {
	public static void main(String[] args) {
		int n;
		if (args.length == 0) {
			n = 5;
		} else {
			n = Integer.parseInt(args[0]);
		}
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(i+1);
			}
			System.out.println();
		}
	}

	public static String arrToString(int[] arr) {
		return randomArray.arrToString(arr);
	}

	public static String arrayDeepToString(int[][] arr) {
    return randomArray.arrToString(arr);
  }

	public static int[][] create2DArray(int rows, int cols, int maxValue) {
		return randomArray.create2DArray(rows,cols,maxValue);
	}

	public static int[][] create2DArrayRandomized(int rows, int cols, int maxValue) {
		return randomArray.create2DArrayRandomized(rows,cols,maxValue);
	}
}
