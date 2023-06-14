
public class PromotionExample_54p {

	public static void main(String[] args) {
	
		byte bytevalue=10;
		int intvalue=bytevalue; //bytevalue를 넣었지만 int로 자동 변환이됨
		System.out.println("intvalue: "+intvalue);
		
		char charvalue='가';
		intvalue=charvalue;
		System.out.println("intvalue: "+intvalue); //가 를 int로 바꾸면 가의 유니코드가 출력됨
		
		intvalue=50;
		long longvalue=intvalue;
		System.out.println("longvalue: "+longvalue);
		
		
	

	}

}
