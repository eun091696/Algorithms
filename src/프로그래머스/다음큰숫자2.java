package 프로그래머스;

public class 다음큰숫자2 {
	public int solution(int n) {
		int answer = 0;
		String st = Integer.toBinaryString(n);
		st = st.replaceAll("0", "");
		String numSt = "";
		int num = n;
		
		while(n > 0) {
			num++;
			numSt = Integer.toBinaryString(num);
			numSt = numSt.replaceAll("0", "");
			if(st.equals(numSt)) {
				answer = num;
				break;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		다음큰숫자2 g = new 다음큰숫자2();
		System.out.println(g.solution(78));

	}

}
