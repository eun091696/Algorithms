package 백준;

import java.util.Scanner;

public class P8393 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a = 0;
		a = in.nextInt();
		int sum = 0;
		
		for(int i = 0; i < a; i++) {
			sum = sum + (i + 1);
		}
		System.out.println(sum);

	}

}
