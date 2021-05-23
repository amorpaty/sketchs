package com.huindungi.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main11654 {

	public static void main(String[] args) {
		//문자열 11654: 아스키코드
		//2분
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int su =  br.read();
			System.out.println(su);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
