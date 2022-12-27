package 프로그래머스;

public class 문자열을정수로바꾸기 {
	public int solution(String s) {
		int answer = Integer.parseInt(s);
		
		return answer;
	}

	public static void main(String[] args) {
		문자열을정수로바꾸기 g = new 문자열을정수로바꾸기();
		System.out.println(g.solution("-1234"));

	}

}
