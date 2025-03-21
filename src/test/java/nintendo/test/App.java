package nintendo.test;

import java.time.LocalDate;

import nintendo.Console;
import nintendo.Jeu;

public class App {

	public static void main(String[] args) {
        
        Client client1 = new Client("Malet", "Adrien");
        Client client2 = new Client("Valentin", "Alexandre");
        Client client3 = new Client("Rat", "Damien");
        Client client4 = new Client("Perrault", "Guillaume");

        Adresse adresse = new Adresse(1, "rue Link", "Nantes");
        Boutique boutique = new Boutique("Nintendo", adresse);
        
		Console pc = new Console(LocalDate(1987-10-30), 3200, "PC");
		Console nintendoSwitch = new Console(LocalDate(2015-10-30), 200, "Nintendo Switch");
		Console playStation3 = new Console(LocalDate(2004-10-30), 300, "playStation3");
		Console ds = new Console(LocalDate(2000-10-30), 150, "ds");
		Console wii = new Console(LocalDate(20010-10-30), 250, "wii");
		
		Jeu leagueOfLegends = new Jeu("League of legends", Console.pc, 0);
		Jeu zelda = new Jeu("The Legend of Zelda: Breath of the Wild", Console.nintendoSwitch , 59.99);
        Jeu callOfDutyBO2 = new Jeu("Call of Duty : Black Ops 2", Console.playStation3, 59.99);
        Jeu pokemonSoulsilver = new Jeu("Pokémon Soulsilver", Console.ds, 59.99);
        Jeu superMarioGalaxy = new Jeu("Super Mario Galaxy", Console.wii, 59.99);

	}

	private static LocalDate LocalDate(int i) {
		// TODO Auto-generated method stub
		return null;
	}
}




