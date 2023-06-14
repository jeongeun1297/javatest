package alone;

import java.util.Scanner;

public class SJMain {
	static Scanner sc=new Scanner(System.in);
	static Subject[] sub=new Subject[100];
	public static void main(String[] args) {
		while(true) {
			
			System.out.println("\t------메뉴------");
			System.out.println("1.성적 입력\t2.전체 학생 조회\t3.성적 수정\t4.종료");
			System.out.print("선택 : ");
			String Num=sc.nextLine();
			
//			switch(Num) {
//			case "1":
//				Insert();
//				break;
//			case "2":
//				list();
//				break;
//			case "3":
//				update();
//				break;
//			case"4":
//				System.out.println("프로그램 종료");
//				System.exit(0);
//				break;
//			}
			if(Num.equals("1")) {
				Insert();
			}else if(Num.equals("2")) {
				list();
			}else if(Num.equals("3")) {
				update();
			}else if(Num.equals("4")) {
				System.out.println("프로그램종료");
				System.exit(0);
			}
		}
	}
	public static void Insert() {
		System.out.println("\t------성적입력------");
		System.out.print("이름입력: ");
		String name=sc.nextLine();
		System.out.print("국어점수 입력: ");
		int kor=Integer.parseInt(sc.nextLine());
		System.out.print("영어점수 입력: ");
		int eng=Integer.parseInt(sc.nextLine());
		System.out.print("수학점수 입력: ");
		int mat=Integer.parseInt(sc.nextLine());
		
		Subject sj=new Subject(name,kor,eng,mat);
		for(int i=0;i<sub.length;i++) {
			if(sub[i]==null) {
				sub[i]=sj;
				System.out.println("이름\t국어점수\t영어점수\t수학점수\t총 점수\t평균점수");
				System.out.println(sj.getName()+"\t"+sj.getKor()+"점\t"+sj.getEng()+"점\t"+sj.getMat()+"점\t"+sj.getTotal()+"점\t"+sj.getAvg()+"점");
				break;
			}
		}
	}
	public static void list() {
		System.out.println("\t------전체 학생 성적 조회------");
		System.out.println("이름\t국어점수\t영어점수\t수학점수\t총 점수\t평균점수");
		for(int i=0;i<sub.length;i++) {
			if(sub[i]==null) {
				System.out.println("전체 학생조회 완료");
				break;
			}
			System.out.println(sub[i].getName()+"\t"+sub[i].getKor()+"점\t"+sub[i].getEng()+"점\t"+sub[i].getMat()+"점\t"+sub[i].getTotal()+"점\t"+sub[i].getAvg()+"점");
		}
	}
	public static void update() {
		System.out.println("\t------성적 수정------");
		System.out.print("이름입력: ");
		String name=sc.nextLine();
		try {
			for (int i=0;i<sub.length;i++) {
				if(sub[i].getName().equals(name)) {
					System.out.print("국어점수 입력: ");
					int kor=Integer.parseInt(sc.nextLine());
					System.out.print("영어점수 입력: ");
					int eng=Integer.parseInt(sc.nextLine());
					System.out.print("수학점수 입력: ");
					int mat=Integer.parseInt(sc.nextLine());
					sub[i].setKor(kor);
					sub[i].setEng(eng);
					sub[i].setMat(mat);
					System.out.println(sub[i].getName()+" 학생 성적 수정완료");
					System.out.println(sub[i].getName()+"\t"+sub[i].getKor()+"점\t"+sub[i].getEng()+"점\t"+sub[i].getMat()+"\t"+sub[i].getTotal()+"점\t"+sub[i].getAvg()+"점");
					break;
				}
			}
		}catch(NullPointerException e) {
			System.out.println("조회된 학생이 없습니다.");
		}
	}
//	public static void subInsert() {
//		System.out.print("국어점수 입력: ");
//		int kor=Integer.parseInt(sc.nextLine());
//		System.out.print("영어점수 입력: ");
//		int eng=Integer.parseInt(sc.nextLine());
//		System.out.print("수학점수 입력: ");
//		int mat=Integer.parseInt(sc.nextLine());
//	}

}
