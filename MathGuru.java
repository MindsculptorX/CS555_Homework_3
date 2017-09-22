
import java.util.Scanner;


public class MathGuru {
public static void main(String[] args) {
	boolean flag = true;
	Scanner scan = new Scanner(System.in);
	do{
		System.out.println("********************************************************************************");
		System.out.println("1:2^n, with input n. For example, when n is 3, the output is 8");
		System.out.println("2:n!, with input n. For example, 5! = 5*4*3*2*1");
		System.out.println("3:fab(n) with input n. fab(n) is the nth number in the Fibonacci sequence, with 1, 1, 2, 3, 5, 8, 13, 21, 34");
		System.out.println("Please input the number before function you want to use or input exit to leave");
		System.out.println("*********************************************************************************");
		String str = scan.nextLine().toUpperCase();
	if(str.contains("1")){
		System.out.println("2^n, with input n. For example, when n is 3, the output is 8");
	}else if(str.contains("2")){
		System.out.println("n!, with input n. For example, 5! = 5*4*3*2*1");
	}else if(str.contains("3")){
		System.out.println("fab(n) with input n. fab(n) is the nth number in the Fibonacci sequence, with 1, 1, 2, 3, 5, 8, 13, 21, 34");
    System.out.println(fab(9));
	}else if(str.contains("EXIT")){
		flag=false;
	}
	System.out.println();
	}while(flag);
	System.out.println("The program is closed");
}
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