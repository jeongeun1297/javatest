package app;
import pack1.A;
//import pack2.B;
import pack3.C;

public class Main {

	public static void main(String[] args) {
		A a=new A(); //A를 통해 B를 실행하도록 수정했음
		a.method();
		
//		B b=new B();
//		b.method();
		
		C c=new C();
		c.method();
		
		C result=a.getC();
		result.method();

	}

}
