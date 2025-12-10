package com.lin.pokemon_journey;

import com.badlogic.gdx.graphics.Texture;

public class Item {
    String name;
    String description;
    Texture texture;
    public Item(String name, String description, Texture texture) {
        this.name = name;
        this.description = description;
        this.texture = texture;
    }
    public void use(Pokemon pokemon) {}
}
