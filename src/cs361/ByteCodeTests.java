package cs361;

public class ByteCodeTests {
	
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}else {
			return n*fact(n-1);
		}
		
	}
	public static int gcd(int a, int b) {
		if(b==0) {
			return a;
		}else {
			return gcd(b, a%b);
		}
	}
	public static int sum_for(int n) {
		int i = 0, sum = 0;
		for (i = 0; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

	public static int sum_while(int n) {
		int i = 0, sum = 0;
		while (i <= n) {
			sum += i;
			i++;
		}
		return sum;
	}

	public static void main(String []args){
		int i = 5;
		i = i+5;

	}

}
