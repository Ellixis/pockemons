package allpokemons;

import moves.diancie.*;
import ru.ifmo.se.pokemon.*;

public class Diancie extends Pokemon {
    public Diancie(String name, int level) {
        super(name, level);

        super.setType(Type.ROCK, Type.FAIRY);
        super.setStats(50, 100, 150, 100, 150, 50);

        Tackle tackle = new Tackle(40, 100);
        Psychic psychic = new Psychic(90, 100);
        Rest rest = new Rest(0, 0);
        Rock_Slide rock_slide  = new Rock_Slide(75, 90);
        super.setMove(tackle, psychic, rest, rock_slide);
    }


    
}
