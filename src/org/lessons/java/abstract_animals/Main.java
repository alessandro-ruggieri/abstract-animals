package org.lessons.java.abstract_animals;

public class Main {

	public static void main(String[] args) {
		Animale cane = new Cane();
		cane.dormi();
		cane.verso();
		cane.mangia();
		
		Aquila aquila = new Aquila();
		aquila.mangia();
		aquila.verso();
		aquila.dormi();
		aquila.vola();
		
		Delfino delfino = new Delfino();
		delfino.dormi();
		delfino.verso();
		delfino.mangia();
		delfino.nuota();
		
		Passerotto passerotto = new Passerotto();
		passerotto.dormi();
		passerotto.verso();
		passerotto.mangia();
		passerotto.vola();
		
	}

}
