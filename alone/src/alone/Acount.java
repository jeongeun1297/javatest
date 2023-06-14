package alone;

public class Acount implements BankInterface{
	
	private int balance;
	private String BankNum;
	private String name;
	public Acount(String BankNum, String name, int balance) {
		this.balance=balance;
		this.BankNum=BankNum;
		this.name=name;
	}


	@Override
	public String getBankNum() {
		return BankNum;
	}

	@Override
	public void setBankNum(String BankNum) {
		this.BankNum=BankNum;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name=name;
	}

	@Override
	public int getBalance() {
		return balance;
	}

	@Override
	public void setBalance(int balance) {
		this.balance=balance;
	}

}
