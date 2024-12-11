package moves.Clefairy;

import ru.ifmo.se.pokemon.*;

public class Moonblast extends SpecialMove {

    public Moonblast (Type type, double pow, double acc) {
        super(Type.FAIRY, pow, acc);

    }
    @Override
    protected void applyOppEffects (Pokemon p)
    {
        super.applyOppEffects(p);
        Effect e = new Effect().chance(0.3).stat(Stat.SPECIAL_ATTACK, -1);;
        p.addEffect(e);
    }
    @Override
    protected String describe()
    {
        return "does Moonblast";
    }
}