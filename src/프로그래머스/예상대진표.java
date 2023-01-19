package codingTest;

public class 예상대진표 {
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
		예상대진표 g = new 예상대진표();
		System.out.println(g.solution(8, 4, 7));

	}

}
