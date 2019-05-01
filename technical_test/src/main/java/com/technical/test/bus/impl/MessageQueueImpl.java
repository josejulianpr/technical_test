/**
 * 
 */
package com.technical.test.bus.impl;

import java.io.Serializable;

import com.technical.test.bus.MessageQueue;

/**
 * @author ubuntu
 * @param <E>
 *
 */
public class MessageQueueImpl<E extends Serializable> implements MessageQueue<E> {

	/**
	 * 
	 */
	public MessageQueueImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void enqueue(E message) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E dequeue() {
		// TODO Auto-generated method stub
		return null;
	}

}
