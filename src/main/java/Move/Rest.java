package Move;
import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest(){
        super(Type.PSYCHIC , 0 , 0);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        if(p.getCondition() == Status.SLEEP){
            Effect e = new Effect().turns(2).stat(Stat.HP, 100);
            p.addEffect(e);
        }
    }

    @Override
    protected String describe () {
        return "отдыхает";
    }
}
