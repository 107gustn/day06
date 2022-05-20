package day06;

import java.util.Scanner;

public class MyQuiztest {

	public static void main(String[] args) {

		String[] stName = new String[1000];
		int[] stNum = new int[1000];
		int pNum = 0, iNum, iStNum = 0, i = 0, cNum = 0, jNum = 0;
		String iStName = null;
		Scanner sc = new Scanner(System.in);

		while (pNum < 1) {
			System.out.println("\n****학생 관리 프로그램*****");
			System.out.println("1. 학생 등록");
			System.out.println("2. 학생 명부 출력");
			System.out.println("3. 학생 조회");
			System.out.println("4. 프로그램 종료");
			System.out.print(">>> ");
			iNum = sc.nextInt();

			switch (iNum) {
			case 1:
				System.out.println("학생을 등록해주세요.");
				System.out.print("학생 이름 : ");
				iStName = sc.next();
				System.out.print("학생 번호 : ");
				iStNum = sc.nextInt();

				if (i == 0 && iStNum > 0 && iStName != null) {
					stName[i] = iStName;
					stNum[i] = iStNum;
					i++;
					System.out.println("학생이 등록되었습니다.");
				} else if (iStNum > 0 && iStName != null) {
					for (int b = 0; b < i; b++) {
						if (stNum[b] != iStNum) {
							cNum = 1;
						} else {
							System.out.println("동일한 학번이 있습니다. 다시 입력하세요.");
							cNum = 0;
							break;
						}
					}
					if (cNum == 1) {
						stName[i] = iStName;
						stNum[i] = iStNum;
						i++;
						System.out.println("학생이 등록되었습니다.");
						cNum = 0;
					}
				} else {
					System.out.println("다시 입력하세요.");
				}
				break;
			case 2:
				if (i == 0) {
					System.out.println("등록된 학생이 없습니다.");
				} else {
					System.out.println("전체 학생 명단 입니다.");
					for (int a = 0; a < i; a++) {
						System.out.println("학생 이름 : " + stName[a] + "\t학생 번호 : " + stNum[a]);
					}
				}
				break;
			case 3:
				System.out.print("조회할 학생 번호를 입력하세요 : ");
				jNum = sc.nextInt();
				for(int m=0; m<i; m++) {
					if(jNum == stNum[m]) {
						System.out.println("조회하신 학생 번호는 " + stNum[m] + "이며, 학생 이름은 " + stName[m] + " 입니다.");
					}else {
						jNum = 1;
					}
					if(jNum == 1) {
						System.out.println("조회하신 번호는 없는 번호입니다.");
						jNum = 0;
					}
				}
				break;
			case 4:
				System.out.println("프로그램을 종료합니다!!!");
				pNum++;
				break;
			default:
				System.out.println("다시 입력하세요.");
			}

		}

	}

}
