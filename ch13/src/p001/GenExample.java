package p001;

public class GenExample {

	public static void main(String[] args) {
		HomeAgency homeAgency=new HomeAgency();
		Home home=homeAgency.rent();
		home.trunOnLight();
		
		CarAgency carAgency=new CarAgency();
		Car car=carAgency.rent();
		car.run();

	}

}
