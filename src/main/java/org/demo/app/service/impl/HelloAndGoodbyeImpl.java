package org.demo.app.service.impl;

import javax.inject.Inject;

import org.demo.app.service.Goodbye;
import org.demo.app.service.Hello;
import org.demo.app.service.HelloAndGoodbye;

/**
 * Service using other services ( service with dependencies )
 *
 */
public class HelloAndGoodbyeImpl implements HelloAndGoodbye {

	private final Hello    hello  ;
	
	@Inject
	private Goodbye  goodbye = null ;
	
	
//	/**
//	 * Option 1 : No dependence injection 
//	 */
//	@Inject
//	public HelloAndGoodbyeImpl() {
//		super();
//		hello = new HelloImpl();
//		goodbye = new GoodbyeImpl();
//	}

	/**
	 * Option 2 : With dependence injection  
	 * Dependence injection using the constructor
	 */
	@Inject
	public HelloAndGoodbyeImpl(Hello hello) {
		super();
		this.hello = hello ;
	}

	public HelloAndGoodbyeImpl(Hello hello, Goodbye goodbye) {
		super();
		this.hello = hello ;
		this.goodbye = goodbye ;
	}
	
	//-----------------------------------------------------------------
	public String hello(String name)
	{
		return hello.hello(name) ;
	}
	
	public String goodbye(String name)
	{
		return goodbye.goodbye(name);
	}

	public String helloAndGoodbye(String name)
	{
		return hello.hello(name) + ", " + goodbye.goodbye(name);
	}

}
