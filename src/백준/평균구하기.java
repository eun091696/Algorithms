package 백준;


public class 평균구하기 {
	public int soultion(int[] arr) {
		int answer = 0;
		for(int i : arr) {
			answer += i;
		}
		answer = answer / arr.length;
		
		return answer;
	}

	public static void main(String[] args) {
		평균구하기 g = new 평균구하기();
		int[] arr = {5,5};
		System.out.println(g.soultion(arr));

	}

}
