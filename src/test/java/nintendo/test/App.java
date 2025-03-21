package nintendo.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import nintendo.Achat;
import nintendo.Adresse;
import nintendo.Boutique;
import nintendo.Client;
import nintendo.Jeu;
import nintendo.Portable;
import nintendo.Salon;
import nintendo.Console;
import nintendo.Hybride;

public class App {

	public static void main(String[] args) {
		
        Adresse adresse = new Adresse(1, "rue Link", "Nantes");
        Boutique boutique = new Boutique("Nintendo", adresse);
        
		Console pc = new Salon(LocalDate(1987-10-30), 3200, "PC");
		Console nintendoSwitch = new Hybride(LocalDate(2015-10-30), 200, "Nintendo Switch");
		Console playStation3 = new Salon(LocalDate(2004-10-30), 300, "playStation3");
		Console ds = new Hybride(LocalDate(2000-10-30), 150, "ds");
		Console wii = new Portable(LocalDate(20010-10-30), 250, "wii");
		
		Jeu leagueOfLegends = new Jeu("League of legends", pc, 0, boutique);
		Jeu zelda = new Jeu("The Legend of Zelda: Breath of the Wild", nintendoSwitch , 59.99, boutique);
        Jeu callOfDutyBO2 = new Jeu("Call of Duty : Black Ops 2", playStation3, 59.99, boutique);
        Jeu pokemonSoulsilver = new Jeu("Pokémon Soulsilver", ds, 59.99, boutique);
        Jeu superMarioGalaxy = new Jeu("Super Mario Galaxy", wii, 59.99, boutique);
        Achat a1 = new Achat(zelda, LocalDate.now(), 20);
        
        List<Achat> liste1 = new ArrayList();
        liste1.add(a1);
        
        Client client1 = new Client("Malet", "Adrien", liste1);
        Client client2 = new Client("Valentin", "Alexandre", null);
        Client client3 = new Client("Rat", "Damien", null);
        Client client4 = new Client("Perrault", "Guillaume", null);
	}

	private static LocalDate LocalDate(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}




