package com.not.serialized;

import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test2 extends Test{

	int b ;
	public Test2(int i, int b) {
		super(i);
		this.b = b;
	}

	
	private void writeObject(ObjectOutputStream objectOutputStream) throws NotSerializableException {
		throw new NotSerializableException();
	}
	
	private void readObject(ObjectInputStream objectInputStream) throws NotSerializableException {
		throw new NotSerializableException();
	}
	
}
