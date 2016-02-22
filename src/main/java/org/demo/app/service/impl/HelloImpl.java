package org.demo.app.service.impl;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.demo.app.service.Hello;

@Singleton
public class HelloImpl implements Hello //, MonoInstance
{
	private final String hello ;
	
	// public final static boolean SINGLETON = true ;
	@Inject
	public HelloImpl() {
		this.hello = "Hello" ;
	}
	
	public HelloImpl( String hello ) {
		this.hello = hello ;
	}
	
	
	
	public String hello(String name)
	{
		return "Hello " + name ;
	}

}
