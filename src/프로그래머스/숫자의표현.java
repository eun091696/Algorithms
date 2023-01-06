package 프로그래머스;

public class 숫자의표현 {
	public int solution(int n) {
		int answer = 0;
		for(int i = 0; i < n; i++) {
			int sum = 0;
			for(int j = i; j <=n; j++) {
				sum += j;
				if(sum == n) {
					answer++;
					
				}else if(sum > n) {
					break;
				}
			}
			
		}
		return answer;
	}
	public static void main(String[] args) {
		숫자의표현 g = new 숫자의표현();
		System.out.println(g.solution(15));

	}

}
