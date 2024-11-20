package org.lessons.java.abstract_animals;

public class Aquila extends Animale implements IVolante {

	@Override
	public void verso() {
		System.out.println("Stride");
	}

	@Override
	public void mangia() {
		System.out.println("Animali di taglia più piccola");
	}

	@Override
	public void vola() {
		System.out.println("Sto volando!");
	}

}
