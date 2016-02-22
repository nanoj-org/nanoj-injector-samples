package org.demo.app.service.aop;

import java.lang.reflect.Method;

import org.nanoj.injector.aop.Interceptor;
import org.nanoj.injector.aop.InterceptorProvider;

public class TraceInterceptor1Provider implements InterceptorProvider {

//	public Interceptor getInterceptor(Class<?> clazz) {
//		
//		return new TraceInterceptor();
//	}

	public Interceptor getInterceptor(Method method, Object componentInstance) {
		
//		if ( method.getName().matches("good.*") ) {
//			return new TraceInterceptor();
//		}
		
		System.out.println("TraceInterceptorProvider : method.getDeclaringClass().getSimpleName() : " + method.getDeclaringClass().getSimpleName() );
		if ( method.getDeclaringClass().getSimpleName().matches("H.*")) {
			return new TraceInterceptor1();
		}
		return null ;
	}

}
