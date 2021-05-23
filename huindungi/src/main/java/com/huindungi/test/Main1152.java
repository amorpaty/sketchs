package com.huindungi.test;

import java.util.Scanner;

public class Main1152 {
	//´Ü¾îÀÇ °¹¼ö
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//System.out.print(sc.nextLine().trim().split(" ").length);
		String input = sc.nextLine().trim();
		
		if (input.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(input.split(" ").length);
        }
	}
}
