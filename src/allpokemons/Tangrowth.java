package allpokemons;

import moves.Tangrowth.*;
import moves.Tangela.*;
import ru.ifmo.se.pokemon.*;

public class Tangrowth extends Tangela {
    public Tangrowth(String name, int level) {
        super(name, level);

        super.setStats(100, 100, 125, 110, 50, 50);
        Rock_Slide rock_slide = new Rock_Slide(75, 90);

        super.addMove(rock_slide);
    }
}