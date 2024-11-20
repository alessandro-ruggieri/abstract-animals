package org.lessons.java.abstract_animals;

public class Delfino extends Animale implements INuotante{

	@Override
	public void verso() {
		System.out.println("Comunicazioni di tipo biosonar");
	}

	@Override
	public void mangia() {
		System.out.println("Pesci più piccoli");
	}

	@Override
	public void nuota() {
		System.out.println("Sto nuotando!");
	}

}
