package org.demo.app.service.aop;


import java.lang.reflect.Method;

import org.nanoj.injector.aop.Interceptor;

public class TraceInterceptor1 implements Interceptor  {

	private static final String BEGINNING = "===== [ TRACE INTERCEPTOR 1 ] : " ;
	
	public void beforeCall(Object instance, Method method, Object[] args) {
		System.out.println( BEGINNING + "Before call / " + instance.getClass().getSimpleName() + " " + method.getName() );
	}

	public void afterCall(Object instance, Method method, Object[] args, Object result) {
		System.out.println( BEGINNING + "After call / " + instance.getClass().getSimpleName() + " " + method.getName() );
	}

	public void onError(Object instance, Method method, Object[] args, Exception exception) {
		System.out.println( BEGINNING + "Error / " + instance.getClass().getSimpleName() + " " + method.getName() );
	}

}
