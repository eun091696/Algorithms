package 프로그래머스;

public class 타겟넘버 {
	static int answer = 0;
	public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        return answer;
    }
    int dfs(int[] numbers, int target, int result, int index) {
        if(index == numbers.length) {
            if(target == result) {
            	answer++;
                return 0;
            }
            return 0;
        }
        dfs(numbers, target, result + numbers[index], index + 1);
        dfs(numbers, target, result - numbers[index], index + 1);
        
        return 0;
	}
	public static void main(String[] args) {
		타겟넘버 g = new 타겟넘버();
		int[] nums = {4, 1, 2, 1};
		System.out.println(g.solution(nums, 4));

	}

}
