
import java.util.Scanner;

public class ScannerExample_71p {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("x값 입력>>");
		String strx=scanner.nextLine();
		int x=Integer.parseInt(strx);
		
		System.out.print("y값 입력>>");
		String stry=scanner.nextLine();
		int y=Integer.parseInt(stry);
		
		int result=x+y;
		System.out.println("x+y="+result);

	}

}
