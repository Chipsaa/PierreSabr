package histoire;

import personnages.Humain;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain noa = new Humain("Noa","Cum",54);
		noa.direBonjour();
		noa.acheter("une boisson", 12);
		noa.boire();
		noa.acheter("un jeu", 2);
		noa.acheter("un kimono", 50);
	}
}
