package day06;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		/*
		�迭
		- ���� �ڷ������� ���ӵ� ������ ����� ��.
		- �迭�� ���ٽ� index�� ����Ͽ� �����Ѵ�.
		- index(÷��)�� 0���� �����Ѵ�.
		- �ڷ���[] �迭�� �Ǵ� �ڷ��� �迭��[] �����Ѵ�. 
		*/
		
		//int num; //int������ �� �ϳ��� ���� �����ϴ�.
		int[] arr = new int[5]; //int������ 5�� ������ ������
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
		
		System.out.println( arr.length ); //�ش� �迭�� ���̸� �˷��ش�.
		for(int i=0; i<arr.length; i++) {
			arr[i] = (i+1)*100;
			System.out.println("arr[" + i + "] : " + arr[i]);
		}
		System.out.println();
		
		
		//int [] str = new int[] {10, 20, 30, 40}; //�迭�� �����ڸ��� ���� �ʱ�ȭ �Ѵ�.
		int [] str = {10, 20, 30, 40}; //new int[] ���� �����ϴ�.
		for(int s : str) {//str�� �����ִ� ���� ���������� �������ش�.
			System.out.println(s);
		}
		System.out.println();
		
		
		String[] names = new String[3]; //���ڿ� ���·� �迭�� ������ //String ���·� ���� 3�� ������
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<names.length; i++) {
			System.out.print(i + ".�̸� �Է� : ");
			names[i] = sc.next();
		}
		for(int i = 0; i<names.length; i++) {
			System.out.println(names[i]);
		}
//		for(String n : names) {
//			System.out.println("�̸� : " + n);
//		}
	}

}
