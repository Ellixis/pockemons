package moves.diancie;

import ru.ifmo.se.pokemon.*;

public class Rock_Slide extends PhysicalMove{

    public Rock_Slide (Type type, double pow, double acc) {
        super(Type.ROCK, pow, acc);

    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);

        if (0.3>Math.random()){  
            Effect.flinch(p);
        }
        
    }
    //ходил ли до него противник


    protected String describe() {
        return "does Rock_Slide";
    }
}