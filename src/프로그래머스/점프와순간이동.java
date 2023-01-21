package codingTest;

public class 점프와순간이동 {
	public int solution(int n) {
		int ans = 0;
		while(n != 0) {
			if(n % 2 == 0) {
				n /= 2;
			}else {
				n -= 1;
				ans++;
			}
		}
		
		return ans;
	}
	public static void main(String[] args) {
		점프와순간이동 g = new 점프와순간이동();
		System.out.println(g.solution(5000));

	}

}
