package com.puck.web.jdk;

import java.util.function.Supplier;

/**
 * @Description
 * @Author lwz
 * @Date: 14:03 2017-11-29
 */
@FunctionalInterface
public interface Interf {

	void test();
	default void go(){
		System.out.println("default method in Interface which by @FunctionInterface");
	}

}
