package moves.Clefable;

import ru.ifmo.se.pokemon.*;


public class Thunderbolt extends SpecialMove {
    public Thunderbolt (Type type, double pow, double acc) {
        super(Type.ELECTRIC, pow, acc);
    }

    @Override
    protected void applyOppEffects (Pokemon p) {
        super.applyOppEffects(p);
        Effect e = new Effect().chance(0.1).condition(Status.PARALYZE);
        p.addEffect(e);
    }

    @Override
    protected void applyOppDamage(Pokemon arg0, double arg1) {
        super.applyOppDamage(arg0, arg1);
    }

    @Override
    protected String describe() {
        return "does Thunderbolt";
    }
}