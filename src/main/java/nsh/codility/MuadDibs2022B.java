package nsh.codility;

public class MuadDibs2022B implements MuadDibs2022Interface {
	// B
	public int solution(int[] A) {
		int M = A[A.length - 1] + 30;
		int dp[] = new int[M + 1];
		int day[] = new int[M];
		for (int a = 0; a < A.length; a++)
			day[A[a]] = 1;
		for (int i = M - 1; i > -1; i--)
			if (day[i] == 0)
				dp[i] = dp[i + 1];
			else
				dp[i] = Math.min(2 + dp[i + 1], Math.min(7 + dp[i + 7], 25 + dp[i + 30]));
		return dp[1];
	}
}
