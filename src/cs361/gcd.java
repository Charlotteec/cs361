package cs361;

public class gcd {
	public static int gcd(int m, int n){
		if (m==n){
			return n;
		}else if(m > n){
			return gcd(m-n,n);
		}else{
			return gcd(m, n-m);
		}
	}
	public static void main(String[] args){
		System.out.println(gcd(10, 5));
	}

}
