package ch13.date0530.multi;

public class GenericPFH<T extends Person & Fly & Hidden> {	//클래스와 인터페이스가 섞여 있을 땐 무조건 클래스가 먼저 와야함

	T field;

	public T getField() {
		return field;
	}

	public void setField(T field) {
		this.field = field;
	}

}
