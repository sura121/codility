package org.sura.com;

public class codility2 {
	public int solution(int[] A){
		
		
	
		
		
		int num = 0;
		for (int i : A) 
				
		num ^= i;
		System.out.println(Integer.toBinaryString(num));
		
		return num;
		
	}
	
	public static void main(String[] args) {
		int[] A =new int[] {9,3,9,3,9,7,9};
		codility2 sol = new codility2();
		int correct = sol.solution(A);
		
		System.out.println(correct);
		
	}
}
