package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 영어끝말잇기 {
	public int[] solution(int n, String[] words) {
		int[] answer = new int[2];
		List<String> list = new ArrayList<>();
		for(int i = 0; i < words.length; i++) {
			if(list.contains(words[i])) { //list.contains(words[i])는 list에 words[i]가 있는지 확인하는 메서드이며 있으면 true 그렇지 않으면 false를 반환한다.
				answer[0] = i % n + 1; //사람
				answer[1] = i / n + 1; //번호
				break;
			}
			list.add(words[i]);
			System.out.println(i + "번째 list: " + list);
			if(i > 0 && words[i].charAt(0) != words[i - 1].charAt(words[i - 1].length() - 1)) {
				answer[0] = i % n + 1;
				answer[1] = i / n + 1;
				break;
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		영어끝말잇기 g = new 영어끝말잇기();
		int m = 2;
		String[] sArr = {"hello", "one", "even", "never", "now", "world", "draw"};
		System.out.println(Arrays.toString(g.solution(m, sArr)));
	}

}
