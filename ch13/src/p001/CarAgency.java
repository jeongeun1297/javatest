package p001;

public class CarAgency implements Rentable<Car>{

	@Override
	public Car rent() {
		System.out.println("자동차를 빌렸습니다");
		return new Car();
		
	}

}
