package moves.diancie;

import ru.ifmo.se.pokemon.*;

public class Psychic extends SpecialMove {

    public Psychic (Type type, double pow, double acc) {
        super(Type.PSYCHIC, pow, acc);

    }


    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        Effect e = new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, -1);
        
        p.addEffect(e);
        
    }

    

    
    @Override
    protected String describe() {
        return "does Psychic";
    }
}