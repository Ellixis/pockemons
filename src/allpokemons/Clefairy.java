package allpokemons;

import moves.Clefairy.*;
import moves.Cleffa.*;
public class Clefairy extends Cleffa {
    public Clefairy(String name, int level) {
        super(name, level);

        super.setStats(70, 45, 48, 60, 65, 35);
        Moonblast moonblast = new Moonblast(95, 100);
        super.addMove(moonblast);
    }
}

