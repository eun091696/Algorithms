package codingTest;

public class �������ǥ {
	public int solution(int n, int a, int b) {
		int answer = 0;
		while(a != b) {
			a = (a + 1) / 2; //2 1 1 
			b = (b + 1) / 2; //4 2 1
			answer++;
		}
		return answer;
	}
	public static void main(String[] args) {
		�������ǥ g = new �������ǥ();
		System.out.println(g.solution(8, 4, 7));

	}

}
