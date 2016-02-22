package old;

import org.demo.app.service.CalcAbstract;
import org.demo.app.service.Hello;
import org.demo.app.service.TinyLogger;
import org.demo.app.service.aop.TraceInterceptor1Provider;
import org.demo.app.service.aop.TraceInterceptor2Provider;
import org.demo.app.service.aop.TraceInterceptorGlobalProvider;
import org.demo.app.service.impl.CalcImpl;
import org.demo.app.service.impl.HelloImpl;
import org.demo.app.service.provider.TinyLoggerProvider;
import org.nanoj.injector.InjectorConfiguration;
import org.nanoj.injector.InjectorConfigurator;

public class MyConfigurator implements InjectorConfigurator {

	public void configure(InjectorConfiguration configuration) {
		
		//--- Interfaces with implementation 
		//config.defineImplementationClass(Hello.class, GoodbyeImpl.class); // Error
		configuration.defineImplementationClass(Hello.class, HelloImpl.class);
		//config.defineImplementationClass(Goodbye.class, GoodbyeImpl.class); // Defined by convention
		//config.defineImplementationClass(HelloAndGoodbye.class, HelloAndGoodbyeImpl.class); // Defined by convention
		
		//--- Abstract classes with extended concrete classes 
		configuration.defineImplementationClass(CalcAbstract.class, CalcImpl.class);

		//--- Naming conventions 
		configuration.defineImplementationConvention("${package}.${class}Impl");
		configuration.defineImplementationConvention("${package}.impl.${class}Impl"); // 1st convention
		configuration.defineImplementationConvention("${package-1}.impl.${class}Impl"); // 1st convention
		configuration.defineImplementationConvention("${package}.impl.impl2.${class}Impl"); // 2nd convention
		configuration.defineImplementationConvention("${package-1}.impl.impl2.${class}Impl"); // 2nd convention
		
		//--- Specific providers 
		configuration.defineImplementationProvider(TinyLogger.class, new TinyLoggerProvider() );

		
		// TODO : Injection of values (by field or constructor) 
//		config.defineNamedValue(CalcImpl.class, "name", "Foo");
		
		
		//--- AOP : Interceptor provider 

// TODO
//		config.defineInterceptor( TraceInterceptor.class, PointCut1(), PointCut2() ) ;
//		config.defineInterceptor( OtherInterceptor.class, PointCut1() ) ;
		
		configuration.defineInterceptorProvider( new TraceInterceptor1Provider() );
		configuration.defineInterceptorProvider( new TraceInterceptor2Provider() );
		configuration.defineInterceptorProvider( new TraceInterceptorGlobalProvider() );
		
	}

}
