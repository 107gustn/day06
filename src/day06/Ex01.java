package day06;

public class Ex01 {

	public static void main(String[] args) {
		
		//이중 반복문 - 반복문안에 또다른 반복문
		int su1, su2;
		for(su1=1; su1<=5; su1++) {
			System.out.println("===for시작");
			for(su2=1; su2<=5; su2++) {
				System.out.println(su1 + " : " + su2);
			}
			System.out.println("for끝===");
		}
		System.out.println();
		
		int sum = 0;
		for(int i=1 ; i<10000 ; i++) {
			if(i%2 == 0)
				sum+=i;
		}
		System.out.println("1~10000 짝 합 : " + sum);
		System.out.println();
		
		System.out.println("===구구단===");
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
			System.out.println();
		}
	}
}
