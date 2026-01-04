package com.lin.pokemon_journey;

import com.badlogic.gdx.graphics.Texture;

import java.util.Arrays;
import java.util.Objects;
import java.util.function.Consumer;

public class CD extends Item {
    Ability ability;
    int TMNo;
    int selectedSlot = Integer.parseInt(null);
    public CD(String name, int TMNo, String description, Texture texture, Ability ability, Consumer<Pokemon> effect) {
        super(name, description, texture, effect);
        this.ability = ability;
        this.TMNo = TMNo;
    }
}
