package ch13.date0530.multi;

public class GenericP<T extends Person> {

	T field;

	public T getField() {
		return field;
	}

	public void setField(T field) {
		this.field = field;
	}

}
