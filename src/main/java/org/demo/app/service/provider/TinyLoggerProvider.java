package org.demo.app.service.provider;

import javax.inject.Provider;

import org.demo.app.service.TinyLogger;
import org.demo.app.service.impl.TinyLoggerImpl;

/**
 * This provider example allows to control the implementation of an interface <br>
 * by creating the instance.
 *  
 * @author L. Guerin
 *
 */
public class TinyLoggerProvider implements Provider<TinyLogger> {

	public TinyLogger get() {
		TinyLogger tinyLogger = new TinyLoggerImpl(System.out);
		return tinyLogger;
	}

}
