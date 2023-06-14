package alone;

import java.util.Scanner;

public class BankApp {
	static Acount ac[]=new Acount[100];
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("1.계좌생성\t2.계좌목록\t3.예금\t4.출금\t5.종료");
			System.out.print("선택: ");
			
			String ScanNum=sc.nextLine();
			switch(ScanNum) {
			case"1":
				make();
				break;
			case"2":
				list();
				break;
			case"3":
				예금();
				break;
			case"4":
				출금();
				break;
			case"5":
				System.out.println("프로그램 종료");
				System.exit(0);
			}
		}
		
		
	}
	public static void make() {
		System.out.println("--------------------");
		System.out.println("\t계좌생성");
		System.out.println("--------------------");
		System.out.println("계좌번호 입력");
		String bankNum=sc.nextLine();
		System.out.println("계좌주 입력");
		String name=sc.nextLine();
		System.out.println("초기금액 입력");
		int balance=Integer.parseInt(sc.nextLine());
		Acount ac1=new Acount(bankNum,name,balance);
		for (int i=0;i<ac.length;i++) {
			if(ac[i]==null) {
				ac[i]=ac1;
				System.out.println(ac[i].getBankNum()+"\t"+ac[i].getName()+"\t"+ac[i].getBalance());
				break;
			}
		}
	}
	public static void list() {
		System.out.println("--------------------");
		System.out.println("계좌번호\t계좌주\t총액");
		System.out.println("--------------------");
		for(int i=0;i<ac.length;i++) {
			if(ac[i]==null) {
				break;
			}
			System.out.println(ac[i].getBankNum()+"\t"+ac[i].getName()+"\t"+ac[i].getBalance());
		}
	}
	public static void 예금() {
		System.out.println("--------------------");
		System.out.println("\t예금");
		System.out.println("--------------------");
		System.out.print("계좌번호: ");
		String banknum=sc.nextLine();
		System.out.print("예금액");
		int balance=Integer.parseInt(sc.nextLine());
		try {
			for (int i=0;i<ac.length;i++) {
				if(ac[i].getBankNum().equals(banknum)) {
					ac[i].setBalance(ac[i].getBalance()+balance);
					System.out.println(ac[i].getBalance());
					break;
					}
			}
		}catch(NullPointerException e){
			System.out.println("계좌가 없습니다.");
		}
	}
	public static void 출금() {
		System.out.println("--------------------");
		System.out.println("\t출금");
		System.out.println("--------------------");
		System.out.print("계좌번호: ");
		String banknum=sc.nextLine();
		System.out.print("출금액");
		int balance=Integer.parseInt(sc.nextLine());
		try {
			for (int i=0;i<ac.length;i++) {
				if(ac[i].getBankNum().equals(banknum)) {
					if(ac[i].getBalance()-balance<0) {
						System.out.println("잔금부족");
						ac[i].setBalance(ac[i].getBalance());
						break;
					}
					ac[i].setBalance(ac[i].getBalance()-balance);
					System.out.println(ac[i].getBalance());
					break;
					}
			}
		}catch(NullPointerException e){
			System.out.println("계좌가 없습니다.");
		}
	}
}
