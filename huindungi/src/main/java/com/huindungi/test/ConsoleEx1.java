package com.huindungi.test;

import java.util.Scanner;

public class ConsoleEx1 {

	public static void main(String[] args) {
		while (true) {
			String prompt = ">>";
			System.out.print(prompt);
			/*
			 * 
			 * ������ ���� ������ �ڵ带 ��������.
			 * 
			 * 1. ȭ�����κ��� ���δ����� �Է¹޴´�. 
			 * - java.util.ScannerŬ���� ��� 2. q �Ǵ� Q�� �Է��ϸ� ���������Ѵ�.
			 * 
			 */
			Scanner sc = new Scanner(System.in);
			prompt = sc.nextLine();
			
			if(prompt.equalsIgnoreCase("Q")) {
				//equalsIgnoreCase��  ��ҹ��� ���о��� �ν��Ѵ�. ���� �Լ� ���� 
				System.exit(0);
			}
		} // while(true)
	}
}
