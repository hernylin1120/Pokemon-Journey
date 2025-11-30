package com.lin.pokemon_journey;

import com.badlogic.gdx.Game;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends Game {
    public static PokemonFactory pokemonFactory;
    public static TrainerFactory trainerFactory;
    public static AbilityFactory abilityFactory;
    public static Player player;

    @Override
    public void create() {
        pokemonFactory = new PokemonFactory();
        trainerFactory = new TrainerFactory();

        player = new Player("Lin");
        player.pokemons = new Pokemon[6];
        player.pokemons[0] = Main.pokemonFactory.createPokemon("Charmander");
        player.pokemons[0].abilities[0] = Main.abilityFactory.createAbility("Growl");
        player.pokemons[0].abilities[1] = Main.abilityFactory.createAbility("Scratch");
        player.pokemons[0].abilities[2] = Main.abilityFactory.createAbility("Ember");
        player.pokemons[1] = Main.pokemonFactory.createPokemon("Venusaur");
        setScreen(new Home_Screen(this));
    }
}
