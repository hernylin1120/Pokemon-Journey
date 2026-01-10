package com.lin.pokemon_journey;

import com.badlogic.gdx.graphics.Texture;

import java.util.function.Consumer;

public class Berries extends Item {
    private float plantedTime = 0;
    private float firstStageTime;
    public Berries(String name, String description, Texture texture, Consumer<Pokemon> effect) {
        super(name, description, texture, effect);
    }
}
