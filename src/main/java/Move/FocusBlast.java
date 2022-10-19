package Move;
import ru.ifmo.se.pokemon.*;

public class FocusBlast extends SpecialMove {
    public FocusBlast(){
        super(Type.FIGHTING , 120 , 70);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE, -1);
    }

    @Override
    protected String describe () {
        return "наносит урон с помощью Focus Blast";
    }
}
