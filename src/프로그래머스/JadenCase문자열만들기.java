package 프로그래머스;

public class JadenCase문자열만들기 {
	public String solution(String s) {
		String answer = "";
		String[] strings = s.split(" ");
		int num = 0;
		for(int i = s.length() - 1; i >= 0; i--) {
			if(s.charAt(i) == ' ') {
				num ++;
			}else {
				break;
			}
		}
		
		for(int i = 0; i < strings.length; i++) {
			String now = strings[i];
			if(strings[i].length() == 0) {
				answer += " ";
			}else {
				answer += now.substring(0, 1).toUpperCase() + now.substring(1).toLowerCase() + " "; 
			}
		}
		answer = answer.substring(0, answer.length() - 1);
//		
//		if(answer.substring(answer.length() - 1, answer.length()).equals(" ")) {
//			System.out.println(answer.length());
//			return answer.substring(0, answer.length() - 1);
//		}
		
		for(int i =0; i < num; i++) {
			answer += " ";
		}
		return answer;
	}
	public static void main(String[] args) {
		JadenCase문자열만들기 g = new JadenCase문자열만들기();
		System.out.println(g.solution("A Aa"));

	}

}
