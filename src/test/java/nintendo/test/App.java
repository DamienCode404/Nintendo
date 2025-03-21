package nintendo.test;

import java.io.Console;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import nintendo.Achat;
import nintendo.Client;
import nintendo.Jeu;

public class App {

	public static void main(String[] args) {
		Jeu leagueOfLegends = new Jeu("League of legends", Console.pc, 0);
		Jeu zelda = new Jeu("The Legend of Zelda: Breath of the Wild", Console.nintendoSwitch , 59.99);
        Jeu callOfDutyBO2 = new Jeu("Call of Duty : Black Ops 2", Console.playStation3, 59.99);
        Jeu pokemonSoulsilver = new Jeu("Pokémon Soulsilver", Console.ds, 59.99);
        Jeu superMarioGalaxy = new Jeu("Super Mario Galaxy", Console.wii, 59.99);
        
        Achat a1 = new Achat(zelda, LocalDate.now(), 20);
        List<Achat> liste1 = new ArrayList();
        liste1.add(a1);
        
        Client client1 = new Client("Malet", "Adrien", liste1);
        Client client2 = new Client("Valentin", "Alexandre", null);
        Client client3 = new Client("Rat", "Damien", null);
        Client client4 = new Client("Perrault", "Guillaume", null);
	}
}




