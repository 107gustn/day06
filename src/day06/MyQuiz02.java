package day06;

import java.util.Scanner;

public class MyQuiz02 {

	public static void main(String[] args) {
		
		//�л� ���� �Է��ϰ� �л��� ��ŭ �̸��� ������ �Է¹޾� �л� �̸��� ���� ����� ����ϰ�
		//70�� �̸��� ��������̶�� �̸��� ������ ������ְ� 30���ϴ� Ż���� �Բ� �̸��� ���� ���
		
		Scanner sc = new Scanner(System.in);
		int sNum;
		
		System.out.print("�л� ���� �Է��ϼ��� : ");
		sNum = sc.nextInt();
		
		String[] sArr = new String[sNum];
		int[] iArr = new int[sNum];
		int[] riArr = new int[sNum];
		String[] rsArr = new String[sNum];
		
		for(int i=0; i<sNum; i++) {
			System.out.print((i+1) + "��° �л� �̸��� �Է����ּ��� : ");
			sArr[i] = sc.next();
			sc.nextLine();
			
			System.out.print((i+1) + "��° �л��� ������ �Է����ּ��� : ");
			iArr[i] = sc.nextInt();
		}
		
		System.out.println();
		for(int i=0; i<sNum; i++) {
			System.out.println("�л� �̸� : " + sArr[i] + "\t���� : " + iArr[i]);
		}
		System.out.println();
		
		for(int i=0; i<sNum; i++) {
			if(iArr[i] < 70 && iArr[i] > 30) {
				System.out.println("����� ����� �Դϴ�.");
				System.out.println("�л� �̸� : " + sArr[i] + "\t���� : " + iArr[i]);
			}else if(iArr[i] <= 30){
				System.out.println("Ż�� �Դϴ�.");
				System.out.println("�л� �̸� : " + sArr[i] + "\t���� : " + iArr[i]);
			}
		}
		
	}
}
