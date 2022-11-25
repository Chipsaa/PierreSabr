package personnages;

public class Commercant extends Humain {
	
	public Commercant(String nom, int argent) {
		super (nom, "thé", argent);
	}
	
	public int seFaireExtrorquer() {
		parler("J'ai tout perdu! Le monde est trop injuste :( ...");
		int argentperdu = argent;
		perdreArgent(argent);
		return argentperdu;
	}
	
	public void recevoir(int argent) {
		parler(argent+" sous ! Je te remercie g�n�reux donateur!");
		gagnerArgent(argent);
	}
	
}
