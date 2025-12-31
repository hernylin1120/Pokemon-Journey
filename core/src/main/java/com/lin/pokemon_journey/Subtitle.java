package com.lin.pokemon_journey;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//public class Subtitle {
//    private static float subtitleTimer = 0f;
//    private static float subtitleDuration = 1.5f;
//    private static int currentTextIndex = 0;
//    private static String[] currentTexts = null;
//    private static boolean isActive = false;
//    public Subtitle() {
//
//    }
//
//    // 啟動字幕顯示
//    public static void show(String[] texts) {
//        currentTexts = texts;
//        currentTextIndex = 0;
//        subtitleTimer = 0f;
//        isActive = true;
//    }
//
//    // 每幀更新字幕(必須在 render 中調用)
//    public static boolean update(float delta, int x, int y, InputText inputText, SpriteBatch batch) {
//        if (!isActive || currentTexts == null) {
//            return false;
//        }
//
//        // 顯示當前文字
//        if (currentTextIndex < currentTexts.length) {
//            inputText.inputText(true, batch, currentTexts[currentTextIndex], x, y);
//
//            subtitleTimer += delta;
//            if (subtitleTimer >= subtitleDuration) {
//                currentTextIndex++;
//                subtitleTimer = 0f;
//            }
//            return true;
//        } else {
//            isActive = false;
//            return false;
//        }
//    }
//
//    public static boolean isShowing() {
//        return isActive;
//    }
//}
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
