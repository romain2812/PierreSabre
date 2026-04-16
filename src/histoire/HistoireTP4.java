package histoire;

import personnages.Commercant;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {
	
	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco",20);
		Yakuza yakuLeNoir = new Yakuza("yaku Le Noir","whisky" , 30, " Warsong");
		Ronin roro = new Ronin("Roro", "shochu", 60);
		roro.provoquer(yakuLeNoir);
	}
	
}
