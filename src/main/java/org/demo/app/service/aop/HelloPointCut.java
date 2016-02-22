package org.demo.app.service.aop;


import java.lang.reflect.Method;

import org.nanoj.injector.aop.PointCut;

public class HelloPointCut implements PointCut {

	public boolean callInterceptor(Method method, Object componentInstance) {

		// If the abstract class name starts with "Hello"
		if ( method.getDeclaringClass().getSimpleName().matches("Hello.*")) {
			return true ;
		}
		
		// If the method name starts with "hello"
		if ( method.getName().matches("hello.*") ) {
			return true ;
		}
		
		return false;
	}

}
