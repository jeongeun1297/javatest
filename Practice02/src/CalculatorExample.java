
public class CalculatorExample {

	public static void main(String[] args) {
		Calculator cal1=new Calculator();//객체생성
		
		cal1.powerOn();
		
		int result1=cal1.plus(5, 6);
		System.out.println("plus:"+result1);
		
		int result2=cal1.min(4, 3);
		System.out.println("min:"+result2);
		
		double result3=cal1.divide(10, 2);
		System.out.println("divide:"+result3);
		
		cal1.powewrOff();
		
		

	}

}
