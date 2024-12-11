package moves.Cleffa;

import ru.ifmo.se.pokemon.*;

public class Dream_Eater extends SpecialMove {

    public Dream_Eater (Type type, double pow, double acc) {
        super(Type.PSYCHIC, pow, acc);

    }
    @Override
    protected void applyOppDamage (Pokemon p, double damage) {

        if (p.getCondition() == Status.SLEEP) {
            super.applyOppDamage(p, damage);

        }
        else {
            super.applyOppDamage(p, 0);
        }

    //@Override
    //public void get ( )
    //восстановить 50 потраченных 

    @Override
    protected void applySelfDamage(Pokemon p, double d) {
        p.setMod(Stat.HP, (int) (-0.5 * dealedDamage));
    }


    }
    @Override
    protected String describe(){
        return "does Dream_Eater";
    }
}
