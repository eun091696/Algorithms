package codingTest;

import java.util.Stack;

public class �ùٸ���ȣ {
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
		�ùٸ���ȣ g = new �ùٸ���ȣ();
		System.out.println(g.solution("(()("));

	}

}
