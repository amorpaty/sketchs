package com.huindungi.test;

import java.util.Scanner;

public class ConsoleEx1 {

	public static void main(String[] args) {
		while (true) {
			String prompt = ">>";
			System.out.print(prompt);
			/*
			 * 
			 * 다음과 같은 내용의 코드를 넣으세요.
			 * 
			 * 1. 화면으로부터 라인단위로 입력받는다. 
			 * - java.util.Scanner클래스 사용 2. q 또는 Q를 입력하면 실행종료한다.
			 * 
			 */
			Scanner sc = new Scanner(System.in);
			prompt = sc.nextLine();
			
			if(prompt.equalsIgnoreCase("Q")) {
				//equalsIgnoreCase는  대소문자 구분없이 인식한다. 좋은 함수 ㅎㅎ 
				System.exit(0);
			}
		} // while(true)
	}
}
