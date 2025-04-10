/**
 * 
 */
package com.java.demo.abstractClass;

/**
 * @author mkkol
 *
 */
public abstract class Wheels {

	public static void main(String[] args) {
		System.out.println("Entered in wheels Abstartc class");

		Wheels bus = new Bus();
		Wheels auto = new Auto();

		System.out.println("Bus wheels " + bus.myvechilewheel());
		System.out.println("Auto wheels  " + auto.myvechilewheel());

	}

	/**
	 * @return
	 */
	public abstract int myvechilewheel();
}

class Bus extends Wheels {

	public static void main(String[] args) {
		System.out.println();
		Bus bus = new Bus();
		bus.myvechilewheel();
	}

	@Override
	public int myvechilewheel() {
		return 6;
	}

}

class Auto extends Wheels {

	public static void main(String[] args) {
		System.out.println();
		Auto auto = new Auto();
		auto.myvechilewheel();
	}

	@Override
	public int myvechilewheel() {
		// TODO Auto-generated method stub
		return 3;
	}

}