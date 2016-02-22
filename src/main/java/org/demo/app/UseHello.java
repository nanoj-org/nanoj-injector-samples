package org.demo.app;


import org.demo.app.config.Helper;
import org.demo.app.service.Hello;
import org.demo.app.service.impl.HelloImpl;
import org.nanoj.injector.Injector;

public class UseHello {

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
		injector.printAllComponents(System.out); //

	}
	
	public static void testWithClass(Injector injector) 
	{
		System.out.println("Get and use Service from implementation class " ) ;
		HelloImpl service =  injector.getInstance(HelloImpl.class) ;
		
		System.out.println(" Call ... " + service.hello("Toto") ) ;
		System.out.println(" Call ... " + service.hello("Yoyo") ) ;
		
		injector.printAllComponents(System.out);
	}

	public static void testWithInterface(Injector injector) 
	{
		System.out.println("Get and use Service from interface " ) ;
		Hello service =  injector.getInstance(Hello.class) ;
		
		System.out.println(" Call ... " + service.hello("Toto") ) ;
		System.out.println(" Call ... " + service.hello("Yoyo") ) ;
		
	}
}
