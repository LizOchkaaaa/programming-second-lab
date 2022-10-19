package Move;
import ru.ifmo.se.pokemon.*;

public class Extrasensory extends SpecialMove {
    public Extrasensory(){

        super(Type.PSYCHIC , 80 , 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        if(Math.random() <= 0.1){
            Effect.flinch(p);
        }
    }

    @Override
    protected String describe () {
        return "использует Extrasensory";
    }
}
