
public class Fibonacci {
	
	public static void main(String[] args) {
		
		int k = 0, a = 1, b = 1;
		
		System.out.print(a + " " + b + " ");
		while(k <= 50) {
			k = a + b;
			System.out.print(k + " ");
			a = b;
			b = k;
		}
		
	}
	
}
