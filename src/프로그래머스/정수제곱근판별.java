package 프로그래머스;

public class 정수제곱근판별 {
	public long soultion(long n) {
		long answer = 0;
		double a = Math.sqrt(n); //루트 구하는 공식
		if(a % 1 == 0) {
			answer = (long)((a + 1) * (a + 1));
		}else {
			answer = -1;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		정수제곱근판별 g = new 정수제곱근판별();
		System.out.println(g.soultion(121));

	}

}
