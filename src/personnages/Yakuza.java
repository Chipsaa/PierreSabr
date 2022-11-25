package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation = 4;
	
	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom,boisson,argent);
		this.clan = clan;
	}
	
	public int getReputation() {
		return reputation;
	}
	
	@Override
	public void direBonjour() {
		parler("Bonjour ! Je m'apelle "+nom+" et j'aimerais boire du "+boissonfavorite);
		parler("Mon clan est celui de "+clan);
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ?");
		parler(victime.getNom()+", si tu tiens � la vie donne moi ta bourse !");
		int argentvol = victime.seFaireExtrorquer();
		gagnerArgent(argentvol);
		parler("J'ai piqu� les "+argentvol+" sous de Marco, ce qui me fait "+argent+" sous dans ma poche. Hi ! Hi ! He ! He ! Ha ! Ha! HAHAHAHA! ");
	}
	
	public int perdre(){
		reputation -= 1;
		int perte = argent;
		parler("J’ai perdu mon duel et mes "+perte+" sous, snif... J'ai déshonoré le "+clan+".");
		return perte;
	}
	
	public void gagner(int gain) {
		argent += gain;
		reputation ++;
		parler("Ce ronin pensait vraiment battre "+nom+" du "+clan+" ? Je l'ai dépouillé de ses "+gain+" sous.");
	}
	
}
