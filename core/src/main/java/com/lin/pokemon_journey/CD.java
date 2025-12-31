package com.lin.pokemon_journey;

import com.badlogic.gdx.graphics.Texture;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.Consumer;

public class CD extends Item {
    Ability ability;
    public CD(String name, String description, Texture texture, Consumer<Pokemon> effect) {
        super(name, description, texture, effect);
    }
    @Override
    public void use(Pokemon pokemon) {
        int count = (int) Arrays.stream(pokemon.abilities).filter(Objects::nonNull).count();
        if (count < 4) {
            pokemon.abilities[count + 1] = ability;
        } else {
            // pick a ability to replace or not replace
        }
    }
}
