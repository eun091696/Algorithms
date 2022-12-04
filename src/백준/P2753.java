package 백준;

import java.util.Scanner;

public class P2753 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int year = 0;
		
		year = in.nextInt();

		if(year % 4 == 0 && year % 100 != 0 ||year % 400 == 0) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		
	}

}
