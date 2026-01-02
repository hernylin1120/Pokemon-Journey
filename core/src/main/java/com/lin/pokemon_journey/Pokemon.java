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
    int maxHP;
    int attack;
    int currentAttack;
    int maxAttack;
    int defense;
    int currentDefense;
    int maxDefense;
    int specialAttack;
    int currentSpecialAttack;
    int maxSpecialAttack;
    int specialDefense;
    int currentSpecialDefense;
    int maxSpecialDefense;
    int speed;
    int currentSpeed;
    int maxSpeed;
    int level;
    int[] iv;
    int[] ev;
    int[] statsChange = {0, 0, 0, 0, 0, 0, 0}; // hp, attack, defense, special attack, special defense, speed, accuracy
    String condition = ""; //e.g. poisoned
    Ability[] abilities = new Ability[4];
    Item heldItem;
    int friendship = 0;

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
        this.maxHP = (int) Math.floor(((2 * this.HP + this.iv[0] + (this.ev[0]) / 4) * level) / 100) + level + 10;
        this.maxAttack = (int) Math.floor((((2 * this.attack + this.iv[1] + (this.ev[1]) / 4) * level) / 100) + 5);
        this.maxDefense = (int) Math.floor((((2 * this.defense + this.iv[2] + (this.ev[2]) / 4) * level) / 100) + 5);
        this.maxSpecialAttack = (int) Math.floor((((2 * this.specialAttack + this.iv[3] + (this.ev[3]) / 4) * level) / 100) + 5);
        this.maxSpecialDefense = (int) Math.floor((((2 * this.specialDefense + this.iv[4] + (this.ev[4]) / 4) * level) / 100) + 5);
        this.maxSpeed = (int) Math.floor((((2 * this.speed + this.iv[5] + (this.ev[5]) / 4) * level) / 100) + 5);
        this.setCurrentStat();
    }

    public void levelUp() {
        setLevel(this.level + 1);
    }

    public void setEffect() {
        int[] statsMultiplier;
    }

    public void takeDamage(int damage) {
        this.statsChange[0] -= damage;
        this.currentHP -= damage;
        if (this.currentHP < 0) {
            this.statsChange[0] = -this.maxHP;
            this.currentHP = 0;
        }
        condition = "Fainted";
    }

    public void setCurrentStat() {
        this.currentHP = this.maxHP + statsChange[0];
        this.currentAttack = this.maxAttack + statsChange[1];
        this.currentDefense = this.maxDefense + statsChange[2];
        this.currentSpecialAttack = this.maxSpecialAttack + statsChange[3];
        this.currentSpecialDefense = this.maxSpecialDefense + statsChange[4];
        this.currentSpeed = this.maxSpeed + statsChange[5];
    }
    public void changeFriendship(int i) {
        friendship += i;
        if (friendship >= 255) {
            friendship = 255;
        } else if (friendship < 0) {
            friendship = 0;
        }
    }
}

