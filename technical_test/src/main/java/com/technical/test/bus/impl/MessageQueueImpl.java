/**
 * 
 */
package com.technical.test.bus.impl;

import java.io.Serializable;
import java.util.Properties;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.QueueSession;
import javax.jms.Session;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.technical.test.bus.MessageQueue;
import com.technical.test.util.Constant;

/**
 * Implementación para la cola de mensajes
 * @author Jose Julian Prado
 * @param <E>
 *
 */
public class MessageQueueImpl<E extends Serializable> implements MessageQueue<E> {

	/**
	 * Constructor vacio
	 */
	public MessageQueueImpl() {
	}

	/**
	 * Método para guardar mensaje en la cola
	 * 
	 * @param message
	 * @throws NamingException
	 * @throws JMSException
	 */
	@Override
	public void enqueue(E message) throws NamingException, JMSException {
		Connection connection = null;
		try {
			Context context = getInitialContext();

			ConnectionFactory connectionFactory = (ConnectionFactory) context.lookup("ConnectionFactory");

			connection = connectionFactory.createConnection();

			Session session = connection.createSession(false, QueueSession.AUTO_ACKNOWLEDGE);

			Queue queue = (Queue) context.lookup(Constant.NAME_MQ);

			connection.start();

			MessageProducer producer = session.createProducer(queue);

			Message mjs = session.createObjectMessage(message);

			producer.send(mjs);
		} finally {
			if (connection != null) {
				System.out.println("close the connection");
				connection.close();
			}

		}

	}

	/**
	 * Método para sacar mensaje de la cola
	 * 
	 * @return
	 * @throws NamingException
	 * @throws JMSException
	 */
	@Override
	public E dequeue() throws NamingException, JMSException {
		Connection connection = null;
		try {
			Context context = getInitialContext();

			ConnectionFactory connectionFactory = (ConnectionFactory) context.lookup("ConnectionFactory");

			connection = connectionFactory.createConnection();

			Session session = connection.createSession(false, QueueSession.AUTO_ACKNOWLEDGE);

			Queue queue = (Queue) context.lookup(Constant.NAME_MQ);

			connection.start();

			MessageConsumer consumer = session.createConsumer(queue);

			Message mjs = consumer.receive();
			return (E) mjs.getBody(Serializable.class);
		} finally {
			if (connection != null) {
				System.out.println("close the connection");
				connection.close();
			}
		}
	}

	public static Context getInitialContext() throws NamingException {
		Properties props = new Properties();
		props.setProperty("java.naming.factory.initial", "org.jnp.interfaces.NamingContextFactory");
		props.setProperty("java.naming.factory.url.pkgs", "org.jboss.naming");
		props.setProperty("java.naming.provider.url", Constant.URL_MQ);
		Context context = new InitialContext(props);
		return context;
	}
}
