
public class SwitchExpressionExample {

	public static void main(String[] args) {
		char grade='B'; //변경가능
		
		switch(grade) {
		case 'A','a' -> System.out.println("우수회원입니다");
		case 'B','b' -> System.out.println("일반회원입니다");
		case 'C','c' -> System.out.println("손님입니다");
		}

	}

}
