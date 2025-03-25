package generics;

public class GenericContainer<T> {

	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	public GenericContainer() {
		super();
	}

	public GenericContainer(T t) {
		super();
		this.obj = t;
	}
	
	
}
