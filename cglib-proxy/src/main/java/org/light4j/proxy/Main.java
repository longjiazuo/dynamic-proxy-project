package org.light4j.proxy;

import org.light4j.proxy.dynamicProxy.CGLibProxy;
import org.light4j.proxy.impl.HelloImpl;

public class Main {
	public static void main(String[] args) {
		Hello helloProxy = CGLibProxy.getInstance().getProxy(HelloImpl.class);

		helloProxy.say("longjiazuo");
	}
}