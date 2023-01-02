package 프로그래머스;

public class JadenCase문자열만들기 {
	public String solution(String s) {
		String answer = "";
		String[] strings = s.split(" ");
		for(int i = 0; i < strings.length; i++) {
			if(strings[i].length() == 0) {
				answer += " ";
			}else {
				answer += strings[i].substring(0, 1).toUpperCase() + strings[i].substring(1).toLowerCase() + " "; 
			}
			if(answer.substring(answer.length() - 1, answer.length()).equals(" ")) {
				return answer;
			}
		}
		return answer.substring(0, answer.length() - 1);
	}
	public static void main(String[] args) {
		JadenCase문자열만들기 g = new JadenCase문자열만들기();
		System.out.println(g.solution("A Aa"));

	}

}
