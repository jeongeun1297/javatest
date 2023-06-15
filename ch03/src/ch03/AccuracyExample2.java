package ch03;

public class AccuracyExample2 {

	public static void main(String[] args) {
		int apple=1;
		int totalpie=apple*10;
		int number=7;
		
		int result=totalpie-number;
		System.out.println("10조각에서 남은 조각"+result);
		System.out.println("사과 1개에서 남은 양"+result/10.0);

	}

}
