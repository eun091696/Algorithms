package 프로그래머스;


public class 하샤드수 {
	public boolean solution(int x) {
		boolean answer = true;
		int sum = 0;
		int num = x;
		while(num > 0) {
			sum += num % 10;
			num /= 10;
		}
		if(x % sum == 0) {
			answer = true;
		}else {
			answer = false;
		}
		return answer;
	}
	public static void main(String[] args) {
		하샤드수 g = new 하샤드수();
		System.out.println(g.solution(10));
	}

}
