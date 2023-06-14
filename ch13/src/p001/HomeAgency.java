package p001;

public class HomeAgency implements Rentable<Home>{

	@Override
	public Home rent() {
		System.out.println("집을 빌렸습니다");
		return new Home();//Home객체 생성
	}
	
	
}
