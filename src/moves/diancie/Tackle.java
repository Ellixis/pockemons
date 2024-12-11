package moves.diancie;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class Tackle extends PhysicalMove{
    
    public Tackle (Type type, double pow, double acc) {
        super(Type.NORMAL, pow, acc);

    }

    protected String describe() {
        return "does Tackle";
    }
}
