package org.demo.app.service.aop;

import java.lang.reflect.Method;

import org.nanoj.injector.aop.Interceptor;
import org.nanoj.injector.aop.InterceptorProvider;

public class TraceInterceptor2Provider implements InterceptorProvider {

	public Interceptor getInterceptor(Method method, Object componentInstance) {
		
//		if ( method.getName().matches("good.*") ) {
//			return new TraceInterceptor();
//		}
		
		System.out.println("TraceInterceptor2Provider : method.getDeclaringClass().getSimpleName() : " + method.getDeclaringClass().getSimpleName() );
		if ( method.getDeclaringClass().getSimpleName().matches("Goo.*")) {
			return new TraceInterceptor2();
		}
		return null ;
	}

}
