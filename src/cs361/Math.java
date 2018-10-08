package cs361;

public class Math {

	public static int recPow(int n) throws Exception {
		if (n >= 0 && n <= 31) {
			if (n == 0) {
				return 1;
			} else if (n == 1) {
				return n;
			} else {
				return 2 * recPow(n - 1);
			}
		}else{
		throw new Exception("not valid input");
		}
	}
	public static void main(String[] args) throws Exception {

		for (int i = 0; i <= 31; i++) {
			System.out.println(recPow(i));
			}
	}

}
