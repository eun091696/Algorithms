package 백준;

import java.util.Scanner;

public class P2480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(a == b && a == c) {
			System.out.println(10000 + a * 1000);
		}else if(a == b || a == c || b == c) {
			if(a == b) {
				System.out.println(1000 + a * 100);
			}else if(a == c) {
				System.out.println(1000 + a * 100);
			}else {
				System.out.println(1000 + b * 100);
			}
		}else if(a != b && b != c) {
			if(a > b && a > c) {
				System.out.println(a * 100);				
			}else if(b > a && b > c) {
				System.out.println(b * 100);
			}else {
				System.out.println(c * 100);
			}
		}

	}

}
