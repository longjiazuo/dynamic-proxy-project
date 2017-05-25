package org.light4j.proxy.impl;

import org.light4j.proxy.Hello;

public class HelloProxy implements Hello {

	private Hello hello;

	public HelloProxy() {
		hello = new HelloImpl();
	}

	@Override
	public void say(String name) {
		before();
		hello.say(name);
		after();
	}

	private void before() {
		System.out.println("Before...");
	}

	private void after() {
		System.out.println("After...");
	}
}