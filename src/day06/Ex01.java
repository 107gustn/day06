package day06;

public class Ex01 {

	public static void main(String[] args) {
		
		//���� �ݺ��� - �ݺ����ȿ� �Ǵٸ� �ݺ���
		int su1, su2;
		for(su1=1; su1<=5; su1++) {
			System.out.println("===for����");
			for(su2=1; su2<=5; su2++) {
				System.out.println(su1 + " : " + su2);
			}
			System.out.println("for��===");
		}
		System.out.println();
		
		int sum = 0;
		for(int i=1 ; i<10000 ; i++) {
			if(i%2 == 0)
				sum+=i;
		}
		System.out.println("1~10000 ¦ �� : " + sum);
		System.out.println();
		
		System.out.println("===������===");
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
			System.out.println();
		}
	}
}
