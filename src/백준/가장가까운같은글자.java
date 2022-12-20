package 백준;

public class 가장가까운같은글자 {

	public int[] soultion(String s) {
		int[] answer = new int[s.length()];
		answer[0] = -1;
		
		for(int i = 1; i < s.length(); i++) {
			int x = s.lastIndexOf(s.substring(i, i + 1), i -1);
			System.out.print("index: " + x + " ");
			if(x != -1) {
				answer[i] = i - x;
			}else {
				answer[i] = x;
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		가장가까운같은글자 g = new 가장가까운같은글자();
		for(int i : g.soultion("foobar")) {
			System.out.println(i + "");
		}
	}
}
