package com.technical.test.bus;

import java.io.Serializable;

import javax.jms.JMSException;
import javax.naming.NamingException;

public interface MessageQueue<E extends Serializable> {
	
	/**
	 * 
	 * @param message
	 * @throws NamingException 
	 * @throws JMSException 
	 */
	public void enqueue(E message) throws NamingException, JMSException;

	/**
	 * 
	 * @return
	 * @throws NamingException 
	 * @throws JMSException 
	 */
	public E dequeue() throws NamingException, JMSException;
}
