package allpokemons;

import moves.Cleffa.*;

import ru.ifmo.se.pokemon.*;

public class Cleffa extends Pokemon {
    public Cleffa(String name, int level) {
        super(name, level);

        super.setType(Type.FAIRY);
        super.setStats(50, 25, 28, 45, 55, 15);
        Work_Up work_up = new Work_Up(0, 0);
        Dream_Eater dream_eater = new Dream_Eater(100, 100);
        super.setMove(dream_eater, work_up);

    }
}