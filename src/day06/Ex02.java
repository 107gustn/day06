package day06;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		/*
		배열
		- 같은 자료형으로 연속된 공간을 만드는 것.
		- 배열에 접근시 index를 사용하여 접근한다.
		- index(첨자)는 0부터 시작한다.
		- 자료형[] 배열명 또는 자료형 배열명[] 생성한다. 
		*/
		
		//int num; //int형태의 값 하나만 저장 가능하다.
		int[] arr = new int[5]; //int형태의 5개 공간을 만들음
		int num = 1;
		/*
		arr[num] = 500;
		arr[0] = 100;
		arr[2] = 200;
		*/
		/*
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		arr[4] = 500;
		System.out.println("arr[0] : " + arr[0]);
		System.out.println("arr[1] : " + arr[1]);
		System.out.println("arr[2] : " + arr[2]);
		System.out.println("arr[3] : " + arr[3]);
		System.out.println("arr[4] : " + arr[4]);
		*/
		
		System.out.println( arr.length ); //해당 배열의 길이를 알려준다.
		for(int i=0; i<arr.length; i++) {
			arr[i] = (i+1)*100;
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		System.out.println();
		
		
		//int [] str = new int[] {10, 20, 30, 40}; //배열을 만들자마자 값을 초기화 한다.
		int [] str = {10, 20, 30, 40}; //new int[] 생략 가능하다.
		for(int s : str) {//str이 갖고있는 값을 순차적으로 저장해준다.
			System.out.println(s);
		}
		System.out.println();
		
		
		String[] names = new String[3]; //문자열 형태로 배열을 만들음 //String 형태로 공간 3개 만들음
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<names.length; i++) {
			System.out.print(i + ".이름 입력 : ");
			names[i] = sc.next();
		}
		for(int i = 0; i<names.length; i++) {
			System.out.println(names[i]);
		}
//		for(String n : names) {
//			System.out.println("이름 : " + n);
//		}
	}

}
