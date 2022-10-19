package Pokemons;
import Move.*;
import ru.ifmo.se.pokemon.Type;

public class Pikachu extends Pichu{
    public Pikachu(String name, int level) {
        super(name, level);
        setType(Type.ELECTRIC);
        setStats(35,55,40,50,50,90);
        addMove(new PlayNice());
    }
}
