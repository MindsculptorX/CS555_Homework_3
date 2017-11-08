<<<<<<< HEAD


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
		System.out.println("Please input one of the numbers before a function to select a function to perform.");
		System.out.println("*********************************************************************************");
		String str = scan.nextLine().toUpperCase();
	if(str.contains("1")){
		System.out.println("Please input the value of 2^n");
		int n = Integer.parseInt(scan.nextLine());
		while(!judge(n)) {
			System.out.println("Please input a value to raise 2 to that power.");
			n = Integer.parseInt(scan.nextLine());
		}
		System.out.println("2 raised to the power of ("+n+") is " + power(n));
	}else if(str.contains("2")){
		System.out.println("Please input the value of n!");
		int n = Integer.parseInt(scan.nextLine());
		while (!judge(n)) {
			System.out.println("Please input a value to calculate it's factorial.");
			n = Integer.parseInt(scan.nextLine());
		}
		System.out.println(n + " factorial equals: "+ factorial(n));
	}else if(str.contains("3")){
		System.out.println("Please input the value of fab(n)");
		int n = Integer.parseInt(scan.nextLine());
		while(!judge(n)){
			System.out.println("Please input the value of fab(n)");
			n = Integer.parseInt(scan.nextLine());
		}
		System.out.println("The last number of fab("+n+") is "+fab(n));
	}
	System.out.println();
	System.out.println("Please input yes if you want to try again, or input no to leave");
	str = scan.nextLine().toUpperCase();
	if(str.equals("NO")){
		flag=false;
	}
	}while(flag);
	System.out.println("The program is closed");
}

	//function 1: raise 2 to power
	public static double power(double n) {
		return Math.pow(2, n);
	}

	//function 2: factorial
	public static int factorial(int n) {
		int factor = n;
		int result = 1;

		for (int i = factor; i > 0; i--) {
			result = result * i;
		}
		return result;
	}

	//function 3 Fibonacci sequence
	public static int fab(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return fab(n - 1) + fab(n - 2);
		}
	}
	public static boolean judge(int n){
		if(n > 20){
			System.out.println("Please select a value below 20");
			return false;
		}else{
			return true;
		}
	}
}


//this line is for trying the new branch and merge.--Xi Zhang
=======

import java.util.Scanner;


public class MathGuru {
	public static void main(String[] args) {
		boolean KeepGoing = true;
		while(KeepGoing){
			System.out.println("********************************************************************************");
			System.out.println("Function 1:Get 2^n  ");
			System.out.println("Function 2:Get the N factorial ");
			System.out.println("Function 3:Get nth number in the Fibonacci sequence");
			System.out.println("Please input a numbers represent the function to run (1 2 3).");
			System.out.println("*********************************************************************************");
			
			Scanner scan = new Scanner(System.in);
			String str = scan.nextLine().toUpperCase();
			
			if(str.equals("1")){
				System.out.println("You select 2^n, please input the n");
				int input = Integer.parseInt(scan.nextLine());
				while(input>20){
					System.out.println("Please input <= 20, try again.");
					input = Integer.parseInt(scan.nextLine());
				}
				
				System.out.println(pow2(input));
				
				System.out.println("Do you want try again?(yes/no)");
				String tryAgain = scan.nextLine();
				while(!tryAgain.equals("yes") && !tryAgain.equals("no")){
					System.out.println("Please input yes or no!");
					tryAgain = scan.nextLine();
				}
				if(tryAgain.equals("no")){
					System.out.println("Program terminate!");
					return;
				}
			}else if(str.equals("2")){
				System.out.println("You select N!, please input the N");
				int input = Integer.parseInt(scan.nextLine());
				while(input>20){
					System.out.println("Please input <= 20, try again.");
					input = Integer.parseInt(scan.nextLine());
				}
				
				System.out.println(fact(input));
				
				System.out.println("Do you want try again?(yes/no)");
				String tryAgain = scan.nextLine();
				while(!tryAgain.equals("yes") && !tryAgain.equals("no")){
					System.out.println("Please input yes or no!");
					tryAgain = scan.nextLine();
				}
				if(tryAgain.equals("no")){
					System.out.println("Program terminate!");
					return;
				}				
			}else if(str.equals("3")){
				System.out.println("You select nth number in the Fibonacci, please input the n");
				int input = Integer.parseInt(scan.nextLine());
				while(input>20){
					System.out.println("Please input <= 20, try again.");
					input = Integer.parseInt(scan.nextLine());
				}
				
				System.out.println(fibo(input));
				
				System.out.println("Do you want try again?(yes/no)");
				String tryAgain = scan.nextLine();
				while(!tryAgain.equals("yes") && !tryAgain.equals("no")){
					System.out.println("Please input yes or no!");
					tryAgain = scan.nextLine();
				}
				if(tryAgain.equals("no")){
					System.out.println("Program terminate!");
					return;
				}
			}else{
				System.out.println("Please input");
			}
		}
	}

	private static int pow2(int input) {
		return (int) Math.pow(2, input);
	}
	private static int fact(int input) {
		if(input<=1){return 1;}
		return input * fact(input-1);
	}
	private static int fibo(int input) {
		if(input<=0){return -1;}//Means Error
		if(input<=2){return 1;}//first two
		return fibo(input-1) + fibo(input-2);
	}

}


//this line is for trying the new branch and merge.--Xi Zhang
>>>>>>> XiZhang_Branch
