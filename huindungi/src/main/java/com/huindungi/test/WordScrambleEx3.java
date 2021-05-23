package com.huindungi.test;

import java.util.Scanner;

public class WordScrambleEx3 {

	public static void main(String[] args) {
		 String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW"}; 
		 // �ڵ带 �־� �ϼ��ϼ���.
		 Scanner sc = new Scanner(System.in);
		 boolean truefalse = false;

		 while(true){
			 String answer = getAnswer(strArr);
			 String question = getScrambledWord(answer);

			 do{
				 System.out.println("Question : " + question);
				 System.out.print("Your answer is :");
				 
				 String str = sc.next();
				 String outputStr = str + "��/�� ������ �ƴմϴ�. �ٽ� �õ��غ�����";
				 		 
				 if(str.toUpperCase().equals(answer)) {
					 truefalse = true;
					 outputStr =  str + " �����Դϴ�.";
				 }else {
					 truefalse = false;
				 }
				 System.out.println(outputStr);
				 
			 }while(truefalse == false);
			 
		 }
         // hint : while���� ��ø�ؼ�(2���� while��) �ۼ��ϼ���.            

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
