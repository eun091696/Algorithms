package 프로그래머스;

public class 문자열내p와y의개수 {
	boolean soultion(String s) {
		boolean answer = true;
		int p = 0;
		int y = 0;
		char a ;
		for(int i = 0; i < s.length(); i++) {
			a = s.charAt(i);
			if(a == 'p' || a == 'P') {
				p++;
			}else if(a == 'y' || a == 'Y') {
				y++;
			}
		}
		if(p != y) {
			return false; 
		}
		return answer;
	}
	public static void main(String[] args) {
		문자열내p와y의개수 g = new 문자열내p와y의개수();
		System.out.println(g.soultion("Pyy"));
	}

}
