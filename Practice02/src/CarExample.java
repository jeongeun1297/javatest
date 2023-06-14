
public class CarExample {

	public static void main(String[] args) {
		Car car1=new Car("제네시스",true,80);//생성자를 호출
		System.out.println("모델명:"+car1.model+"시동여부:"+car1.start+"현재속도:"+car1.speed);
		
//		System.out.println("모델명:"+car1.model);
//		System.out.println("시동여부:"+car1.start);
//		System.out.println("현재속도:"+car1.speed);
//		
//		car1.speed=90;//도트연산자로 main에서도 접근 가능
//		
//		System.out.println("속도변경:"+car1.speed);
//		//speed를 제외한 나머지는 클래스에서 초기화 한 값으로
//		//speed는 main에서 변경한 값이 출력됨
	}

}
