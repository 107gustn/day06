package day06;

public class Quiz01 {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print(i * j + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int num1=0; num1<5 ; num1++) {
			for(int num2=1; num2<6; num2++) {
				System.out.print(num2 + (5 * num1) + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		
	}
	

}
