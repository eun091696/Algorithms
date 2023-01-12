package 프로그래머스;

import java.util.Arrays;

public class 이진변환반복하기 {
	public int[] solution(String s) {
		int[] answer = new int[2];
		int count = 0;
		int zero = 0;
		
		while(s.length() > 1) {
			int one = 0;
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) == '0') {
					zero++; //6
				}else {
					one++; //6
				}
			}
			s = Integer.toBinaryString(one);
			count++;
		}
		answer[0] = count;
		answer[1] = zero;

		return answer;
	}
	public static void main(String[] args) {
		이진변환반복하기 g = new 이진변환반복하기();
		String ex = "01110";
		System.out.println(Arrays.toString(g.solution(ex)));

	}

}
