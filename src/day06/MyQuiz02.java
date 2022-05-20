package day06;

import java.util.Scanner;

public class MyQuiz02 {

	public static void main(String[] args) {
		
		//학생 수를 입력하고 학생수 만큼 이름과 점수를 입력받아 학생 이름과 점수 명단을 출력하고
		//70점 미만은 재시험대상이라고 이름과 점수를 출력해주고 30이하는 탈락과 함께 이름과 점수 출력
		
		Scanner sc = new Scanner(System.in);
		int sNum;
		
		System.out.print("학생 수를 입력하세요 : ");
		sNum = sc.nextInt();
		
		String[] sArr = new String[sNum];
		int[] iArr = new int[sNum];
		int[] riArr = new int[sNum];
		String[] rsArr = new String[sNum];
		
		for(int i=0; i<sNum; i++) {
			System.out.print((i+1) + "번째 학생 이름을 입력해주세요 : ");
			sArr[i] = sc.next();
			sc.nextLine();
			
			System.out.print((i+1) + "번째 학생의 점수를 입력해주세요 : ");
			iArr[i] = sc.nextInt();
		}
		
		System.out.println();
		for(int i=0; i<sNum; i++) {
			System.out.println("학생 이름 : " + sArr[i] + "\t점수 : " + iArr[i]);
		}
		System.out.println();
		
		for(int i=0; i<sNum; i++) {
			if(iArr[i] < 70 && iArr[i] > 30) {
				System.out.println("재시험 대상자 입니다.");
				System.out.println("학생 이름 : " + sArr[i] + "\t점수 : " + iArr[i]);
			}else if(iArr[i] <= 30){
				System.out.println("탈락 입니다.");
				System.out.println("학생 이름 : " + sArr[i] + "\t점수 : " + iArr[i]);
			}
		}
		
	}
}
