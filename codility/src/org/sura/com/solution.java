package org.sura.com;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class solution {
	public int binary(int N) throws IOException {
		String binary = Integer.toBinaryString(N);
		System.out.println("N�� ������ ��ȯ :" + binary);
		int length = binary.length();
		int sol = zeroCount(binary, length);
		return sol;

	}

	public int zeroCount(String binary, int length) { // �������� �ٲ۵� 0�� ���� ī����

		List<String> binaryArr = new ArrayList<>();
		int count = 0;
		int tCount = 0;
		int minCount = 0;
		int maxCount = 0;
		System.out.println("���� binary ��:" + binary);
		System.out.println("���� ����:" + length);
		for (int i = 0; i < length; i++) {

			String binarray = "" + binary.charAt(i);
			System.out.println(binarray);
			binaryArr.add(binarray);

		}
		System.out.println(binaryArr.toString());
		for (int j = 0, len = binaryArr.size(); j < len; j++) {
			System.out.println(binaryArr.get(j));
			if (Integer.parseInt(binaryArr.get(j)) == 0) {// zerocount++
				count++;
				tCount = count;
			} else { // 1�� �� 0�� ���� �ʱ�ȭ ��Ű�� ���� �ٽ� ī����
				System.out.println("1�Դϴ�.");

				if (maxCount == 0) {
					System.out.println("max0�϶� : " + tCount);
					maxCount = tCount;
					count = 0;
				} else if (maxCount > tCount) {
					System.out.println("min : " + tCount);
					minCount = tCount;
					System.out.println(minCount);
					count = 0;
				} else if (maxCount < tCount) {
					System.out.println("max : " + tCount);
					maxCount = tCount;
					count = 0;
				} else if (maxCount < minCount) {
					
					minCount = maxCount;
					count = 0;
				}
			}
		}
		System.out.println(maxCount);
		System.out.println(minCount);
		return maxCount;

	}
	public void main(String[] args) {
		
		try {
			int sol = binary(100);
			System.out.println(sol);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
