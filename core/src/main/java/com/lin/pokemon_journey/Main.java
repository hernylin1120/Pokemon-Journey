package com.lin.pokemon_journey;

import com.badlogic.gdx.Game;

import java.awt.image.BufferedImage;
import java.io.IOException;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends Game {
    public static PokemonFactory pokemonFactory;

    @Override
    public void create() {
        pokemonFactory = new PokemonFactory();
        setScreen(new Home_Screen(this));
    }
}
