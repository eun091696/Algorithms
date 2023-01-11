package 해커랭크;

import java.util.Scanner;

public class JavaStdinAndStdout2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		sc.nextLine();
		double d = sc.nextDouble();
		sc.nextLine();
		String s = sc.nextLine();
		sc.close();

		System.out.println("i:"+i);
		System.out.println("d:"+d);
		System.out.println("s:" + s);
	}

}
