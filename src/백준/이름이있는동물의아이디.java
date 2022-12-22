package codingTest;

public class 이름이있는동물의아이디 {
	public String soultion(int num) {
		
		return num % 2 == 0 ? "Even" : "Odd";
		
	}

	public static void main(String[] args) {
		이름이있는동물의아이디 g = new 이름이있는동물의아이디();
		System.out.println(g.soultion(6));
	}

}
