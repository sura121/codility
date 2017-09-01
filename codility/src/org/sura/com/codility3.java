package org.sura.com;

import java.util.Arrays;

public class codility3 {
	public int[] solution(int[] A, int K) {

		int temp;

		for (int i = 0; i < K; i++) {
			temp = A[A.length - 1];
			for (int j = A.length-2; j >= 0; j--) {
				A[j + 1] = A[j];

			}
			A[0] = temp;
			

		}

		return A;
	}

	public static void main(String[] args) {
		int[] A = new int[] { 3, 8, 9, 7, 6 };
		int K = 3;
		codility3 sol = new codility3();
		int[] sol2 = sol.solution(A, K);
		System.out.println(Arrays.toString(sol2));
	}
}
