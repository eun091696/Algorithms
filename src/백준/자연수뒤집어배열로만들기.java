package 백준;

public class 자연수뒤집어배열로만들기 {
	public int[] solution(long n) {
		String str = "" + n;
		int[] answer = new int[str.length()];
		int idx = 0;
		while(n > 0) {
			answer[idx++] = (int)(n % 10);
			n /= 10;
		}
		return answer;
	}

	public static void main(String[] args) {
		자연수뒤집어배열로만들기 g = new 자연수뒤집어배열로만들기();
		g.solution(12345);

	}

}
