package ch13.date0530.multi;

public class GenericFH<T extends Fly & Hidden> {

	T field;

	public T getField() {
		return field;
	}

	public void setField(T field) {
		this.field = field;
	}
}
