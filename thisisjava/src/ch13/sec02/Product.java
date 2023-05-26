package ch13.sec02;

import lombok.Data;

@Data
public class Product<K, M> {
	private K kind;
	private M model;
	

}
