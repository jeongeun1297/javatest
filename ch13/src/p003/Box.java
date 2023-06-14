package p003;

public class Box<T> {
	private T t;//필드
	
	public T get() {
		return t;
	}
	public void set(T t) {
		this.t=t;
	}
}
