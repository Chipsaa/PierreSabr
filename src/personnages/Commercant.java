package personnages;

public class Commercant extends Humain {
	
	public Commercant(String nom, int argent) {
		super (nom, "thé", argent);
	}
	
	public void seFaireExtrorquer() {
		parler("J'ai tout perdu! Le monde est trop injuste :( ...");
		perdreArgent(argent);	
	}
	
	public void recevoir(int argent) {
		parler(argent+" sous ! Je te remercie généreux donateur!");
		gagnerArgent(argent);
	}
	
}
