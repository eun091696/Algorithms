package 백준;

import java.util.Scanner;

public class P2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int min = a * 60 + b + c;
		a = min / 60;
		b = min % 60;
		if(a >= 24) {
			a = a - 24;
		}
		System.out.println(a + " " + b);
	}

}
