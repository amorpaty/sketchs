package com.huindungi.test;

import java.util.Scanner;

public class WordScrambleEx3 {

	public static void main(String[] args) {
		 String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW"}; 
		 // 코드를 넣어 완성하세요.
		 Scanner sc = new Scanner(System.in);
		 boolean truefalse = false;

		 while(true){
			 String answer = getAnswer(strArr);
			 String question = getScrambledWord(answer);

			 do{
				 System.out.println("Question : " + question);
				 System.out.print("Your answer is :");
				 
				 String str = sc.next();
				 String outputStr = str + "은/는 정답이 아닙니다. 다시 시도해보세요";
				 		 
				 if(str.toUpperCase().equals(answer)) {
					 truefalse = true;
					 outputStr =  str + " 정답입니다.";
				 }else {
					 truefalse = false;
				 }
				 System.out.println(outputStr);
				 
			 }while(truefalse == false);
			 
		 }
         // hint : while문을 중첩해서(2개의 while문) 작성하세요.            

   } // main

	public static String getAnswer(String[] strArr) {
        int idx = (int)(Math.random()*strArr.length);
        return strArr[idx];
  }
 
  public static String getScrambledWord(String str) {
        char[] chArr = str.toCharArray();

        for(int i=0;i < str.length();i++) {
              

              int idx = (int)(Math.random()*str.length());
             
              char tmp = chArr[i];
              chArr[i] = chArr[idx];
              chArr[idx] = tmp;
        }

        return new String(chArr);
  } // scramble(String str)
}
