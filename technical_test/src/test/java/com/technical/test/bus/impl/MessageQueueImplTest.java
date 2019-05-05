/**
 * 
 */
package com.technical.test.bus.impl;

import static org.junit.Assert.assertTrue;

import javax.naming.NamingException;

import org.junit.Test;

import com.technical.test.bus.MessageQueue;

/**
 * @author ubuntu
 *
 */
public class MessageQueueImplTest {

	/**
	 * Test method for
	 * {@link com.technical.test.bus.impl.MessageQueueImpl#MessageQueueImpl()}.
	 */
	@Test
	public void testMessageQueueImpl() {
		MessageQueue<String> messageQueue = new MessageQueueImpl<>();
		assertTrue(messageQueue instanceof MessageQueue);
	}

	/**
	 * Test method for
	 * {@link com.technical.test.bus.impl.MessageQueueImpl#enqueue(java.io.Serializable)}.
	 */
	@Test
	public void testEnqueue() {
		assertTrue(true);
	}

	/**
	 * Test method for
	 * {@link com.technical.test.bus.impl.MessageQueueImpl#dequeue()}.
	 */
	@Test
	public void testDequeue() {
		assertTrue(true);
	}

	/**
	 * Test method for
	 * {@link com.technical.test.bus.impl.MessageQueueImpl#getInitialContext()}.
	 * 
	 * @throws NamingException
	 */
	@Test
	public void testGetInitialContext() throws NamingException {
		assertTrue(true);
	}

}
