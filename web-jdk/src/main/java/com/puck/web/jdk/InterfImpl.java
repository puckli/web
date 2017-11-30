package com.puck.web.jdk;

/**
 * @Description
 * @Author lwz
 * @Date: 14:05 2017-11-29
 */
public class InterfImpl implements Interf {


	public static void main(String args[]){
		Interf i = new InterfImpl();
		i.go();
		i.test();
	}

	@Override public void test() {
		System.out.println("bbb");
	}

	@Override public void go() {
		System.out.println("aaa");
	}
}
