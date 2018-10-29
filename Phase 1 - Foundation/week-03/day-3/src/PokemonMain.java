import java.util.ArrayList;
import java.util.List;

public class PokemonMain {
    public static void main(String[] args) {
        List<Pokemon> pokemonOfAsh = initializePokemons();

        // Every pokemon has a name and a type.

        Pokemon wildPokemon = new Pokemon("Oddish", "leaf", "water");

        System.out.print("I choose you, " + whichToChoose(wildPokemon));
    }

    private static List<Pokemon> initializePokemons() {
        List<Pokemon> pokemon = new ArrayList<>();

        pokemon.add(new Pokemon("Balbasaur", "leaf", "water"));
        pokemon.add(new Pokemon("Pikatchu", "electric", "water"));
        pokemon.add(new Pokemon("Charizard", "fire", "leaf"));
        pokemon.add(new Pokemon("Blastoise", "water", "fire"));
        pokemon.add(new Pokemon("Kingler", "water", "fire"));

        return pokemon;
    }

    public static String whichToChoose(Pokemon wildPokemon){
        for (Pokemon chosen : initializePokemons()){
            if(chosen.isEffectiveAgainst(wildPokemon)) {
                return chosen.name;
            }
        }
        return "none";
    }
}