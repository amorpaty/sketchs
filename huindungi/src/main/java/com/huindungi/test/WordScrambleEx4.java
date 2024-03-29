package com.huindungi.test;

import java.util.Scanner;

public class WordScrambleEx4 {
	
	//17:02 ~ 

    public static void main(String[] args) {
        String[] strArr = { "CHANGE", "LOVE", "HOPE", "VIEW"}; 
        Scanner s = new Scanner(System.in);  // 한번 생성해 놓고 재사용하면 되므로 반복문 밖으로 이동


        while(true) {
              String answer = getAnswer(strArr);
              String question = getScrambledWord(answer);
              char[] hint = new char[answer.length()];


              // hint를 '_'로 초기화 한다. 정답이 LOVE라면 hint는 "____"이 된다.
              for(int i=0;i < hint.length;i++) {
                    hint[i] = '_';
              }

              while(true) {
                    System.out.println("Question :" + question);
                    System.out.print("Your answer is :"); 

                    String input = s.nextLine();

                    if(input.equalsIgnoreCase("q"))
                          System.exit(0);

                    if(input.equalsIgnoreCase(answer)) {
                          System.out.println("정답입니다.");
                          System.out.println();
                          break;
                    } else {
                          System.out.println(input+"은/는 정답이 아닙니다. 다시 시도해보세요.");      
                          System.out.println("Hint:"+getHint(answer,hint));
                    }
              } // while
        } // outer while

  } // main

  public static String getAnswer(String[] strArr) {
        int idx = (int)(Math.random()*strArr.length);
        return strArr[idx];
  }
 
  // 섞은 결과가 정답과 같은경우도 있을 수 있음. 복잡하지 않게... 그냥 간단히
  public static String getScrambledWord(String str) {
        char[] chArr = str.toCharArray();

        for(int i=0;i<chArr.length;i++) { 

             int idx = (int)(Math.random()*str.length());
             
              char tmp = chArr[i];
              chArr[i] = chArr[idx];
              chArr[idx] = tmp;
        }

        return new String(chArr);
  } // scramble(String str)

  public static String getHint(String answer, char[] hint) {
        int count = 0; // 힌트에 포함된 '_'의 개수
       // 1. 반복문을 이용해서 hint에 포함된 '_'의 개수를 센다.
        for(char chr : hint) {
        	String str = String.valueOf(chr);
        	if(str.equals("_")) {
        		count += 1;
        	}
        }
       // 2. count의 값이 2보다 클 때만 정답의 한 글자를 hint에 넣는다.
        if(count > 2) {
        	boolean truefalse = true;
        	do {
               	String [] strArr = answer.split(""); 
            	int idx = (int)(Math.random()*answer.length());
            	String str = strArr[idx];
            	int strCount = 0;
            	int answerCount = 0;
            	
            	for(String data : strArr) {
        			if(data.equals(str)) {
        				answerCount +=1;
        			}
        		}
            	
            	for(int i = 0; i<hint.length;i++) {
            		if(String.valueOf(hint[i]).equals(str)) {
            			strCount += 1;
            			break;
               		}
            	}
            	
            	if(strCount == answerCount) {
            		truefalse = true;
            		break;
            	}
            	
            	if(truefalse == true) {
            		for(int i = 0; i < hint.length; i++) {
            			if(String.valueOf(hint[i]).equals("_")) {
            				hint[idx] = str.charAt(0);
            				answer = "";
            				for(char data : hint) {
            					answer += data;
            					
            				}
            				
            			}else {
            				answer = "";
            				for(char data : hint) {
            					answer += data;
            					
            				}
            			}
            			break;
            		}
            	}
        		
        	}while(truefalse == false);
        }else {
        	answer = "";
        	for(char data : hint) answer += data ;
        }
       //    정답을 다 알려주는 상황이 되지 않게 하기 위함.
       //    [주의] 반드시 이전 힌트 보다 한글자를 더 보여줘야함.

       //    예를 들어 정답이 "LOVE"이고 이전 힌트가 "L___"이었다면

       //    그 다음 힌트는 "L__E"또는 "L_V_" 와 같은 식이어야 한다.

       //    Math.random()을 사용해서 정답의 한 글자를 골라서 힌트에 넣으면 된다.
	
        
        return answer;
  } // getHint()
}
