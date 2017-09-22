
public class MathGuru {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
		System.out.println(fab(9));
	}
	
	
	//function 3 Fibonacci sequence
	public static int fab(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return fab(n - 1) + fab(n - 2); 
		}
	}
}
