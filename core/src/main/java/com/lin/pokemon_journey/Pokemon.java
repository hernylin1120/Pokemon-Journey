package com.lin.pokemon_journey;

import com.badlogic.gdx.graphics.Texture;

import java.awt.image.BufferedImage;

public class Pokemon {
    int id;
    String name;
    String[] type; // e.g., "Fire", "Water"
    Texture[] sprites;
    int HP;
    int maxHP;
    int attack;
    int defense;
    int specialAttack;
    int specialDefense;
    int speed;
    Ability[] abilities;

    public Pokemon(int id, String name, String[] type, Texture[] sprites,
                   int HP, int attack, int defense, int specialAttack,
                   int specialDefense, int speed, Ability[] abilities) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.sprites = sprites;
        this.HP = HP;
        this.maxHP = HP;
        this.attack = attack;
        this.defense = defense;
    }
}

