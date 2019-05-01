package com.technical.test.bus;

import java.io.Serializable;

import javax.jms.JMSException;
import javax.naming.NamingException;


/**

 * Interfaz con la firma de los metodos a implementar para las colas de mensajes
 * @author: Jose Julian Prado
 */
public interface MessageQueue<E extends Serializable> {
	
	/**
	 * Método para guardar mensaje en la cola
	 * @param message
	 * @throws NamingException 
	 * @throws JMSException 
	 */
	public void enqueue(E message) throws NamingException, JMSException;

	/**
	 * Método para sacar mensaje de la cola
	 * @return
	 * @throws NamingException 
	 * @throws JMSException 
	 */
	public E dequeue() throws NamingException, JMSException;
}
