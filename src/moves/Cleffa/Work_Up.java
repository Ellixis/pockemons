package moves.Cleffa;


import ru.ifmo.se.pokemon.*;

public class Work_Up extends  StatusMove{
    
    public Work_Up (Type type, double pow, double acc) {
        super(Type.NORMAL, pow, acc);

    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        
        super.applySelfEffects(p);
        Effect e = new Effect().stat(Stat.ATTACK, 1).stat(Stat.SPECIAL_ATTACK, 1);
        p.addEffect(e);

    }
    @Override
    protected String describe(){
        return "does Work_Up";
    }
}