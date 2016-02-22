package org.demo.app.service.impl;

import javax.inject.Inject;
import javax.inject.Named;

import org.demo.app.service.CalcAbstract;
import org.demo.app.service.TinyLogger;

public class CalcImpl extends CalcAbstract {

	@Inject
	private TinyLogger logger ;
	
	public CalcImpl( @Named(value="name") String name) {
		super(name);
	}

	@Override
	public int add(int a, int b) {
		logger.print("add("+a+"," +b+")");
		return a + b ;
	}

	@Override
	public int mult(int a, int b) {
		logger.print("mult("+a+"," +b+")");
		return a * b ;
	}

	@Override
	public String toString() {
		return "CalcImpl [name=" + name + "]";
	}

}
