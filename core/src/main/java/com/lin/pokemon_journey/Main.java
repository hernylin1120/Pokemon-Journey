package com.lin.pokemon_journey;

import com.badlogic.gdx.Game;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends Game {
    public static Player player;

    @Override
    public void create() {

        player = new Player("Lin");
        player.pokemons[0] = PokemonFactory.createPokemon("Charmander");
        player.pokemons[0].setLevel(99);
        player.pokemons[0].abilities[0] = AbilityFactory.createAbility("Growl");
        player.pokemons[0].abilities[1] = AbilityFactory.createAbility("Scratch");
        player.pokemons[0].abilities[2] = AbilityFactory.createAbility("Ember");
        player.pokemons[1] = PokemonFactory.createPokemon("Venusaur");
        player.pokemons[1].setLevel(99);
        player.bag.put(ItemFactory.createItem("Potion"), 5);
        setScreen(new Home_Screen(this));
    }
}
