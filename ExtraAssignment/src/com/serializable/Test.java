package com.serializable;

import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test extends Student{
		//Avoiding the child class serialized
	private void writeObject(ObjectOutputStream objectOutputStream) throws NotSerializableException {
		throw new NotSerializableException();
	}
	
	private void readObject(ObjectInputStream objectInputStream) throws NotSerializableException {
		throw new NotSerializableException();
	}
}
