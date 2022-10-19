package Move;
import ru.ifmo.se.pokemon.*;

public class TailWhip extends StatusMove {
    public TailWhip(){
        super(Type.NORMAL , 0 , 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().turns(3).stat(Stat.DEFENSE, -1);
    }

    @Override
    protected String describe () {
        return "использует Tail Whip";
    }
}
