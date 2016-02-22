package org.demo.app;


import org.demo.app.config.Helper;
import org.demo.app.service.Goodbye;
import org.demo.app.service.impl.impl2.GoodbyeImpl;
import org.nanoj.injector.Injector;

public class UseGoodbye {

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
		GoodbyeImpl service =  injector.getInstance(GoodbyeImpl.class) ;

		System.out.println(" Call ... " + service.goodbye("Toto") ) ;
		System.out.println(" Call ... " + service.goodbye("Yoyo") ) ;
	}

	public static void testWithInterface(Injector injector) 
	{
		System.out.println("Get and use Service from interface " ) ;
		Goodbye service =  injector.getInstance(Goodbye.class) ;
		
		System.out.println(" Call ... " + service.goodbye("Toto") ) ;
		System.out.println(" Call ... " + service.goodbye("Yoyo") ) ;
	}
}
