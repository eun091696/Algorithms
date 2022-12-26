package 프로그래머스;

public class 자릿수더하기 {
	public int soultion(int n) {
		int answer = 0;
		String a = Integer.toString(n);
		for(int i = 0; i < a.length(); i++) {
			answer += Integer.parseInt(a.substring(i, i + 1));
		}
		
		return answer;
	
}
	public static void main(String[] args) {
		자릿수더하기 g = new 자릿수더하기();
		System.out.println(g.soultion(25));

	}

}
