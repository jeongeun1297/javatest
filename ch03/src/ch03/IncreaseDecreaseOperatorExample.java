package ch03;

public class IncreaseDecreaseOperatorExample {

	public static void main(String[] args) {
		int x=10;
		int y=10;
		int z; //값을 할당하지 않고 선언만 하였음
		
		x++; //1증가
		++x; //다시 1 증가
		System.out.println("x="+x);
		
		System.out.println("------------------------------------");
		
		y--;
		--y;
		System.out.println("y="+y);
		
		System.out.println("------------------------------------");
		
		z=x++; //12을 먼저 넣고 증가시키기
		System.out.println("z="+z);
		System.out.println("x="+x);
		
		System.out.println("------------------------------------");
		
		z=++x;
		System.out.println("z="+z);
		System.out.println("x="+x);
		
		System.out.println("------------------------------------");
		
		z=++x+y++;
		System.out.println("z="+z);
		System.out.println("x="+x);
		System.out.println("x="+y);
		
		System.out.println("------------------------------------");
		

	}

}
