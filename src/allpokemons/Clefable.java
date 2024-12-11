package allpokemons;

import moves.Clefable.*;
import moves.Clefairy.*;
import moves.Cleffa.*;


public class Clefable extends Clefairy {
    public Clefable(String name, int level) {
        super(name, level);

        super.setStats(95, 70, 73, 95, 90, 60);
        Thunderbolt thunderbolt = new Thunderbolt(90, 100);
        super.addMove(thunderbolt);
    }
}