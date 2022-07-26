package bai_tap_tuan_30;

public class bai4 {
	public int Fibonacci(int n) {
		if(n==1 || n==2) {
			return 1;
		}
		return Fibonacci(n-1)+Fibonacci(n-2);
	}

}
