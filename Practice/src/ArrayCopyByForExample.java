
public class ArrayCopyByForExample {

	public static void main(String[] args) {
		int[] oldIntArray= {1,2,3};//길이가 3인 배열
		int[] newIntArray=new int[5]; //길이가 5인 배열
		
		//길이가 3인 배열의 길이를 늘일 수 없으믐로 5인 배열에 항목을 복사
		
//		for(int i=0;i<oldIntArray.length;i++) {
//			newIntArray[i]=oldIntArray[i];//배열 복사
//		}
//		
//		for(int i=0;i<newIntArray.length;i++) {
//			System.out.print(newIntArray[i]+",");
//		}
		
		System.arraycopy(oldIntArray, 0, newIntArray, 0, oldIntArray.length);
		
		for(int i=0;i<newIntArray.length;i++) {
			System.out.print(newIntArray[i]+",");
		}

	}

}
