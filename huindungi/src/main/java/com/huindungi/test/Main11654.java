package com.huindungi.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main11654 {

	public static void main(String[] args) {
		//���ڿ� 11654: �ƽ�Ű�ڵ�
		//2��
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			int su =  br.read();
			System.out.println(su);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
