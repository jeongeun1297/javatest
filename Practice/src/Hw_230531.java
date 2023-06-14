import java.util.Scanner;

public class Hw_230531 {

	public static void main(String[] args) {
		
		String[] spname=new String[5];
		int[] prices=new int[5];
		int[] count=new int[5];
		int[] total1=new int[5]; //전체상품금액(상품개별)
		int all=0; //5개 품목의 전체 합계
		
		Scanner scanner=new Scanner(System.in);
		
		for(int i=0;i<spname.length;i++) {
			int[] total2=new int[5];
			System.out.print("상품 이름>>");
			String input_spname=scanner.nextLine();
			spname[i]=input_spname; //배열에 저장
			
			System.out.print("상품 가격>>");
			int input_prices=scanner.nextInt();
			scanner.nextLine();
			prices[i]=input_prices;
			
			System.out.print("상품 개수>>");
			int input_count=scanner.nextInt();
			scanner.nextLine(); 
			count[i]=input_count;
			
			total2[i]=count[i]*prices[i];
			total1[i]+=total2[i];
			all+=total1[i];
			
			System.out.println(spname[i]+" / "+prices[i]+" / "+count[i]+" / "+total1[i]);
//			System.out.println(spname[i]+"의 "+count[i]+"개 가격은 "+total1[i]+"입니다");
			
		} 
//		System.out.println(spname[0]);
//		System.out.println(prices[0]);
//		System.out.println(count[0]);
		
		
		System.out.println("상품의 전체 가격은 "+all+"원 입니다");
	
		
	}

}
