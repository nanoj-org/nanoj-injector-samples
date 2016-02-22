package org.demo.app.service.impl.impl2;

import javax.inject.Singleton;

import org.demo.app.service.Goodbye;

@Singleton
public class GoodbyeImpl implements Goodbye {

	public String goodbye(String name)
	{
		return "Goodbye " + name ;
	}

}
