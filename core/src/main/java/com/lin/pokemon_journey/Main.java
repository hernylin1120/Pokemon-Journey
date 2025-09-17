package com.lin.pokemon_journey;

import com.badlogic.gdx.Game;

import java.awt.image.BufferedImage;
import java.io.IOException;

/** {@link com.badlogic.gdx.ApplicationListener} implementation shared by all platforms. */
public class Main extends Game {
    public PokemonFactory pokemonFactory;
    public static PokemonSpriteExtractor pokemonSpriteExtractor;

    @Override
    public void create() {
        pokemonSpriteExtractor = new PokemonSpriteExtractor("DS _ DSi - Pokemon Diamond _ Pearl - Pokemon - Pokemon (1st Generation).png");
        setScreen(new Home_Screen(this));
    }
}
