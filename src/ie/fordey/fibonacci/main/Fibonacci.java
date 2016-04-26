package ie.fordey.fibonacci.main;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		int n = Integer.valueOf(args[0]);
		
		for(int i=0; i<=n; i++ ){
			System.out.println(String.format("%d : %d", i, getFibSeries(i)));
		}
		
		lookForOdd();
	
	}
	
	private static long getFibSeries(long i){
		if (i <=  0){
			return 0;
		}else if (i == 1){
			return 1;
		}else{
			return (getFibSeries(i-1) + getFibSeries(i-2));
		}
	}

	
	private static void lookForOdd(){
		
		System.out.println("Enter the number to check for even/odd : ");
		Scanner in = new Scanner(System.in);
		String resText;
		int x = in.nextInt();
		
		if (x % 2 == 0){
			resText = "Even Number";
			lookForOdd();
		}
		else
		{
			resText = "Odd Number";
			System.out.println("completed found odd");
		}
		
	}
	
	
}
