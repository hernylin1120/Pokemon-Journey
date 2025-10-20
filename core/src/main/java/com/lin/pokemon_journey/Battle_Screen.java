package com.lin.pokemon_journey;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.Gdx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Battle_Screen implements Screen {
    private Game game;
    private SpriteBatch batch;
    private Texture background;
    private int backgroundY;
    private Texture ground;
    private Texture subtitle_bar;
    private int subtitleBarY;
    private Texture decideScreen;
    private Texture decideScreenFightButton;
    private Texture choosingAbilityScreen;
    private Texture choosingAbilityScreenCancelButton;
    private int lowerScreenY;
    private Texture Bug_AbilityButton;
    private Texture Dark_AbilityButton;
    private Texture Dragon_AbilityButton;
    private Texture Electric_AbilityButton;
    private Texture Fairy_AbilityButton;
    private Texture Fighting_AbilityButton;
    private Texture Fire_AbilityButton;
    private Texture Flying_AbilityButton;
    private Texture Ghost_AbilityButton;
    private Texture Grass_AbilityButton;
    private Texture Ground_AbilityButton;
    private Texture Ice_AbilityButton;
    private Texture Normal_AbilityButton;
    private Texture Poison_AbilityButton;
    private Texture Psychic_AbilityButton;
    private Texture Rock_AbilityButton;
    private Texture Steel_AbilityButton;
    private Texture Water_AbilityButton;
    private Opponent opponent;
    private Pokemon playerPokemon;
    private Pokemon opponentPokemon;
    private boolean inDecideScreen = true;
    private boolean inAbilityScreen = false;
    private InputText inputText = new InputText();
    private String subtitle = "";
    private String abilityEffectText = "";
    private float subtitleTimer = 0f;

    public Battle_Screen(Game game) {
        this.game = game;
    }

    public int damage_formula(Pokemon attacker, Pokemon defender, Ability ability) {
        return (int) (Math.floor(((2 * attacker.level / 5 + 2) * ability.power * (attacker.attack / defender.defense) / 50) + 2) * damage_multiply(ability.type, defender.type));
    }

    public double damage_multiply(String attackType, String[] defenderType) {
        double[][] multiply_chart = {
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0.5, 0, 1, 1, 0.5, 1},
            {1, 0.5, 0.5, 2, 1, 2, 1, 1, 1, 1, 1, 2, 0.5, 1, 0.5, 1, 2, 1},
            {1, 2, 0.5, 0.5, 1, 1, 1, 1, 2, 1, 1, 1, 2, 1, 0.5, 1, 1, 1},
            {1, 0.5, 2, 0.5, 1, 1, 1, 0.5, 2, 0.5, 1, 0.5, 2, 1, 0.5, 1, 0.5, 1},
            {1, 1, 2, 0.5, 0.5, 1, 1, 1, 0, 2, 1, 1, 1, 1, 0.5, 1, 1, 1},
            {1, 0.5, 0.5, 2, 1, 0.5, 1, 1, 2, 2, 1, 1, 1, 1, 2, 1, 0.5, 1},
            {2, 1, 1, 1, 1, 2, 1, 0.5, 1, 0.5, 0.5, 0.5, 2, 0, 1, 2, 2, 0.5},
            {1, 1, 1, 2, 1, 1, 1, 0.5, 0.5, 1, 1, 1, 0.5, 0.5, 1, 1, 0, 2},
            {1, 2, 1, 0.5, 2, 1, 1, 2, 1, 0, 1, 0.5, 2, 1, 1, 1, 2, 1},
            {1, 1, 1, 2, 0.5, 1, 2, 1, 1, 1, 1, 2, 0.5, 1, 1, 1, 0.5 , 1},
            {1, 1, 1, 1, 1, 1, 2, 2, 1, 1, 0.5, 1, 1, 1, 1, 0, 0.5 ,1},
            {1, 0.5, 1, 2, 1, 1, 0.5, 0.5, 1, 0.5, 2, 1, 1, 0.5, 1, 2, 0.5 ,0.5},
            {1, 2, 1, 1, 1, 2, 0.5, 1, 0.5, 2, 1, 2, 1, 1, 1, 1, 0.5 ,1},
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 2, 1, 0.5, 1 ,1},
            {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 0.5 ,0},
            {1, 1, 1, 1, 1, 1, 0.5, 1, 1, 1, 2, 1, 1, 2, 1, 0.5, 1, 0.5},
            {1, 0.5, 0.5, 1, 0.5, 2, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 0.5 ,2},
            {1, 0.5, 1, 1, 1, 1, 2, 0.5, 1, 1, 1, 1, 1, 1, 2, 2, 0.5 ,1}
        };
        int attackTypeInt = getRelativeInt(attackType);
        int defenderTypeInt1 = getRelativeInt(defenderType[0]);
        int defenderTypeInt2;
        double multiplier;
        if (defenderType.length > 1) {
            defenderTypeInt2 = getRelativeInt(defenderType[1]);
            multiplier = multiply_chart[attackTypeInt][defenderTypeInt1] * multiply_chart[attackTypeInt][defenderTypeInt2];
        } else {
            multiplier = multiply_chart[attackTypeInt][defenderTypeInt1];
        }
        if (multiplier == 0) {
            abilityEffectText = "It doesn't affect " + opponentPokemon.name + "...";
        } else if (multiplier < 1) {
            abilityEffectText = "It's not very effective...";
        } else if (multiplier > 1) {
            abilityEffectText = "It's super effective!";
        }
        return multiplier;
    }

    public void setPokemonEffect() {

    }

    public int getRelativeInt(String type) {
        switch (type) {
            case "Normal": return 0;
            case "Fire": return 1;
            case "Water": return 2;
            case "Grass": return 3;
            case "Electric": return 4;
            case "Ice": return 5;
            case "Fighting": return 6;
            case "Poison": return 7;
            case "Ground": return 8;
            case "Flying": return 9;
            case "Psychic": return 10;
            case "Bug": return 11;
            case "Rock": return 12;
            case "Ghost": return 13;
            case "Dragon": return 14;
            case "Dark": return 15;
            case "Steel": return 16;
            case "Fairy": return 17;
            default: return -1;
        }
    }

    @Override
    public void show() {
        batch = new SpriteBatch();
        background = new Texture("Grassland_Field_Background.png");
        ground = new Texture("Grass_Ground.png");
        subtitle_bar = new Texture("Subtitle.png");
        decideScreen = new Texture("Decide_Screen.png");

        decideScreenFightButton = new Texture("Decide_Screen_FightButton.png");
        choosingAbilityScreen = new Texture("Choosing_Ability_Screen.png");
        choosingAbilityScreenCancelButton = new Texture("Choosing_Ability_Screen_CancelButton.png");
        Bug_AbilityButton = new Texture("AbilityButton/Bug_AbilityButton.png");
        Dark_AbilityButton = new Texture("AbilityButton/Dark_AbilityButton.png");
        Dragon_AbilityButton = new Texture("AbilityButton/Dragon_AbilityButton.png");
        Electric_AbilityButton = new Texture("AbilityButton/Electric_AbilityButton.png");
//        Fairy_AbilityButton = new Texture("AbilityButton/Fairy_AbilityButton.png");
        Fighting_AbilityButton = new Texture("AbilityButton/Fighting_AbilityButton.png");
        Fire_AbilityButton = new Texture("AbilityButton/Fire_AbilityButton.png");
        Flying_AbilityButton = new Texture("AbilityButton/Flying_AbilityButton.png");
        Ghost_AbilityButton = new Texture("AbilityButton/Ghost_AbilityButton.png");
        Grass_AbilityButton = new Texture("AbilityButton/Grass_AbilityButton.png");
        Ground_AbilityButton = new Texture("AbilityButton/Ground_AbilityButton.png");
        Ice_AbilityButton = new Texture("AbilityButton/Ice_AbilityButton.png");
        Normal_AbilityButton = new Texture("AbilityButton/Normal_AbilityButton.png");
        Poison_AbilityButton = new Texture("AbilityButton/Poison_AbilityButton.png");
        Psychic_AbilityButton = new Texture("AbilityButton/Psychic_AbilityButton.png");
        Rock_AbilityButton = new Texture("AbilityButton/Rock_AbilityButton.png");
        Steel_AbilityButton = new Texture("AbilityButton/Steel_AbilityButton.png");
        Water_AbilityButton = new Texture("AbilityButton/Water_AbilityButton.png");

        opponent = Main.opponentFactory.Cynthia();
        opponentPokemon = opponent.pokemons[0];

        Pokemon charmander = Main.pokemonFactory.createPokemon("Charmander");
        playerPokemon = charmander;
        playerPokemon.abilities[0] = Main.abilityFactory.createAbility("Growl");
        playerPokemon.abilities[1] = Main.abilityFactory.createAbility("Scratch");
        playerPokemon.abilities[2] = Main.abilityFactory.createAbility("Ember");
    }

    private Texture getAbilityButtonTexture(String type) {
        switch (type) {
            case "Normal": return Normal_AbilityButton;
            case "Fire": return Fire_AbilityButton;
            case "Water": return Water_AbilityButton;
            case "Grass": return Grass_AbilityButton;
            case "Electric": return Electric_AbilityButton;
            case "Ice": return Ice_AbilityButton;
            case "Fighting": return Fighting_AbilityButton;
            case "Poison": return Poison_AbilityButton;
            case "Ground": return Ground_AbilityButton;
            case "Flying": return Flying_AbilityButton;
            case "Psychic": return Psychic_AbilityButton;
            case "Bug": return Bug_AbilityButton;
            case "Rock": return Rock_AbilityButton;
            case "Ghost": return Ghost_AbilityButton;
            case "Dragon": return Dragon_AbilityButton;
            case "Dark": return Dark_AbilityButton;
            case "Steel": return Steel_AbilityButton;
//            case "Fairy": return Fairy_AbilityButton;
            default: return Normal_AbilityButton;
        }
    }

    public void abilityButton(int buttonX, int buttonY, Texture buttonTexture, Ability ability) {
        batch.draw(buttonTexture, buttonX, buttonY);
        Rectangle buttonBounds = new Rectangle(buttonX, buttonY, buttonTexture.getWidth(), buttonTexture.getHeight());
        if (Gdx.input.justTouched()) {
            float touchX = Gdx.input.getX();
            float touchY = Gdx.graphics.getHeight() - Gdx.input.getY();
            if (buttonBounds.contains(touchX, touchY)) {
                subtitle = playerPokemon.name + " used, " + ability.name + ".";
                if (ability.category.equals("Status")) {

                } else {
                    opponentPokemon.currentHP -= damage_formula(playerPokemon, opponentPokemon, ability);
                }
            }
        }
    }

    public void allAbilityButton(Pokemon pokemon) {
        int Row1ButtonY = subtitleBarY - 24 - Fire_AbilityButton.getHeight();
        int Row2ButtonY = Row1ButtonY - 7 - Fire_AbilityButton.getHeight();
        int buttonX;
        int buttonY;
        int abilityNo = 1;
        while (abilityNo <= Arrays.stream(pokemon.abilities).filter(Objects::nonNull).count()) {
            switch (abilityNo) {
                case 1:
                    buttonX = 2;
                    buttonY = Row1ButtonY;
                    abilityButton(buttonX, buttonY, getAbilityButtonTexture(pokemon.abilities[0].type), pokemon.abilities[0]);
                    break;
                case 2:
                    buttonX = 6 + Fire_AbilityButton.getWidth();
                    buttonY = Row1ButtonY;
                    abilityButton(buttonX, buttonY, getAbilityButtonTexture(pokemon.abilities[1].type), pokemon.abilities[1]);
                    break;
                case 3:
                    buttonX = 2;
                    buttonY = Row2ButtonY;
                    abilityButton(buttonX, buttonY, getAbilityButtonTexture(pokemon.abilities[2].type), pokemon.abilities[2]);
                    break;
                case 4:
                    buttonX = 6 + Fire_AbilityButton.getWidth();
                    buttonY = Row2ButtonY;
                    abilityButton(buttonX, buttonY, getAbilityButtonTexture(pokemon.abilities[3].type), pokemon.abilities[3]);
                    break;
            }
            abilityNo++;
        }
    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0f, 0f, 0f, 1f);

