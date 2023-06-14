package p002;

public class Box <T>{
	public T content;
	
	public boolean compare(Box<T> ohter) {
		boolean result=content.equals(ohter.content);
		return result;
		}
	}

