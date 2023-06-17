package alone2;

public class Operation implements Oper{

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
