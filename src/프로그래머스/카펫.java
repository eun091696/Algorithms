package 프로그래머스;

import java.util.Arrays;

public class 카펫 {
	public int[] solution(int brown, int yellow) {
		int[] answer = new int[2];
		int sum = brown + yellow;
		
		for(int i = 1; i <= sum; i++) {
			int r = i; // row
			int c = sum / r; // column
			
			if(r > c) { //세로가 길 경우 continue;
				continue;
			}
			
			if((r - 2) * (c - 2) == yellow) {
				answer[0] = c;
				answer[1] = r;
				return answer;
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		카펫 g = new 카펫();
		int b = 8;
		int y = 1;
		System.out.println(Arrays.toString(g.solution(b, y)));

	}

}
