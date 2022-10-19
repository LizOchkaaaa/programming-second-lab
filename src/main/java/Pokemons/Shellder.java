package Pokemons;
import Move.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Shellder extends Pokemon {
    public Shellder(String name , int level){
        super(name, level);
        setType(Type.WATER);
        setStats(30, 65, 100,45,25,40);
        setMove(new Confide());
        setMove(new Rest());
        setMove(new HydroPump());
    }
}
