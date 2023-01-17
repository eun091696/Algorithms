package 프로그래머스;

public class N개의최소공배수 {
	public int solution(int[] arr) {
		int answer = 0;
		if(arr.length == 1) {
			return arr[0];
		}
		int g = 최대(arr[0], arr[1]);
		answer = (arr[0] * arr[1]) / g;
		if(arr.length > 2) {
			for(int i = 2; i < arr.length; i++) {
				g = 최대(answer, arr[i]);
				answer = (answer * arr[i]) / g;
			}
		}
		
		return answer;
	}
	
	public int 최대(int a, int b) {
		int c = 0;
		while(b != 0) {
			c = a % b;
			a = b;
			b = c;
		}
		return a;
	}
	public static void main(String[] args) {
		N개의최소공배수 g = new N개의최소공배수();
		int[] num = {2,6,8,14};
		System.out.println(g.solution(num));
	}

}
