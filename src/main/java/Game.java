import Pokemons.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Battle;

public class Game {
    public static void main(String[] args){
        Battle b = new Battle();
        Pokemon p1 = new Azelf("Биба" , 1);
        Pokemon p2 = new Cloyster("Боба", 1);
        Pokemon p3 = new Pikachu("Олег" , 1);
        Pokemon p4 = new Raichu("Лунтик", 1);
        Pokemon p5 = new Pichu("Эдик" , 5);
        Pokemon p6 = new Shellder("Иришка", 16);
        b.addAlly(p1);
        b.addAlly(p4);
        b.addAlly(p5);
        b.addFoe(p2);
        b.addFoe(p3);
        b.addFoe(p6);
        b.go();
    }
}
