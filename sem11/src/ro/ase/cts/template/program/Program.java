package ro.ase.cts.template.program;

import ro.ase.cts.template.clase.Spectator;
import ro.ase.cts.template.clase.SpectatorVIP;

public class Program {

	public static void main(String[] args) {
		Spectator spectator1 = new Spectator("Marcel");
		Spectator spectator2 = new Spectator("Andra");
		
		spectator1.intrareSpectatorStadion();
		
		SpectatorVIP spectatorVip = new SpectatorVIP("Rihanna");
		spectatorVip.intrareSpectatorStadion();
	}

}
