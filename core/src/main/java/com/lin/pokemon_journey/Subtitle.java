package com.lin.pokemon_journey;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subtitle {
    List<String> subtitle = new ArrayList<>();
    float subtitleDuration = 1.5f;
    int subtitleTextY;
    public void renderSubtitle(int subtitleTextY , float delta) {
        this.subtitleTextY = subtitleTextY;
//        if (!subtitle.isEmpty()) {
//            inputText.inputText(true, batch, subtitle, 16, subtitleTextY);
//            subtitleTimer += delta;
//            if (subtitleTimer > subtitleDuration) {
//                subtitle = "";
//                if (!abilityEffectText.isEmpty()) {
//                    subtitle = abilityEffectText;
//                    subtitleTimer = 0f;
//                    abilityEffectText = "";
//                }
//                clickable = true;
//            }
//        } else {
//            inputText.inputText(true, batch, "What will " + playerPokemon.name.toUpperCase() + " do?", 16, subtitleTextY);
//            subtitleTimer = 0f;
//        }
    }
    public void addSubtitle(String[] text) {
        subtitle.addAll(Arrays.asList(text));
    }
}
