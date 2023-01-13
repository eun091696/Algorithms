package 프로그래머스;

public class 다음큰숫자 {
	public int solution(int n) {
		int answer = 0;
		int count = Integer.bitCount(n); //bitCount() = 입력된 정수를 2진수로 변환 뒤 2진수에 포함된 1을 카운팅 해주는 메소드.
		int AnsCount = 0;
		while(true) {
			n++;
			AnsCount = Integer.bitCount(n);
			if(count == AnsCount) {
				answer = n;
				break;				
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		다음큰숫자 g = new 다음큰숫자();
		System.out.println(g.solution(78));

	}

}
