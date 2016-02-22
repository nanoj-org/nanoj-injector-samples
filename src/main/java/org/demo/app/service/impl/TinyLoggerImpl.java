package org.demo.app.service.impl;

import java.io.PrintStream;

import org.demo.app.service.TinyLogger;

public class TinyLoggerImpl implements TinyLogger {

	private final PrintStream out ;

	public TinyLoggerImpl() {
		super();
		this.out = System.out;
	}
	
	public TinyLoggerImpl(PrintStream out) {
		super();
		this.out = out;
	}

	public void print (String msg) {
		out.println("" + msg);
	}
	
	public void println (String msg) {
		out.println("" + msg);
	}
}
