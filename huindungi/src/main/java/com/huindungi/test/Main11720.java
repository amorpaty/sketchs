package com.huindungi.test;

import java.util.Scanner;

public class Main11720 {

	public static void main(String[] args) {
		
		//숫자의 합
		//16분 소요
		Scanner sc = new Scanner(System.in);
		
		int su = sc.nextInt();
		String [] strArr = new String [su]; 
		int sum = 0;
		
		String str = sc.nextLine();
		System.out.println(str.toString());
		
//		for(int j = 0; j <str.length;j++) {
//			System.out.println(str[j].toString());
//		}
	
		System.out.println(sc.nextLine().split(" "));
		strArr = sc.next().split("");
		
		for(int i=0; i < strArr.length; i++) {
			sum += Integer.parseInt(strArr[i]);
		}
		System.out.println(sum);
		
	}
}
