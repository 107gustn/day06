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
			System.out.println("\n****�л� ���� ���α׷�*****");
			System.out.println("1. �л� ���");
			System.out.println("2. �л� ��� ���");
			System.out.println("3. �л� ��ȸ");
			System.out.println("4. ���α׷� ����");
			System.out.print(">>> ");
			iNum = sc.nextInt();

			switch (iNum) {
			case 1:
				System.out.println("�л��� ������ּ���.");
				System.out.print("�л� �̸� : ");
				iStName = sc.next();
				System.out.print("�л� ��ȣ : ");
				iStNum = sc.nextInt();

				if (i == 0 && iStNum > 0 && iStName != null) {
					stName[i] = iStName;
					stNum[i] = iStNum;
					i++;
					System.out.println("�л��� ��ϵǾ����ϴ�.");
				} else if (iStNum > 0 && iStName != null) {
					for (int b = 0; b < i; b++) {
						if (stNum[b] != iStNum) {
							cNum = 1;
						} else {
							System.out.println("������ �й��� �ֽ��ϴ�. �ٽ� �Է��ϼ���.");
							cNum = 0;
							break;
						}
					}
					if (cNum == 1) {
						stName[i] = iStName;
						stNum[i] = iStNum;
						i++;
						System.out.println("�л��� ��ϵǾ����ϴ�.");
						cNum = 0;
					}
				} else {
					System.out.println("�ٽ� �Է��ϼ���.");
				}
				break;
			case 2:
				if (i == 0) {
					System.out.println("��ϵ� �л��� �����ϴ�.");
				} else {
					System.out.println("��ü �л� ��� �Դϴ�.");
					for (int a = 0; a < i; a++) {
						System.out.println("�л� �̸� : " + stName[a] + "\t�л� ��ȣ : " + stNum[a]);
					}
				}
				break;
			case 3:
				System.out.print("��ȸ�� �л� ��ȣ�� �Է��ϼ��� : ");
				jNum = sc.nextInt();
				for(int m=0; m<i; m++) {
					if(jNum == stNum[m]) {
						System.out.println("��ȸ�Ͻ� �л� ��ȣ�� " + stNum[m] + "�̸�, �л� �̸��� " + stName[m] + " �Դϴ�.");
					}else {
						jNum = 1;
					}
					if(jNum == 1) {
						System.out.println("��ȸ�Ͻ� ��ȣ�� ���� ��ȣ�Դϴ�.");
						jNum = 0;
					}
				}
				break;
			case 4:
				System.out.println("���α׷��� �����մϴ�!!!");
				pNum++;
				break;
			default:
				System.out.println("�ٽ� �Է��ϼ���.");
			}

		}

	}

}
