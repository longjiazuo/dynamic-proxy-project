package org.light4j.proxy.impl;

import org.light4j.proxy.Hello;

/**
 * @author longjiazuo
 */
public class HelloImpl implements Hello {
	@Override
	public void say(String name) {
		System.out.println("Hello! " + name);
	}
}
