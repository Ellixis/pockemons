package moves.Tangela;

import ru.ifmo.se.pokemon.*;

public class Poison_Powder extends StatusMove{
    public Poison_Powder (Type type, double pow, double acc) {
        super(Type.POISON, pow, acc);
    }



    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect e = new Effect().condition(Status.POISON);
        p.addEffect(e);


    }
    @Override
    protected String describe() {
        return "does Poison_Powder";
    }
}
