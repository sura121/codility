package org.sura.com;

import java.io.IOException;

public class main {

	public static void main(String[] args) {
		solution sol = new solution();
		
		try {
			int solution = sol.binary(104123);
			System.out.print("0ÀÇ °¹¼ö´Â:"+solution);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
