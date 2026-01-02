package com.lin.pokemon_journey;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;

public class Ability_Texture {
    Texture Bug_AbilityButton = new Texture("AbilityButton/Bug_AbilityButton.png");
    Texture Dark_AbilityButton = new Texture("AbilityButton/Dark_AbilityButton.png");
    Texture Dragon_AbilityButton = new Texture("AbilityButton/Dragon_AbilityButton.png");
    Texture Electric_AbilityButton = new Texture("AbilityButton/Electric_AbilityButton.png");
    Texture Fighting_AbilityButton = new Texture("AbilityButton/Fighting_AbilityButton.png");
    Texture Fire_AbilityButton = new Texture("AbilityButton/Fire_AbilityButton.png");
    static Texture Fire_Type_Icon = new Texture("TypeIcon/Fire_Type_Icon.png");
    Texture Flying_AbilityButton = new Texture("AbilityButton/Flying_AbilityButton.png");
    Texture Ghost_AbilityButton = new Texture("AbilityButton/Ghost_AbilityButton.png");
    Texture Grass_AbilityButton = new Texture("AbilityButton/Grass_AbilityButton.png");
    Texture Ground_AbilityButton = new Texture("AbilityButton/Ground_AbilityButton.png");
    Texture Ice_AbilityButton = new Texture("AbilityButton/Ice_AbilityButton.png");
    Texture Normal_AbilityButton = new Texture("AbilityButton/Normal_AbilityButton.png");
    static Texture Normal_Type_Icon = new Texture("TypeIcon/Normal_Type_Icon.png");
    Texture Poison_AbilityButton = new Texture("AbilityButton/Poison_AbilityButton.png");
    Texture Psychic_AbilityButton = new Texture("AbilityButton/Psychic_AbilityButton.png");
    Texture Rock_AbilityButton = new Texture("AbilityButton/Rock_AbilityButton.png");
    Texture Steel_AbilityButton = new Texture("AbilityButton/Steel_AbilityButton.png");
    Texture Water_AbilityButton = new Texture("AbilityButton/Water_AbilityButton.png");

    public static void drawTypeIcon(String type, Batch batch, float x, float y) {
        switch (type) {
            case "Fire":
                batch.draw(Fire_Type_Icon, x, y);
                break;
            case "Normal":
                batch.draw(Normal_Type_Icon, x, y);
                break;
            // Add more cases for other types as needed
        }
    }
}
