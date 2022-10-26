package personnages;

public class Humain {
	protected String nom;
	protected String boissonfavorite;
	protected int argent;
	
	public Humain(String nom, String boisson, int argent){
		this.nom = nom;
		this.boissonfavorite = boisson;
		this.argent = argent;
	}
	
	public String getNom() {
		return nom;
	}
	public int getArgent() {
		return argent;
	}
	
	protected void parler(String phrase) {
		System.out.println("("+nom+") - "+phrase);
	}
	
	public void direBonjour() {
		parler("Bonjour ! Je m'apelle "+nom+" et j'aimerais boire du "+boissonfavorite);
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de "+boissonfavorite+" ! GLOUPS !");
	}
	
	public void gagnerArgent(int gain) {
		this.argent += gain;
	}
	public void perdreArgent(int perte) {
		this.argent -= perte;
	}
	
	public void acheter(String bien, int prix) {
		if (prix>argent){
			parler("Je n'ai plus que "+argent+" sous en poche. Je ne peux même pas m'offrir "+bien+" à "+prix+" sous.");
		} else {
			parler("J'ai "+argent+" sous en poche. Je vais pouvoir m'offrir "+bien+" à "+prix+" sous.");
			perdreArgent(prix);
		}
	}
}
