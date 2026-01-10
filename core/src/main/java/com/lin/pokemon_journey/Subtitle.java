package com.lin.pokemon_journey;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Subtitle {
    public static float subtitleDuration = 1.5f;
    private int subtitleTextX;
    private int subtitleTextY;
    private String[] subs;
    Boolean subsEnd = false;
    private float subtitleTimer = 0f;
    private int currentIndex = 0;
    public Subtitle(int subtitleTextX, int subtitleTextY, String[] subs) {
        this.subtitleTextX = subtitleTextX;
        this.subtitleTextY = subtitleTextY;
        this.subs = subs;
    }
    public void renderSubtitle(float delta, InputText inputText, SpriteBatch batch) {
        if (currentIndex >= subs.length) {
            subsEnd = true;
            return;
        }
        inputText.inputText(true, batch, subs[currentIndex], subtitleTextX, subtitleTextY);
        subtitleTimer += delta;
        if (subtitleTimer >= subtitleDuration) {
            currentIndex++;
            subtitleTimer = 0f;
            if (currentIndex >= subs.length) {
                subsEnd = true;
            }
        }
//        else {
//            inputText.inputText(true, batch, "What will " + playerPokemon.name.toUpperCase() + " do?", 16, subtitleTextY);
//            subtitleTimer = 0f;
//        }
    }
}
