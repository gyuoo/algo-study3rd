import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 수정렬하기3_서빈 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] nums = new int[n];
		for (int i = 0; i < n; i++) {
			nums[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(nums);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(nums[i]).append("\n");
		}
		System.out.println(sb.toString());
	}
}
