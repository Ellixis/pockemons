package allpokemons;

import moves.Tangela.*;
import ru.ifmo.se.pokemon.*;

public class Tangela extends Pokemon {
    public Tangela(String name, int level) {
        super(name, level);

        super.setType(Type.GRASS);
        super.setStats(65, 55, 115, 110, 40, 60);

        Poison_Powder poison_powder = new Poison_Powder(0, 75);
        Double_Team double_team = new Double_Team(0, 0);
        Stun_Spore stun_spore = new Stun_Spore(0, 75);
        super.setMove(poison_powder, double_team, stun_spore);



    }
}
