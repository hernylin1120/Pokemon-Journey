package com.lin.pokemon_journey;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;

import java.awt.image.BufferedImage;
import java.io.IOException;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends Game {
    public static PokemonFactory pokemonFactory;
    public static OpponentFactory opponentFactory;
    public static AbilityFactory abilityFactory;

    @Override
    public void create() {
        pokemonFactory = new PokemonFactory();
        opponentFactory = new OpponentFactory();
        setScreen(new Home_Screen(this));
    }
}
