package p003;

public class GenericExample {
	
	public static <T>Box<T>boxing(T t){//제네릭메소드
		Box<T>box=new Box<T>();
		box.set(t); //set도<T>
		return box;//return도 <T>
	}

	public static void main(String[] args) {
		Box<Integer> box1=boxing(100);
		int intValue=box1.get();
		System.out.println(intValue);
		
		Box<String> box2=boxing("권정은");
		String stringValue=box2.get();
		System.out.println(stringValue);

	}

}
