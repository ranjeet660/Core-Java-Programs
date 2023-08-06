package com.serializable;

import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class RestrictSerialization extends StudentSerialize{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private void writeObject(ObjectOutputStream objectOutputStream) throws NotSerializableException{
		throw new NotSerializableException("You are restricted");
	}

	private void readObject(ObjectInputStream objectInputStream) throws NotSerializableException{
		throw new NotSerializableException("You are resticated, dont get any data");
	}
}
