package personnages;

public class Ronin extends Humain{
	private int honneur=1;

	public Ronin(String nom, String boisson, int argent) {
		super(nom,boisson,argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int don = argent/10;
		parler(beneficiaire.nom+" prend ces "+don+" sous.");
		beneficiaire.recevoir(don);
		argent = argent-don;
	}
}
