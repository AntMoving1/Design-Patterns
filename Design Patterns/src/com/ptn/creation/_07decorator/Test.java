package com.ptn.creation._07decorator;

import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args) {
		IWindow window = new Window();
		window.installWindow();
		
		//装饰器
		IWindow window2 = new BlackWindow();
		window2.installWindow();
	}
}
