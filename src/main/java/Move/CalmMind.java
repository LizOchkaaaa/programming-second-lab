package Move;
import ru.ifmo.se.pokemon.*;

public class CalmMind extends StatusMove {
    public CalmMind(){
        super(Type.PSYCHIC , 0 , 0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect e = new Effect().turns(1).stat(Stat.SPECIAL_ATTACK , 1).stat(Stat.SPECIAL_DEFENSE , 1);
        p.addEffect(e);
    }

    @Override
    protected String describe () {
        return "использует Calm Mind";
    }
}
