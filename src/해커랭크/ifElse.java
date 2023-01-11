package 해커랭크;

import java.util.Scanner;

public class ifElse {
	
	private static final Scanner scanner = new Scanner(System.in);
	private static boolean test(int n) {
		if(n % 2 == 1) return true;
		if(n <= 5) return false;
		if(n <= 20) return true;
		
		return false;
	}
	
	public static void main(String[] args) {
		int N = scanner.nextInt();
		System.out.println(test(N) ? "Weird" : "Not Weird");
		
	}

}
