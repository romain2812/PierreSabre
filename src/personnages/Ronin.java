package personnages;

public class Ronin extends Humain {
	private int honneur =1;

	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
	public void donner(Commercant beneficiaire) {
		int don = getArgent()/10;
		parler(beneficiaire.getNom()+"prend mes "+don+" sous.");
		beneficiaire.recevoir(don);
	}
	
	public void provoquer(Yakuza adversaire){
		int force = honneur*2;
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if (force<adversaire.getReputation()) {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(getArgent());
			honneur--;
		}
		else {
			parler("Je t’ai eu petit yakusa!");
			int gain = adversaire.perdre();
			gagnerArgent(gain);
			honneur++;
		}
		
	}
	
	

}
