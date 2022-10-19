package Move;
import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade(){
        super(Type.NORMAL , 70 , 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if(p.getCondition() == Status.BURN){
            Effect e = new Effect().stat(Stat.ATTACK, 140);;
        }
        if(p.getCondition() == Status.POISON){
            Effect e = new Effect().stat(Stat.ATTACK, 140);
        }
        if(p.getCondition() == Status.PARALYZE){
            Effect e = new Effect().stat(Stat.ATTACK, 140);
        }
    }

    @Override
    protected String describe () {
        return "использует Facade";
    }
}
