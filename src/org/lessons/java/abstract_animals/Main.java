package org.lessons.java.abstract_animals;

public class Main {

	public static void main(String[] args) {
		Animale cane = new Cane();
		cane.dormi();
		cane.verso();
		cane.mangia();
		
		Aquila aquila = new Aquila();
		aquila.dormi();
		aquila.verso();
		aquila.mangia();
		faiVolare(aquila);
			
		
		Delfino delfino = new Delfino();
		delfino.dormi();
		delfino.verso();
		delfino.mangia();
		faiNuotare(delfino);
		
		Passerotto passerotto = new Passerotto();
		passerotto.dormi();
		passerotto.verso();
		passerotto.mangia();
		faiVolare(passerotto);
	
	}
	
	public static void faiVolare(IVolante animale) {
		animale.vola();
	}
	
	public static void faiNuotare(INuotante animale) {
		animale.nuota();
	}

}
