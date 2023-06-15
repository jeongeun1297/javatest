package ch03;

public class CompareOperatorExample {

	public static void main(String[] args) {
		int num1=10;
		int num2=10;
		
		boolean result1=(num1==num2);
		boolean result2=(num1!=num2);
		boolean result3=(num1<=num2);
		
		System.out.println("result1:"+result1);
		System.out.println("result2:"+result2);
		System.out.println("result3:"+result3);
		
		char char1='A';
		char char2='B';
		
		boolean result4=(char1<char2); //아스키코드로 65와 66으로 바꿔서 비교
		
		System.out.println("result4:"+result4);
		
		int num3=1;
		double num4=1.0;
		
		boolean result5=(num3==num4);
		
		System.out.println("result5:"+result5); //연산자가 들어가면서 같은 타입으로 변환되어서 true출력
		
		float num5=0.1f;
		double num6=0.1;
		
		boolean result6=(num5==num6);
		boolean result7=(num5==(float)num6);
		
		System.out.println("result6:"+result6); //float와 double은 다르게 나옴
		System.out.println("result7:"+result7); //double을 float으로 캐스팅해야함★★★
		
		String str1="java";
		String str2="python";
		
		boolean result8=(str1.equals(str2)); //같다
		boolean result9=(!str1.equals(str2)); //같지 않다
		
		System.out.println("result8:"+result8);
		System.out.println("result9:"+result9);
		

	}

}
