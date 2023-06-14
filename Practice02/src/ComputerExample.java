
public class ComputerExample {

	public static void main(String[] args) {
		Computer mycom=new Computer();//객체 생성
		
		int result1=mycom.sum(1,2,3,4,5);
		System.out.println("result1:"+result1);
		
		int[] values= {1,2,3,4,5,6};
		int result2=mycom.sum(values);
		System.out.println("result2:"+result2);
		
		int result3=mycom.sum(new int[] {1,2,3,4,5,6,7});
		System.out.println("result3:"+result3);

	}

}
