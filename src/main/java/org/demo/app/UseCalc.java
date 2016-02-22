package org.demo.app;

import org.demo.app.config.Helper;
import org.demo.app.service.CalcAbstract;
import org.demo.app.service.impl.CalcImpl;
import org.nanoj.injector.Injector;

public class UseCalc {

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
		System.out.println("All components : ");
		injector.printAllComponents(System.out); //

	}
	
	public static void testWithClass(Injector injector) 
	{
		System.out.println("Get and use Service from concrete class " ) ;
		CalcImpl service =  injector.getInstance(CalcImpl.class) ;
		
		System.out.println(" Service : " + service.toString() );
		System.out.println(" Call ... " + service.add(1,2) ) ;
	}

	public static void testWithInterface(Injector injector) 
	{
		System.out.println("Get and use Service from abstract class " ) ;
		CalcAbstract service =  injector.getInstance(CalcAbstract.class) ;
		
		System.out.println(" Call ... " + service.add(3,2) ) ;
		System.out.println(" Service : " + service.toString() );
	}
}
