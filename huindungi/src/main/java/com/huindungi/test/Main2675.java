package com.huindungi.test;

import java.util.Scanner;

public class Main2675 {

	public static void main(String[] args) {
		//19:03 ~ 19:15 => 12분소요
		//문자열 반복
		Scanner sc = new Scanner(System.in);
		
		int su = sc.nextInt();
		String [] resultArr = new String [su];
		
		for(int i =0; i < su; i++) {
			int repeat = sc.nextInt();
			String str = sc.next();
			String [] strArr = str.split("");
			String sumStr = "";
			for(int j = 0; j < strArr.length; j++) {
				String text = strArr[j];
				for(int k = 0; k < repeat; k++) {
					sumStr += text;
				}
			}
			resultArr[i] = sumStr;
		}
		
		for(int i = 0; i < resultArr.length; i++) {
			System.out.println(resultArr[i]);
		}
	}
}
