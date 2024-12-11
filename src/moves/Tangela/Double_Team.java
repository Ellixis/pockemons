package moves.Tangela;

import ru.ifmo.se.pokemon.*;

public class Double_Team extends StatusMove{
    public Double_Team (Type type, double pow, double acc){
        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applySelfEffects (Pokemon p){
        super.applySelfEffects(p);
        Effect e = new Effect().stat(Stat.EVASION, 1);
        p.addEffect(e);
    }

    @Override
    protected String describe(){
        return "does DoubleTeam";
    }
}