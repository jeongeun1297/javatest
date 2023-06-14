package alone2;

public class Operation implements Oper{
	private int x;
	private int y;
//	public Operation(int x,int y) {
//		this.x=x;
//		this.y=y;
//	}
	@Override
	public int Plus(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public int Minus(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	public int Mul(int x, int y) {
		// TODO Auto-generated method stub
		return x*y;
	}

	@Override
	public double Div(int x, int y) {
		// TODO Auto-generated method stub
		return x/y;
	}

}
