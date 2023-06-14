
public class ConditionalOperationExample {

	public static void main(String[] args) {
		int score=85;
		
		char grade=(score>90)?'A':((score>80)?'B':'C');
		System.out.println(score+"점은"+grade+"등급입니다");
		
		//문자열 비교
		
		String str1="권정은";
		String str2="정은";
		
		boolean result1=str1.equals(str2);
		boolean result2=!str1.equals(str2);
		
		System.out.println("result1:"+result1);
		System.out.println("result2:"+result2);
		
		int result3=-8>>3;
		System.out.println("result3:"+result3);
		
		int result4=2<<3;
		System.out.println("result4:"+result4);

	}

}
