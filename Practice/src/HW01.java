import java.util.Scanner;

public class HW01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("이름>>>");
		String name=sc.nextLine();
		
		System.out.print("국어>>>");
		int kor=Integer.parseInt(sc.nextLine());
		
		System.out.print("수학>>>");
		int mat=Integer.parseInt(sc.nextLine());
		
		System.out.print("영어>>>");
		int eng=Integer.parseInt(sc.nextLine());
		
		int tot=kor+mat+eng;
		double avg=(double)tot/3;
		
		System.out.println("이름:"+name+", 국어점수:"+kor+", 수학점수:"+mat+", 영어점수:"+eng+", 총점:"+tot+", 평균:"+avg);
		

	}

}
