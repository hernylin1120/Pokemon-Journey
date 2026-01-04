package com.lin.pokemon_journey;

import com.badlogic.gdx.graphics.Texture;

import java.util.function.Consumer;

public abstract class Item {
    String name;
    String description;
    Texture texture;
    private Consumer<Pokemon> effect;
    public Item(String name, String description, Texture texture, Consumer<Pokemon> effect) {
        this.name = name;
        this.description = description;
        this.texture = texture;
        this.effect = effect;
    }
    public void use(Pokemon pokemon) {
        if (effect != null) {
            effect.accept(pokemon);
        }
    }
}