//        float scale = Gdx.graphics.getWidth() / 256f;
//        batch.getProjectionMatrix().setToOrtho2D(0, 0, 256, Gdx.graphics.getHeight() / scale);
//        batch.setProjectionMatrix(batch.getProjectionMatrix().scale(scale, scale, 1));

        batch.begin();
        backgroundY = Gdx.graphics.getHeight() - background.getHeight();
//        backgroundY = (int) ((Gdx.graphics.getHeight() / scale) - background.getHeight());
        batch.draw(background, 0, backgroundY);
        batch.draw(ground, 0, backgroundY);

//        Pokemon charizard = Main.pokemonFactory.createPokemon("Charizard");
//        if (charizard.sprites != null) {
//            batch.draw(charizard.sprites[0], 150, Gdx.graphics.getHeight() - 100);
//        }

        batch.draw(opponentPokemon.sprites[0], 150, Gdx.graphics.getHeight() - 100);
        batch.draw(playerPokemon.sprites[2], 24, backgroundY - 8);

        BitmapFont font = new BitmapFont();
        font.getData().setScale(10f);
        font.draw(batch, String.valueOf(opponentPokemon.currentHP), 0, 2000);

        subtitleBarY = backgroundY - subtitle_bar.getHeight();
        batch.draw(subtitle_bar, 0, subtitleBarY);

        if (inDecideScreen) {
            lowerScreenY = subtitleBarY - decideScreen.getHeight();
            batch.draw(decideScreen, 0, lowerScreenY);
            int fightButtonX = 20;
            int fightButtonY = lowerScreenY + 76;
            Button decideButton = new Button(fightButtonX, fightButtonY, decideScreenFightButton, batch, () -> {
                inDecideScreen = false;
                inAbilityScreen = true;
            });
        } else if (inAbilityScreen) {
            lowerScreenY = subtitleBarY - choosingAbilityScreen.getHeight();
            batch.draw(choosingAbilityScreen, 0, lowerScreenY);
            allAbilityButton(playerPokemon);
            int fightButtonX = 9;
            int cancelButtonY = lowerScreenY + 2;
            Button cancelButton = new Button(fightButtonX, cancelButtonY, choosingAbilityScreenCancelButton, batch, () -> {
                inDecideScreen = true;
                inAbilityScreen = false;
            });
        }

        float subtitleDuration = 1f;
        if (!subtitle.isEmpty()) {
            inputText.getText(batch, subtitle, 16, backgroundY - 22);
            subtitleTimer += delta;
            if (subtitleTimer > subtitleDuration) {
                subtitle = "";
                if (!abilityEffectText.isEmpty()) {
                    subtitle = abilityEffectText;
                    subtitleTimer = 0f;
                    abilityEffectText = "";
                }
            }
        } else {
            subtitleTimer = 0f;
        }

        batch.end();
//        batch.setProjectionMatrix(batch.getProjectionMatrix().scale(1 / scale, 1 / scale, 1));
    }

    @Override
    public void dispose() {
        if (batch != null) batch.dispose();
        if (background != null) background.dispose();
        if (subtitle_bar != null) subtitle_bar.dispose();
        if (choosingAbilityScreen != null) choosingAbilityScreen.dispose();
    }

    @Override public void resize(int width, int height) {}
    @Override public void pause() {}
    @Override public void resume() {}
    @Override public void hide() {}
}
