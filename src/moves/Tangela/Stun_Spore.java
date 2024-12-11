package moves.Tangela;

import ru.ifmo.se.pokemon.*;

public class Stun_Spore extends StatusMove{
    public Stun_Spore (Type type, double pow, double acc) {
        super(Type.GRASS, pow, acc);
    }



    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect e = new Effect().condition(Status.PARALYZE);
        p.addEffect(e);

    }
    @Override
    protected String describe() {
        return "does Stun_Spore";
    }
}
