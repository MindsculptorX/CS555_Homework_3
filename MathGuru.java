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


//This line is test for branch merge
//this line is for trying the new branch and merge.--Xi Zhang

