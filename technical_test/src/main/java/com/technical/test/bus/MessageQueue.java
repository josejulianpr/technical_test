package com.technical.test.bus;

import java.io.Serializable;

public interface MessageQueue<E extends Serializable> {
	
	/**
	 * 
	 * @param message
	 */
	public void enqueue(E message);

	/**
	 * 
	 * @return
	 */
	public E dequeue();
}
