package Pokemons;
import Move.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Pichu extends Pokemon {
    public Pichu(String name , int level){
        super(name , level);
        setType(Type.ELECTRIC);
        setStats(20,40,15,35,35,60);
        setMove(new Facade());
        setMove(new TailWhip());
    }
}
