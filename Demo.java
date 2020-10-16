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
}
