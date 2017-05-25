package org.light4j.proxy;

import org.light4j.proxy.impl.HelloProxy;

public class Main {
	public static void main(String[] args) {
		Hello helloProxy = new HelloProxy();
		helloProxy.say("longjiazuo");
	}
}
