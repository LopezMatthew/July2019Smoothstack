package com.smoothstack;

class Singleton {
	
	private Singleton()
	{
		String n = "This is a test of the emergancy broadcast system";
		System.out.println(n);
	}
	
	public static volatile Singleton single_instance = null;
	
	public static Singleton getInstance() {
		if(single_instance == null) {
			synchronized (Singleton.class) {
				if(single_instance == null) {
					single_instance = new Singleton();
				}
			}
		}
		return single_instance;
	}
}
