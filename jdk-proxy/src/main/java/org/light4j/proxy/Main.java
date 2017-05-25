package org.light4j.proxy;

import org.light4j.proxy.dynamicProxy.DynamicProxy;
import org.light4j.proxy.impl.HelloImpl;

/**
 * @author longjiazuo
 */
public class Main {
	public static void main(String[] args) {
		DynamicProxy dynamicProxy = new DynamicProxy(new HelloImpl());
		Hello helloProxy = dynamicProxy.getProxy();

		helloProxy.say("longjiazuo");
	}
}
