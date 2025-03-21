package nintendo.test;

import java.io.Console;

import nintendo.Jeu;

public class App {

	public static void main(String[] args) {

		Jeu leagueOfLegends = new Jeu("League of legends", Console.pc, 0);
		Jeu zelda = new Jeu("The Legend of Zelda: Breath of the Wild", Console.nintendoSwitch , 59.99);
        Jeu callOfDutyBO2 = new Jeu("Call of Duty : Black Ops 2", Console.playStation3, 59.99);
        Jeu pokemonSoulsilver = new Jeu("Pokémon Soulsilver", Console.ds, 59.99);
        Jeu superMarioGalaxy = new Jeu("Super Mario Galaxy", Console.wii, 59.99);
        
        Client client1 = new Client("Malet", "Adrien");
        Client client2 = new Client("Valentin", "Alexandre");
        Client client3 = new Client("Rat", "Damien");
        Client client4 = new Client("Perrault", "Guillaume");

        Adresse adresse = new Adresse(1, "rue Link", "Nantes");
        Boutique boutique = new Boutique("Nintendo", adresse);
	}
}




