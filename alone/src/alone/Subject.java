package alone;

public class Subject implements SJ{
	private int kor;
	private int mat;
	private int eng;
	private String name;
	public Subject() {
		
	}
	public Subject(String name,int kor,int mat, int eng) {
		this.name=name;
		this.kor=kor;
		this.mat=mat;
		this.eng=eng;
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
	public int getKor() {
		return kor;
	}
	@Override
	public void setKor(int kor) {
		this.kor=kor;
	}
	@Override
	public int getEng() {
		return eng;
	}
	@Override
	public void setEng(int eng) {
		this.eng=eng;
	}
	@Override
	public int getMat() {
		return mat;
	}
	@Override
	public void setMat(int mat) {
		this.mat=mat;
	}
	@Override
	public int getTotal() {
		return kor+eng+mat;
	}
	@Override
	public double getAvg() {
		return getTotal()/3;
	}
	
	
}
