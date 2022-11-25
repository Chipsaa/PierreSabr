package personnages;


public class Humain {
	static int tailleMaxMemoire = 30;
	protected String nom;
	protected String boissonfavorite;
	protected int argent;
	protected int nbConnaissance=0;
	protected Humain[] memoire;
	
	public Humain(String nom, String boisson, int argent){
		this.nom = nom;
		this.boissonfavorite = boisson;
		this.argent = argent;
		memoire = new Humain[30];
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
			parler("Je n'ai plus que "+argent+" sous en poche. Je ne peux m�me pas m'offrir "+bien+" � "+prix+" sous.");
		} else {
			parler("J'ai "+argent+" sous en poche. Je vais pouvoir m'offrir "+bien+" � "+prix+" sous.");
			perdreArgent(prix);
		}
	}
	
	private void memoriser(Humain humain) {
		if(nbConnaissance<tailleMaxMemoire) {
			memoire[nbConnaissance] = humain ;
			nbConnaissance++;
		} else {
			for(int i = 0;i<tailleMaxMemoire-1;i++) {
				memoire[i]=memoire[i+1];
			}
			memoire[nbConnaissance-1] = humain ;
			
		}
	}
	
	private void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);
	}
	
	public void listerConnaissance() {
		String liste = "";
		for(int i=0; i<nbConnaissance;i++) {
			liste +=  memoire[i].nom;
			if ((i+1)<nbConnaissance) {
				liste += ", "; 
			}
		}
		parler("Je connais beaucoup de monde dont: "+liste);
	}
	
}
