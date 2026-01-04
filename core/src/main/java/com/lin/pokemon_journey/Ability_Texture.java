package com.lin.pokemon_journey;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;

public class Ability_Texture {
    Texture Bug_AbilityButton = new Texture("AbilityButton/Bug_AbilityButton.png");
    static Texture Bug_Type_Icon = new Texture("TypeIcon/Bug_Type_Icon.png");
    Texture Dark_AbilityButton = new Texture("AbilityButton/Dark_AbilityButton.png");
    static Texture Dark_Type_Icon = new Texture("TypeIcon/Dark_Type_Icon.png");
    Texture Dragon_AbilityButton = new Texture("AbilityButton/Dragon_AbilityButton.png");
    static Texture Dragon_Type_Icon = new Texture("TypeIcon/Dragon_Type_Icon.png");
    Texture Electric_AbilityButton = new Texture("AbilityButton/Electric_AbilityButton.png");
    static Texture Electric_Type_Icon = new Texture("TypeIcon/Electric_Type_Icon.png");
    Texture Fighting_AbilityButton = new Texture("AbilityButton/Fighting_AbilityButton.png");
    static Texture Fighting_Type_Icon = new Texture("TypeIcon/Fighting_Type_Icon.png");
    Texture Fire_AbilityButton = new Texture("AbilityButton/Fire_AbilityButton.png");
    static Texture Fire_Type_Icon = new Texture("TypeIcon/Fire_Type_Icon.png");
    Texture Flying_AbilityButton = new Texture("AbilityButton/Flying_AbilityButton.png");
    static Texture Flying_Type_Icon = new Texture("TypeIcon/Flying_Type_Icon.png");
    Texture Ghost_AbilityButton = new Texture("AbilityButton/Ghost_AbilityButton.png");
    static Texture Ghost_Type_Icon = new Texture("TypeIcon/Ghost_Type_Icon.png");
    Texture Grass_AbilityButton = new Texture("AbilityButton/Grass_AbilityButton.png");
    static Texture Grass_Type_Icon = new Texture("TypeIcon/Grass_Type_Icon.png");
    Texture Ground_AbilityButton = new Texture("AbilityButton/Ground_AbilityButton.png");
    static Texture Ground_Type_Icon = new Texture("TypeIcon/Ground_Type_Icon.png");
    Texture Ice_AbilityButton = new Texture("AbilityButton/Ice_AbilityButton.png");
    static Texture Ice_Type_Icon = new Texture("TypeIcon/Ice_Type_Icon.png");
    Texture Normal_AbilityButton = new Texture("AbilityButton/Normal_AbilityButton.png");
    static Texture Normal_Type_Icon = new Texture("TypeIcon/Normal_Type_Icon.png");
    Texture Poison_AbilityButton = new Texture("AbilityButton/Poison_AbilityButton.png");
    static Texture Poison_Type_Icon = new Texture("TypeIcon/Poison_Type_Icon.png");
    Texture Psychic_AbilityButton = new Texture("AbilityButton/Psychic_AbilityButton.png");
    static Texture Psychic_Type_Icon = new Texture("TypeIcon/Psychic_Type_Icon.png");
    Texture Rock_AbilityButton = new Texture("AbilityButton/Rock_AbilityButton.png");
    static Texture Rock_Type_Icon = new Texture("TypeIcon/Rock_Type_Icon.png");
    Texture Steel_AbilityButton = new Texture("AbilityButton/Steel_AbilityButton.png");
    static Texture Steel_Type_Icon = new Texture("TypeIcon/Steel_Type_Icon.png");
    Texture Water_AbilityButton = new Texture("AbilityButton/Water_AbilityButton.png");
    static Texture Water_Type_Icon = new Texture("TypeIcon/Water_Type_Icon.png");
    public static void drawTypeIcon(String type, Batch batch, float x, float y) {
        switch (type) {
            case "Bug":
                batch.draw(Bug_Type_Icon, x, y);
                break;
            case "Dark":
                batch.draw(Dark_Type_Icon, x, y);
                break;
            case "Dragon":
                batch.draw(Dragon_Type_Icon, x, y);
                break;
            case "Electric":
                batch.draw(Electric_Type_Icon, x, y);
                break;
            case "Fighting":
                batch.draw(Fighting_Type_Icon, x, y);
                break;
            case "Fire":
                batch.draw(Fire_Type_Icon, x, y);
                break;
            case "Flying":
                batch.draw(Flying_Type_Icon, x, y);
                break;
            case "Ghost":
                batch.draw(Ghost_Type_Icon, x, y);
                break;
            case "Grass":
                batch.draw(Grass_Type_Icon, x, y);
                break;
            case "Ground":
                batch.draw(Ground_Type_Icon, x, y);
                break;
            case "Ice":
                batch.draw(Ice_Type_Icon, x, y);
                break;
            case "Normal":
                batch.draw(Normal_Type_Icon, x, y);
                break;
            case "Poison":
                batch.draw(Poison_Type_Icon, x, y);
                break;
            case "Psychic":
                batch.draw(Psychic_Type_Icon, x, y);
                break;
            case "Rock":
                batch.draw(Rock_Type_Icon, x, y);
                break;
            case "Steel":
                batch.draw(Steel_Type_Icon, x, y);
                break;
            case "Water":
                batch.draw(Water_Type_Icon, x, y);
                break;
        }
    }
}
