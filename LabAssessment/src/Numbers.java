import java.util.Arrays;

public class Numbers {

	public static void main(String[] args) {
		for (int i = 1; i <= 20; i++) {
			System.out.println(Arrays.toString(getSomeGoofyNumbers(i)));
		}
	}

	public static boolean isGoofy(int num) {
		if (num >= 0) {
			String s = Integer.toString(num);
			int total = 0;
			for (int i = 0; i < s.length(); i++) {
				int n = Integer.parseInt("" + s.charAt(i));
				if (n != 0 && num % n == 0) {
					total += n;
				}
			}
			if (total % 2 == 1) {
				return true;
			}
		} else {
			throw new IllegalArgumentException("Number must be greater than or equal to 0.");
		}
		return false;
	}

	public static int[] getSomeGoofyNumbers(int count) {
		int[] goofyNumbers = new int[count];
		int n = 1;
		if (count > 0) {
			for (int i = 0; i < goofyNumbers.length; i++) {
				while (!isGoofy(n)) {
					n++;
				}
				goofyNumbers[i] = n;
				n++;
			}
			return goofyNumbers;
		} else {
			throw new IllegalArgumentException("Count must be positive.");
		}
	}

}
