package com.lin.pokemon_journey;

import com.badlogic.gdx.graphics.Texture;

public class Pokemon {
    int id;
    String name;
    String gender;
    Boolean genderDifferences;
    String[] type; // e.g., "Fire", "Water"
    String nature;
    Characteristic characteristic;
    Texture[] sprites;
    int HP;
    int currentHP;
    int attack;
    int currentAttack;
    int defense;
    int currentDefense;
    int specialAttack;
    int currentSpecialAttack;
    int specialDefense;
    int currentSpecialDefense;
    int speed;
    int currentSpeed;
    int level;
    int[] iv;
    int[] ev;
    String condition; //e.g. poisoned
    Ability[] abilities = new Ability[4];

    public Pokemon(int id, String name, Boolean genderDifferences, String[] type, Texture[] sprites,
                   int HP, int attack, int defense, int specialAttack, int specialDefense, int speed) {
        this.id = id;
        this.name = name;
        this.genderDifferences = genderDifferences;
        this.type = type;
        this.sprites = sprites;
        this.HP = HP;
        this.attack = attack;
        this.defense = defense;
        this.specialAttack = specialAttack;
        this.specialDefense = specialDefense;
        this.speed = speed;
        this.iv = new int[] {new java.util.Random().nextInt(32), new java.util.Random().nextInt(32), new java.util.Random().nextInt(32), new java.util.Random().nextInt(32), new java.util.Random().nextInt(32),new java.util.Random().nextInt(32)};
        this.ev = new int[] {0, 0, 0, 0, 0, 0};
    }

    public void setLevel(int level) {
        // current havent consider natures and abilities
        this.level = level;
        this.currentHP = (int) Math.floor(((2 * this.HP + this.iv[0] + (this.ev[0]) / 4) * level) / 100) + level + 10;
        this.currentAttack = (int) Math.floor((((2 * this.attack + this.iv[1] + (this.ev[1]) / 4) * level) / 100) + 5);
        this.currentDefense = (int) Math.floor((((2 * this.defense + this.iv[2] + (this.ev[2]) / 4) * level) / 100) + 5);
        this.currentSpecialAttack = (int) Math.floor((((2 * this.specialAttack + this.iv[3] + (this.ev[3]) / 4) * level) / 100) + 5);
        this.currentSpecialDefense = (int) Math.floor((((2 * this.specialDefense + this.iv[4] + (this.ev[4]) / 4) * level) / 100) + 5);
        this.currentSpeed = (int) Math.floor((((2 * this.speed + this.iv[5] + (this.ev[5]) / 4) * level) / 100) + 5);
    }

    public void levelUp() {
        setLevel(this.level + 1);
    }

    public void setEffect() {
        int[] statsMultiplier;
    }
}

