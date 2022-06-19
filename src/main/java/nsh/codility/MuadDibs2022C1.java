package nsh.codility;

public class MuadDibs2022C1 implements MuadDibs2022Interface {
	// C1
	int[] day;
	int M;

	private int min(int i1, int i2, int i3) {
		return Math.min(i1, Math.min(i2, i3));
	}

	private int dp(int i) {
		if (i > M)
			return 0;
		if (day[i] == 0)
			return dp(i + 1);
		return min(2 + dp(i + 1), 7 + dp(i + 7), 25 + dp(i + 30));
	}

	public int solution(int[] A) {
		M = A[A.length - 1];
		day = new int[M + 1];
		for (int i = 0; i < A.length; i++)
			day[A[i]] = 1;

		return dp(0);
	}
}
