package org.lessons.java.abstract_animals;

public class Passerotto extends Animale implements IVolante {

	@Override
	public void verso() {
		System.out.println("Cinguetta");
	}

	@Override
	public void mangia() {
		System.out.println("Vermetti, semi");
	}

	@Override
	public void vola() {
		System.out.println("Sto volando!");
	}

}
