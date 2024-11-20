package org.lessons.java.abstract_animals;

public class Cane extends Animale {

	@Override
	public void verso() {
		System.out.println("Abbaia");
	}

	@Override
	public void mangia() {
		System.out.println("Croccantini e cibo umido");
	}

}
