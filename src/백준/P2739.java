package 백준;

import java.util.Scanner;

public class P2739 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = 0;
		n = in.nextInt();
		
		for(int i = 0; i < 9; i++) {
			System.out.println(n + " * " + (i + 1) + " = " + n * (i + 1));
		}

	}

}
