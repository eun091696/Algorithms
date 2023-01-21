package codingTest;

import java.util.Scanner;

public class º≥≈¡πË¥ﬁ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int count = 0;
		while(true) {
			if(a % 5 == 0) {
				count += a / 5;
				System.out.println(count);
				break;
			}else {
				a -= 3;
				count++;
				
			}
			if(a < 0) {
				System.out.println(-1);
				break;
			}
		}

	}

}
