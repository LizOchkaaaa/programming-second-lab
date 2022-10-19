package Pokemons;
import Move.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Azelf extends Pokemon {
    public Azelf(String name, int level) {
        super(name , level);
        setType(Type.PSYCHIC);
        setStats(75, 125, 70, 125, 70, 115);
        setMove(new Thunder());
        setMove(new Extrasensory());
        setMove(new Swagger());
        setMove(new CalmMind());
    }
}
