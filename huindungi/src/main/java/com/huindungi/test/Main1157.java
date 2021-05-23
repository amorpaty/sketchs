package com.huindungi.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main1157 {
	//단어 공부 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String [] strArr = sc.next().toUpperCase().split("");
		Map<String, Object> result = new HashMap<String, Object>(); 
		
		String [] stray = new String[strArr.length] ;   
		for(int i = 0; i < strArr.length; i++) {
			
			String str = strArr[i];
			
			for(int j = 1; j < strArr.length; j++) {
				if(str != strArr[j]) {
					stray [i] = str;
				}else {
					break;
				}
			}
		}
		
		for(int i = 0; i < stray.length; i++) {
			int su = 1;
			String str = strArr[i];
			
			for(int j = 1; j < strArr.length; j++) {
				if(str == strArr[j]) {
					su+=1;
				}
			}
			result.put(str, su);
		}
		
		for(int j = 0; j < strArr.length; j++) {
			String str = (String) result.get(strArr[j]);
		}
		
	}
}
