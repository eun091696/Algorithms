package 프로그래머스;

public class x만큼간격이있는n개의숫자 {
	public long[] solution(int x, int n) {
		long[] answer = new long[n];
		for(int i = 0; i < n; i++) {
			answer[i] = (long)x * (i + 1);
		}
		return answer;
	}
	public static void main(String[] args) {
		x만큼간격이있는n개의숫자 g = new x만큼간격이있는n개의숫자();
		System.out.println(g.solution(-4, 2).toString());

	}

}
