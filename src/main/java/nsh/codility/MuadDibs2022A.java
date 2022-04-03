package nsh.codility;

public class MuadDibs2022A implements MuadDibs2022Interface {
	public int solution(int[] A) {
		int N = A.length;
		int Cost[] = new int[N];
		int R = 0, d7 = 0, d30 = 0;

		for (int i = 0; i < N; i++) {
			R += 2;
			if (i > 0) {
				while (i < N && i > d30 && A[i] - A[d30] >= 30)
					d30++;
				while (i < N && i > d7 && A[i] - A[d7] >= 7)
					d7++;

				R = d30 == 0 ? Math.min(R, 25) : Math.min(R, Cost[d30 - 1] + 25);
				R = d7 == 0 ? Math.min(R, 7) : Math.min(R, Cost[d7 - 1] + 7);
			}
			Cost[i] = R;
		}
		return R;
	}
}
