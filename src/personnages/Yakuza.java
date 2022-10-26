package personnages;

public class Yakuza extends Humain{
	private String clan;
	private int reputation = 0;
	
	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom,boisson,argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom()+", si tu tiens à la vie donne moi ta bourse !");
		int argentvol = victime.seFaireExtrorquer();
		gagnerArgent(argentvol);
		parler("J'ai piqué les "+argentvol+" sous de Marco, ce qui me fait "+argent+" sous dans ma poche. Hi ! Hi ! He ! He ! Ha ! Ha! HAHAHAHA! ");
	}
}
