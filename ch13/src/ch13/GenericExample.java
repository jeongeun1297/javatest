package ch13;

public class GenericExample {

	public static void main(String[] args) {
		Box<String> box1=new Box<>();//객체생성시에 자료형 선언
		box1.content="안녕하세요";//String을 담을 수 있음
		String str=box1.content;
		System.out.println(str);
		
		Box<Integer> box2=new Box<>();
		box2.content=100;
		int value=box2.content;
		System.out.println(value);

	}

}
