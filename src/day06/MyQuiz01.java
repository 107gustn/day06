package day06;

import java.util.Scanner;

public class MyQuiz01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("층을 입력하세요 : ");
		int num = sc.nextInt();
		
		for (int i=0; i<num ; i++) {
		    for (int j=1; j<num-i; j++) {
		    	System.out.print(" ");
		    }
		    for (int j=0; j<i*2+1; j++) {
		    	System.out.print("*");
		    }
		    System.out.println();
		}

	}

}
