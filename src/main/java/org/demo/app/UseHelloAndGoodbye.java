package org.demo.app;

import org.demo.app.config.Helper;
import org.demo.app.service.Hello;
import org.demo.app.service.HelloAndGoodbye;
import org.demo.app.service.impl.HelloAndGoodbyeImpl;
import org.nanoj.injector.Injector;

public class UseHelloAndGoodbye {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Injector injector = Helper.getInjector() ;
		System.out.println("----------");
		testWithClass(injector) ;
		System.out.println("----------");
		testWithInterface(injector);
		System.out.println("----------");
	}
	
	public static void testWithClass(Injector injector) 
	{
		System.out.println("Get and use Service from implementation class " ) ;
		HelloAndGoodbyeImpl service = injector.getInstance(HelloAndGoodbyeImpl.class);
		
		System.out.println(" Call ... " + service.hello("Toto") ) ;
		System.out.println(" Call ... " + service.goodbye("Yoyo") ) ;
		System.out.println(" Call ... " + service.helloAndGoodbye("Toto") ) ;
		
		injector.printAllComponents(System.out);
	}

	public static void testWithInterface(Injector injector) 
	{
		System.out.println("Get and use Service from interface " ) ;
		HelloAndGoodbye service = injector.getInstance(HelloAndGoodbye.class);
		
		System.out.println(" Call ... " + service.hello("Toto") ) ;
		System.out.println(" Call ... " + service.goodbye("Yoyo") ) ;
		System.out.println(" Call ... " + service.helloAndGoodbye("Yoyo") ) ;

		Hello srvHello = injector.getInstance(Hello.class);
		srvHello.hello("Aaaaa");
		
		injector.printAllComponents(System.out);
	}
}
