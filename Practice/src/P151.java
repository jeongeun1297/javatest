
public class P151 {

	public static void main(String[] args) {
//		int[] intArray=new int[5];
//		intArray=null;
//		intArray[0]=1;
//		
//		System.out.println(intArray[0]);
//
		
//		String name1="홍길동";
//		String name2="홍길동";
//		String name3=new String("홍길동");
//		
//		System.out.println(name1==name2);
//		System.out.println(name2==name3);
//		System.out.println(name1.equals(name3));
		
		String subject="자바프로그래밍";
		char A=subject.charAt(3);
		System.out.println(A);
		
		String name="권정은";
		String name2=name.replace("정은","세은");
		System.out.println(name2);
		
		System.out.println(name2.substring(1,2));
		int id=name2.indexOf("세은");
		System.out.println(id);
		
		int[] aaa;
		aaa=new int[] {80,99,100};
		System.out.println(aaa[0]);
		
		
		
		
		
		
		
		

	}

}
