package org.demo.app.service;

public abstract class CalcAbstract {

	protected  final String name ;
	
	public CalcAbstract(String name) {
		super();
		this.name = name;
	}

	public abstract int add(int a, int b) ;
	
	public abstract int mult(int a, int b) ;

	@Override
	public String toString() {
//		return "AbstractCalc [name=" + name + "]";
		return "AbstractCalc";
	}
	
	
}
