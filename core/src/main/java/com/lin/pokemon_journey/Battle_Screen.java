package com.lin.pokemon_journey;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

import java.util.Arrays;
import java.util.Objects;

public class Battle_Screen implements Screen {
    private Game game;
    private Boolean duoGame = false;
    private SpriteBatch batch;
    private Texture background;
    private int backgroundY;
    private int backgroundWidth;
    private int backgroundHeight;
    private Texture ground;
    private Texture subtitle_bar;
    private int subtitleBarY;
    private Texture decideScreen;
    boolean clickable = true;
    private Texture decideScreenFightButton;
    private Texture decideScreenBagButton;
    private Texture decideScreenRunButton;
    private Texture decideScreenPokemonButton;
    private Texture choosingAbilityScreen;
    private Texture pokemonScreen;
    private Texture pokemonScreenFirstPokemonCard;
    private Texture pokemonScreenPokemonCard;
    private Texture pokemonScreenBackButton;
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
    private Texture OpponentSingleHPBar;
    private Trainer trainer;
    private Pokemon playerPokemon;
    private Pokemon opponentPokemon;
    private boolean inDecideScreen = true;
    private boolean inAbilityScreen = false;
    private boolean inPokemonScreen = false;
    private boolean inStartingBattle = true;
    private boolean inBattle = false;
    private boolean inEndingBattle = false;
    private InputText inputText = new InputText();
    private String subtitle = "";
    private String abilityEffectText = "";
    private float subtitleTimer = 0f;
    private Viewport viewport;
    private OrthographicCamera camera;
    int opponentPokemonX;
    int opponentPokemonY;
    Boolean playerTurn;
//    Boolean opponentTurn;
    BattleMove playerMove;
    BattleMove opponentMove;
    public Battle_Screen(Game game) {
        this.game = game;
    }
    public void setPokemonEffect() {
    }
    @Override
    public void show() {
        camera = new OrthographicCamera();
        batch = new SpriteBatch();

        background = new Texture("Ground/Field_Day_Background.png");
        ground = new Texture("Ground/Grass_Ground.png");
        subtitle_bar = new Texture("Subtitle.png");
        decideScreen = new Texture("Decide_Screen.png");
        choosingAbilityScreen = new Texture("Choosing_Ability_Screen.png");
        pokemonScreen = new Texture("Pokemon_Screen.png");
        pokemonScreenFirstPokemonCard = new Texture("Pokemon_Screen_FirstPokemonCard.png");
        pokemonScreenPokemonCard = new Texture("Pokemon_Screen_PokemonCard.png");
        pokemonScreenBackButton = new Texture("Pokemon_Screen_BackButton.png");

        int lowerScreenHeight = Math.max(decideScreen.getHeight(), choosingAbilityScreen.getHeight());
        int totalHeight = background.getHeight() + subtitle_bar.getHeight() + lowerScreenHeight;

        backgroundWidth = background.getWidth();
        backgroundHeight = totalHeight;  //viewport 高度 = 總高度

        viewport = new FitViewport(backgroundWidth, backgroundHeight, camera);

        decideScreenFightButton = new Texture("Decide_Screen_FightButton.png");
        decideScreenBagButton = new Texture("Decide_Screen_BagButton.png");
        decideScreenRunButton = new Texture("Decide_Screen_RunButton.png");
        decideScreenPokemonButton = new Texture("Decide_Screen_PokemonButton.png");
        choosingAbilityScreenCancelButton = new Texture("Choosing_Ability_Screen_CancelButton.png");

        Bug_AbilityButton = new Texture("AbilityButton/Bug_AbilityButton.png");
        Dark_AbilityButton = new Texture("AbilityButton/Dark_AbilityButton.png");
        Dragon_AbilityButton = new Texture("AbilityButton/Dragon_AbilityButton.png");
        Electric_AbilityButton = new Texture("AbilityButton/Electric_AbilityButton.png");
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
        OpponentSingleHPBar = new Texture("OpponentSingleHPBar.png");

        trainer = TrainerFactory.createTrainer("Cynthia");
        opponentPokemon = trainer.pokemons[0];
        Main.player.setCurrentPokemon();
    }
    private Texture getAbilityButtonTexture(String type) {
        switch (type) {
            case "Normal":
                return Normal_AbilityButton;
            case "Fire":
                return Fire_AbilityButton;
            case "Water":
                return Water_AbilityButton;
            case "Grass":
                return Grass_AbilityButton;
            case "Electric":
                return Electric_AbilityButton;
            case "Ice":
                return Ice_AbilityButton;
            case "Fighting":
                return Fighting_AbilityButton;
            case "Poison":
                return Poison_AbilityButton;
            case "Ground":
                return Ground_AbilityButton;
            case "Flying":
                return Flying_AbilityButton;
            case "Psychic":
                return Psychic_AbilityButton;
            case "Bug":
                return Bug_AbilityButton;
            case "Rock":
                return Rock_AbilityButton;
            case "Ghost":
                return Ghost_AbilityButton;
            case "Dragon":
                return Dragon_AbilityButton;
            case "Dark":
                return Dark_AbilityButton;
            case "Steel":
                return Steel_AbilityButton;
//            case "Fairy": return Fairy_AbilityButton;
            default:
                return Normal_AbilityButton;
        }
    }
    //modify it to use button class
    public void abilityButton(int buttonX, int buttonY, Texture buttonTexture, Ability ability) {
        batch.draw(buttonTexture, buttonX, buttonY);
        InputText currentAbility = new InputText();
        int space = 0; //103
        for (int i = 0; i < ability.name.length(); i++) {
            char character = ability.name.charAt(i);
            if (character == '.') {
                space += 5;
            } else if (character == ',') {
                space += 4;
            } else {
                space += 7;
            }
        }
        currentAbility.inputText(true, batch, ability.name, buttonX + 7 + ((108 - space) / 2), buttonY + 39 - 11);
        if (ability.currentPP > 9) {
            currentAbility.inputText(true, batch, Integer.toString(ability.currentPP), buttonX + 86 - 2 * 7, buttonY + 13);
        } else {
            currentAbility.inputText(true, batch, Integer.toString(ability.currentPP), buttonX + 86 - 7, buttonY + 13);
        }
        currentAbility.inputText(true, batch, Integer.toString(ability.maxPP), buttonX + 92, buttonY + 13);
        Rectangle buttonBounds = new Rectangle(buttonX, buttonY, buttonTexture.getWidth(), buttonTexture.getHeight());

        if (Gdx.input.justTouched()) {
            // 使用 viewport 轉換座標
            Vector3 worldCoords = viewport.unproject(new Vector3(Gdx.input.getX(), Gdx.input.getY(), 0));
            if (buttonBounds.contains(worldCoords.x, worldCoords.y)) {
                if (ability.currentPP <= 0) {
                    subtitle = "No PP left for " + ability.name + "!";
                } else {
                    // need to be deleted afterward
                    ability.currentPP--;
                    subtitle = playerPokemon.name + " used " + ability.name + ".";
                    abilityEffectText = AbilityCalculator.abilityDamage(playerPokemon, opponentPokemon, ability);
                    clickable = false;
                }
            }
            inAbilityScreen = false;
            inDecideScreen = true;
        }
    }
    public void allAbilityButton(Pokemon pokemon) {
        int Row1ButtonY = lowerScreenY + choosingAbilityScreen.getHeight() - 24 - Fire_AbilityButton.getHeight();
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
    private float slideTimer = 0f;
    private boolean isSliding = false;
    private float slideDuration = 1f;
    private float trainerStartX = 0f;
    private float trainerSlideX = 0f;
    private float animationTimer = 0f;
    private int currentFrame = 0;
    private boolean isAnimating = false;
    private int completedLoop = 0;
    public void animation(String name, String category, int x, int y, float delta) {
        int duration = 3;
        int targetLoop = 4;
        int frames = 2;
        float frameDuration = (float) duration / (frames * targetLoop);
        if (isAnimating) {
            if (isSliding) {
                slideTimer += delta;
                float progress = Math.min(slideTimer / slideDuration, 1f);  // 0 → 1
                trainerSlideX = trainerStartX + (opponentPokemonX - trainerStartX) * progress;

                if (slideTimer >= slideDuration) {
                    trainerSlideX = opponentPokemonX;
                    isSliding = false;  // 滑入完成,開始循環動畫
                    animationTimer = 0f;
                }
                batch.draw(trainer.sprites[0], trainerSlideX, opponentPokemonY + 20);
            } else {
                animationTimer += delta;
                if (animationTimer >= frameDuration) {
                    animationTimer = 0f;
                    currentFrame = (currentFrame + 1) % frames;
                    if (currentFrame == 0) {
                        completedLoop++;
                        if (completedLoop >= targetLoop) {
                            isAnimating = false;
                            completedLoop = 0;
                        }
                    }
                }
                if (category.equals("Trainer")) {
                    batch.draw(trainer.sprites[currentFrame], x, y);
                } else if (category.equals("Pokemon")) {
                    batch.draw(opponentPokemon.sprites[currentFrame], x, y);
                }
            }
        }
    }
    public void startAnimation() {
        isAnimating = true;
        isSliding = true;
        slideTimer = 0f;
        animationTimer = 0f;
        currentFrame = 0;
        completedLoop = 0;
    }
    public void setDecideScreen() {
        batch.draw(decideScreen, 0, lowerScreenY);
        int fightButtonX = 20;
        int fightButtonY = lowerScreenY + 76;
        Button fightButton = new Button(fightButtonX, fightButtonY, decideScreenFightButton, batch, viewport, () -> {
            if (clickable) {
                inDecideScreen = false;
                inAbilityScreen = true;
            }
        });
        int bagButtonX = 1;
        int bagButtonY = 12;
        Button bagButton = new Button(bagButtonX, bagButtonY, decideScreenBagButton, batch, viewport, () -> {
            if (clickable) {

            }
        });
        int runButtonX = 89;
        int runButtonY = 4;
        Button runButton = new Button(runButtonX, runButtonY, decideScreenRunButton, batch, viewport, () -> {
            if (clickable) {

            }
        });
        int pokemonButtonX = 177;
        Button pokemonButton = new Button(pokemonButtonX, bagButtonY, decideScreenPokemonButton, batch, viewport, () -> {
            if (clickable) {
                inDecideScreen = false;
                inPokemonScreen = true;
            }
        });
    }
    public void setChoosingAbilityScreen() {
        batch.draw(choosingAbilityScreen, 0, lowerScreenY);
        allAbilityButton(playerPokemon);
        int cancelButtonX = 9;
        int cancelButtonY = lowerScreenY + 2;
        Button cancelButton = new Button(cancelButtonX, cancelButtonY, choosingAbilityScreenCancelButton, batch, viewport, () -> {
            if (clickable) {
                inDecideScreen = true;
                inAbilityScreen = false;
            }
        });
    }
    public void setPokemonScreen() {
        batch.draw(pokemonScreen, 0, lowerScreenY);
        int leftMargin = 1;
        int topMargin = 5;
        Texture currentPokemonCard = pokemonScreenPokemonCard;
        int cardX;
        int cardY;
        int playerPokemonCount = (int) Arrays.stream(Main.player.pokemons).filter(Objects::nonNull).count();
        for (int i = 0; i < playerPokemonCount; i++) {
            //lambda cannot use non-final variable, so we need to create a new variable here
            int pokemonNumber = i;  //lambda cannot use non-final variable, also think about null and fainted might happened in the middle of pokemon  for example the 3rd pokemon
            if (i % 2 == 0) {
                cardX = leftMargin;
                cardY = subtitleBarY - subtitle_bar.getHeight() - (topMargin * (i / 2 + 1) + currentPokemonCard.getHeight() * (i / 2));
                if (i != 0) {
                    currentPokemonCard = pokemonScreenFirstPokemonCard;
                }
//                if (Main.player.pokemons[i].condition.equals("Fainted")) {
//                    currentPokemonCard = new Texture("Pokemon_Screen_FaintedPokemonCard.png");
//                }
                Button pokemonCard = new Button(cardX, cardY, currentPokemonCard, batch, viewport, () -> {
                    if (Main.player.pokemons[pokemonNumber] == null) {
                        subtitle = "No Pokemon in this slot.";
                    } else {
                        if (Main.player.pokemons[pokemonNumber].condition.equals("Fainted")) {
                            subtitle = Main.player.pokemons[pokemonNumber].name + " can't battle anymore.";
                        } else {
                            if (playerPokemon != Main.player.pokemons[pokemonNumber]) {
                                playerMove = new SwitchPokemon(Main.player, Main.player.pokemons[pokemonNumber]);
                                inPokemonScreen = false;
                                inDecideScreen = true;
                                activateMoves();
                            } else {
                                subtitle = Main.player.pokemons[pokemonNumber].name + " is already in battle.";
                            }
                        }
                    }
                });
            } else {
                if (duoGame) {
                    currentPokemonCard = pokemonScreenFirstPokemonCard;
                }
                cardX = leftMargin + currentPokemonCard.getWidth() + 2;
                cardY = subtitleBarY - subtitle_bar.getHeight() - 5 - (topMargin * (i / 2 + 1) + currentPokemonCard.getHeight() * (i / 2));
                Button pokemonCard = new Button(cardX, cardY, currentPokemonCard, batch, viewport, () -> {
                    if (Main.player.pokemons[pokemonNumber] == null) {
                        subtitle = "No Pokemon in this slot.";
                    } else {
                        if (Main.player.pokemons[pokemonNumber].condition.equals("Fainted")) {
                            subtitle = Main.player.pokemons[pokemonNumber].name + " can't battle anymore.";
                        } else {
                            if (playerPokemon != Main.player.pokemons[pokemonNumber]) {
                                playerMove = new SwitchPokemon(Main.player, Main.player.pokemons[pokemonNumber]);
                                inPokemonScreen = false;
                                inDecideScreen = true;
                                activateMoves();
                            } else {
                                subtitle = Main.player.pokemons[pokemonNumber].name + " is already in battle.";
                            }
                        }
                    }
                });
            }
            if (Main.player.pokemons[pokemonNumber] != null) {
                batch.draw(Main.player.pokemons[pokemonNumber].sprites[4], cardX + 10, cardY + 6);
            }
            currentPokemonCard = pokemonScreenPokemonCard;
        }
        Button backButton = new Button(pokemonScreen.getWidth() - 1 - pokemonScreenBackButton.getWidth(), lowerScreenY + 3, pokemonScreenBackButton, batch, viewport, () -> {
            inPokemonScreen = false;
            inDecideScreen = true;
        });
    }
    public void activateMoves() {
        opponentMove = trainer.nextMove(opponentPokemon, playerPokemon);
        if (playerMove.priority > opponentMove.priority) {
            subtitle = playerMove.subtitle;
            playerMove.activate();
            subtitle = opponentMove.subtitle;
            opponentMove.activate();
        } else if (playerMove.priority < opponentMove.priority) {
            subtitle = opponentMove.subtitle;
            opponentMove.activate();
            subtitle = playerMove.subtitle;
            playerMove.activate();
        } else {
            if (playerPokemon.currentSpeed > opponentPokemon.currentSpeed) {
                subtitle = playerMove.subtitle;
                playerMove.activate();
                subtitle = opponentMove.subtitle;
                opponentMove.activate();
            } else if (playerPokemon.currentSpeed < opponentPokemon.currentSpeed) {
                subtitle = opponentMove.subtitle;
                opponentMove.activate();
                subtitle = playerMove.subtitle;
                playerMove.activate();
            } else {
                int randomInt = (int) (Math.random() * 2);
                if (randomInt == 0) {
                    subtitle = playerMove.subtitle;
                    playerMove.activate();
                    subtitle = opponentMove.subtitle;
                    opponentMove.activate();
                } else {
                    subtitle = opponentMove.subtitle;
                    opponentMove.activate();
                    subtitle = playerMove.subtitle;
                    playerMove.activate();
                }
            }
        }
    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0f, 0f, 0f, 1f);
        viewport.apply();
        batch.setProjectionMatrix(camera.combined);

        batch.begin();

        int lowerScreenHeight = Math.max(decideScreen.getHeight(), choosingAbilityScreen.getHeight());

        int backgroundStartY = subtitle_bar.getHeight() + lowerScreenHeight;
        batch.draw(background, 0, backgroundStartY);
        batch.draw(ground, 0, backgroundStartY);
        opponentPokemonX = 152;
        opponentPokemonY = backgroundStartY + 35;

        if (inStartingBattle) {
            if (!isAnimating) {
                startAnimation();
            }
            animation(trainer.name, "Trainer", opponentPokemonX, opponentPokemonY + 20, delta);
            if (!isAnimating) {
                inStartingBattle = false;
                inBattle = true;
            }
        } else if (inBattle) {
            batch.draw(opponentPokemon.sprites[0], opponentPokemonX, opponentPokemonY);

            int playerPokemonY = backgroundStartY - 8;
            playerPokemon = Main.player.currentPokemon;
            batch.draw(playerPokemon.sprites[2], 24, playerPokemonY);
            int opponentPokemonHPBarY = backgroundStartY + 91;
            batch.draw(OpponentSingleHPBar, 0, opponentPokemonHPBarY);
            InputText opponentPokemonInfo = new InputText();
            opponentPokemonInfo.inputText(false, batch, opponentPokemon.name.toUpperCase(), 2, backgroundStartY + 107);
            opponentPokemonInfo.inputText(false, batch, "Lv" + opponentPokemon.level, 90, backgroundStartY + 107);

            BitmapFont font = new BitmapFont();
            font.getData().setScale(1f);
            font.draw(batch, String.valueOf(opponentPokemon.currentHP), 10, backgroundHeight - 5);
            font.draw(batch, String.valueOf(playerPokemon.currentHP), 200, backgroundHeight - 130);

            subtitleBarY = lowerScreenHeight;
            batch.draw(subtitle_bar, 0, subtitleBarY);

            lowerScreenY = 0;
            if (inDecideScreen) {
                setDecideScreen();
            } else if (inAbilityScreen) {
                setChoosingAbilityScreen();
            } else if (inPokemonScreen) {
                setPokemonScreen();
            }
            // abilityEffect is clickable
            float subtitleDuration = 1.5f;
            int subtitleTextY = subtitleBarY + subtitle_bar.getHeight() - 22;
            if (!subtitle.isEmpty()) {
                inputText.inputText(true, batch, subtitle, 16, subtitleTextY);
                subtitleTimer += delta;
                if (subtitleTimer > subtitleDuration) {
                    subtitle = "";
                    if (!abilityEffectText.isEmpty()) {
                        subtitle = abilityEffectText;
                        subtitleTimer = 0f;
                        abilityEffectText = "";
                    }
                    clickable = true;
                }
            } else {
                inputText.inputText(true, batch, "What will " + playerPokemon.name.toUpperCase() + " do?", 16, subtitleTextY);
                subtitleTimer = 0f;
            }
        }
//        activateMoves();
        batch.end();
    }

    @Override
    public void dispose() {
        if (batch != null) batch.dispose();
        if (background != null) background.dispose();
        if (subtitle_bar != null) subtitle_bar.dispose();
        if (choosingAbilityScreen != null) choosingAbilityScreen.dispose();
    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width, height, true);
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }

    @Override
    public void hide() {
    }
}
