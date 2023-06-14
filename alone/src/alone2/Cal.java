package alone2;

import java.util.Scanner;

public class Cal {
	static Scanner sc=new Scanner(System.in);
	static Operation oper =new Operation(); 
	public static void main(String[] args) {
		while(true) {
			System.out.println("1.더하기\t2.빼기\t3.곱하기\t4.나누기\t5.종료");
			System.out.print("선택>>");
			String getNum=sc.nextLine();
			if(getNum.equals("1")) {
				Plus();
			}
			else if(getNum.equals("2")) {
				Minus();
			}
			else if(getNum.equals("3")) {
				Mul();
			}
			else if(getNum.equals("4")) {
				Div();
			}
			else if(getNum.equals("5")) {
				System.out.println("시스템 종료");
				System.exit(0);
			}
		}
		
	}
	public static void Plus() {
		System.out.println("----------------");
		System.out.println("------더하기------");
		System.out.println("----------------");
		try {
			System.out.print("x값 입력: ");
			int x=Integer.parseInt(sc.nextLine());
			System.out.print("y값 입력: ");
			int y=Integer.parseInt(sc.nextLine());
			System.out.println(oper.Plus(x, y));
		}catch(NumberFormatException e) {
			System.out.println("범위를 초과하였습니다.");
		}
	}
	public static void Minus() {
		System.out.println("----------------");
		System.out.println("-------빼기------");
		System.out.println("----------------");
		try {
			System.out.print("x값 입력: ");
			int x=Integer.parseInt(sc.nextLine());
			System.out.print("y값 입력: ");
			int y=Integer.parseInt(sc.nextLine());
			System.out.println(oper.Minus(x, y));
		}catch(NumberFormatException e) {
			System.out.println("범위를 초과하였습니다.");
		}
	}
	public static void Mul() {
		System.out.println("----------------");
		System.out.println("------곱하기------");
		System.out.println("----------------");
		try {
			System.out.print("x값 입력: ");
			int x=Integer.parseInt(sc.nextLine());
			System.out.print("y값 입력: ");
			int y=Integer.parseInt(sc.nextLine());
			System.out.println(oper.Mul(x, y));
		}catch(NumberFormatException e){
			System.out.println("범위를 초과하였습니다.");
		}
	}
	public static void Div() {
		System.out.println("----------------");
		System.out.println("------나누기------");
		System.out.println("----------------");
		try {
			System.out.print("x값 입력: ");
			int x=Integer.parseInt(sc.nextLine());
			System.out.print("y값 입력: ");
			int y=Integer.parseInt(sc.nextLine());
			System.out.println(oper.Div(x, y));
		}catch(NumberFormatException e) {
			System.out.println("범위를 초과하였습니다.");
		}catch(ArithmeticException e) {
			System.out.println("y값이 0 입니다.");
		}
	}

}
