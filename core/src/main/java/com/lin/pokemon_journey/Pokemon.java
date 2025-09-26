package com.lin.pokemon_journey;

import com.badlogic.gdx.graphics.Texture;

public class Pokemon {
    int id;
    String name;
    String gender;
    Boolean genderDifferences;
    String[] type; // e.g., "Fire", "Water"
    String nature;
    Texture[] sprites;
    int HP;
    int currentHP;
    int attack;
    int defense;
    int specialAttack;
    int specialDefense;
    int speed;
    int[] iv;
    int[] ev;
    String condition; //e.g. poisoned
    Ability[] abilities;

    public Pokemon(int id, String name, Boolean genderDifferences, String[] type, Texture[] sprites,
                   int HP, int attack, int defense, int specialAttack, int specialDefense, int speed,
                   Ability[] abilities) {
        this.id = id;
        this.name = name;
        this.genderDifferences = genderDifferences;
        this.type = type;
        this.sprites = sprites;
        this.HP = HP;
        this.currentHP = HP;
        this.attack = attack;
        this.defense = defense;
        this.specialAttack = specialAttack;
        this.specialDefense = specialDefense;
        this.speed = speed;
        this.iv = new int[] {new java.util.Random().nextInt(32), new java.util.Random().nextInt(32), new java.util.Random().nextInt(32), new java.util.Random().nextInt(32), new java.util.Random().nextInt(32),new java.util.Random().nextInt(32)};
        this.abilities = abilities;
    }
}

