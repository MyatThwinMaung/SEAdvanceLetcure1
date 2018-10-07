
public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int minimunNum = searchMinimun(7, 2, 9, 1, 2, 8, 10, 5);
		System.out.println("Minimun number is " + minimunNum);
	}

	private static int searchMinimun(int... list) {
		int min = list[0];
		for (int i = 1; i < list.length; i++) {
			if (min > list[i])
				min = list[i];
		}
		return min;
	}
}
