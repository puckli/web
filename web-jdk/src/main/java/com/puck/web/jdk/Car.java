package com.puck.web.jdk;

import java.util.function.Supplier;

/**
 * @Description
 * @Author lwz
 * @Date: 15:11 2017-11-29
 */
public class Car {
	public static Car create( final Supplier< Car > supplier ) {
		return supplier.get();
	}

	public static void collide( final Car car ) {
		System.out.println( "Collided " + car.toString() );
	}

	public void follow( final Car another ) {
		System.out.println( "Following the " + another.toString() );
	}

	public void repair() {
		System.out.println( "Repaired " + this.toString() );
	}
}
