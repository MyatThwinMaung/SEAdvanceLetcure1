
public class Main {
	public static void main(String[] args) {
		int maximumNum = calculateMaximum(5, 8, 1, 10, 52, 20, 2, 7, 6, 7);
		System.out.println("Maximum number is " + maximumNum);
	}

	private static int calculateMaximum(int... list) {
		int max = 0;
		for (int num : list) {
			if (max < num)
				max = num;
		}
		return max;
	}
}
