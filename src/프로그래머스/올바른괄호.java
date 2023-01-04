package codingTest;

import java.util.Stack;

public class 올바른괄호 {
	boolean solution(String s) {
		boolean answer = true;
		Stack<Character> st = new Stack<>();
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '(') {
				st.push(s.charAt(i));
			}else {
				if(st.isEmpty()) {
					answer = false;
				}else {
					st.pop();
				}
			}
		}
		if(st.size() > 0) {
			return false;
		}
		return answer;
	}
	public static void main(String[] args) {
		올바른괄호 g = new 올바른괄호();
		System.out.println(g.solution("(()("));

	}

}
