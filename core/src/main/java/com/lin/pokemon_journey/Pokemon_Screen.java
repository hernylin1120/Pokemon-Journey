package com.lin.pokemon_journey;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.input.GestureDetector;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.badlogic.gdx.input.GestureDetector;
import com.badlogic.gdx.math.Vector2;

import java.util.Arrays;
import java.util.Objects;

public class Pokemon_Screen implements Screen, GestureDetector.GestureListener {
    private Game game;
    private Texture pokemonScreen;
    private Texture BottomScreen;
    private Texture pokemonScreenFirstPokemonCard;
    private Texture pokemonScreenPokemonCard;
    private Texture pokemonScreenBackButton;
    private Texture Pokemon_Info;
    private Texture Pokemon_TrainerMemo;
    private Texture Pokemon_BattleMoves;
    private Texture Pokemon_PokemonSkills;
    private Texture Pokemon_BattleMoves_Desc;
    private SpriteBatch batch;
    private Viewport viewport;
    private OrthographicCamera camera;
    private int screenWidth;
    private int screenHeight;
    private int upperScreenStartY;
    private int lowerScreenY;
    int currentScreenNo = 0;
    private GestureDetector gestureDetector;
    private static final int MAX_SCREEN = 4;
    private float accumulatedDeltaX = 0f;
    private static final float SWIPE_THRESHOLD = 100f;
    private boolean hasChanged = false;
    private int currentAbilityIndex = 0;
    private Pokemon currentPokemon = Main.player.pokemons[0];
    private InputText inputText = new InputText();
    public Pokemon_Screen(Game game) {
        this.game = game;
    }
    @Override
    public void show() {
        batch = new SpriteBatch();

        pokemonScreen = new Texture("Pokemon_Screen.png");
        BottomScreen = new Texture("Empty_Bottom_Screen.png");
        Pokemon_Info = new Texture("Pokemon_Info.png");
        Pokemon_TrainerMemo = new Texture("Pokemon_TrainerMemo.png");
        Pokemon_PokemonSkills = new Texture("Pokemon_PokemonSkills.png");
        Pokemon_BattleMoves = new Texture("Pokemon_BattleMoves.png");
        Pokemon_BattleMoves_Desc = new Texture("Pokemon_BattleMoves_Desc.png");

        upperScreenStartY = BottomScreen.getHeight();
        camera = new OrthographicCamera();
        lowerScreenY = 0;
        screenWidth = Pokemon_Info.getWidth();
        screenHeight = Pokemon_Info.getHeight() + BottomScreen.getHeight();
        viewport = new FitViewport(screenWidth, screenHeight, camera);
        gestureDetector = new GestureDetector(this);
        Gdx.input.setInputProcessor(gestureDetector);
    }

    public void setPokemonScreen() {
    }

    @Override
    public boolean pan(float x, float y, float deltaX, float deltaY) {
        Vector2 worldCoords = viewport.unproject(new Vector2(x, y));

        if (worldCoords.y >= upperScreenStartY && worldCoords.y <= screenHeight) {
            if (!hasChanged) {
                accumulatedDeltaX += deltaX;

                if (accumulatedDeltaX < -SWIPE_THRESHOLD) {
                    if (currentScreenNo < MAX_SCREEN) {
                        currentScreenNo++;
                        hasChanged = true;
                    }
                    accumulatedDeltaX = 0f;
                }
                else if (accumulatedDeltaX > SWIPE_THRESHOLD) {
                    if (currentScreenNo > 0) {
                        currentScreenNo--;
                        hasChanged = true;
                    }
                    accumulatedDeltaX = 0f;
                }
            }
            return true;
        }
        return false; // 不在上方畫面,不處理
    }

    @Override
    public boolean touchDown(float x, float y, int pointer, int button) {
        // 記錄觸摸開始位置
        Vector2 worldCoords = viewport.unproject(new Vector2(x, y));

        // 只有在上方畫面觸摸才處理
        if (worldCoords.y >= upperScreenStartY && worldCoords.y <= screenHeight) {
            return true;
        }
        return false;
    }

    @Override
    public boolean panStop(float x, float y, int pointer, int button) {
        Vector2 worldCoords = viewport.unproject(new Vector2(x, y));

        // 只在上方畫面重置狀態
        if (worldCoords.y >= upperScreenStartY && worldCoords.y <= screenHeight) {
            accumulatedDeltaX = 0f;
            hasChanged = false;
            return true;
        }
        return false;
    }

    // 偵測快速滑動(fling)
    @Override
    public boolean fling(float velocityX, float velocityY, int button) {
        if (Math.abs(velocityX) > Math.abs(velocityY)) {
            if (velocityX > 0) {
                System.out.println("向右快速滑動");
            } else {
                System.out.println("向左快速滑動");
            }
        }
        return true;
    }

    @Override
    public boolean tap(float x, float y, int count, int button) {
        return false;
    }

    @Override
    public boolean longPress(float x, float y) {
        return false;
    }

    @Override
    public boolean zoom(float initialDistance, float distance) {
        return false;
    }

    @Override
    public boolean pinch(Vector2 initialPointer1, Vector2 initialPointer2,
                         Vector2 pointer1, Vector2 pointer2) {
        return false;
    }

    @Override
    public void pinchStop() {
    }

    public void AbilityDetail() {
        batch.draw(Pokemon_BattleMoves_Desc, 0, upperScreenStartY);
    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0f, 0f, 0f, 1f);
        viewport.apply();
        batch.setProjectionMatrix(camera.combined);
        int pokemonAbilityCount = (int) Arrays.stream(currentPokemon.abilities).filter(Objects::nonNull).count();
        batch.begin();
        switch (currentScreenNo) {
            case 0:
                batch.draw(Pokemon_Info, 0, upperScreenStartY);
                inputText.inputText(false, batch, currentPokemon.name, 24, upperScreenStartY + 155);
                inputText.inputText(true, batch, Integer.toString(currentPokemon.level), 24, upperScreenStartY + 139);
                batch.draw(currentPokemon.sprites[0], 18, upperScreenStartY + 48);
                break;
            case 1:
                batch.draw(Pokemon_TrainerMemo, 0, upperScreenStartY);
                inputText.inputText(false, batch, currentPokemon.name, 24, upperScreenStartY + 155);
                inputText.inputText(true, batch, Integer.toString(currentPokemon.level), 24, upperScreenStartY + 139);
                batch.draw(currentPokemon.sprites[0], 18, upperScreenStartY + 48);
                break;
            case 2:
                batch.draw(Pokemon_PokemonSkills, 0, upperScreenStartY);
                inputText.inputText(false, batch, currentPokemon.name, 24, upperScreenStartY + 155);
                inputText.inputText(true, batch, Integer.toString(currentPokemon.level), 24, upperScreenStartY + 139);
                batch.draw(currentPokemon.sprites[0], 18, upperScreenStartY + 48);
                break;
            case 3:
                batch.draw(Pokemon_BattleMoves, 0, upperScreenStartY);
                inputText.inputText(false, batch, currentPokemon.name, 24, upperScreenStartY + 155);
                inputText.inputText(true, batch, Integer.toString(currentPokemon.level), 24, upperScreenStartY + 139);
                batch.draw(currentPokemon.sprites[0], 18, upperScreenStartY + 48);
                for (int i = 0; i < pokemonAbilityCount; i++) {
                    Ability_Texture.drawTypeIcon(currentPokemon.abilities[i].type, batch, 135, upperScreenStartY + 143 - (i * 32));
                    inputText.inputText(false, batch, currentPokemon.abilities[i].name, 169, upperScreenStartY + 145 - (i * 32));
                    inputText.inputText(true, batch, Integer.toString(currentPokemon.abilities[i].currentPP), 214, upperScreenStartY + 131 - (i * 32));
                    inputText.inputText(true, batch, Integer.toString(currentPokemon.abilities[i].maxPP), 231, upperScreenStartY + 131 - (i * 32));
                }
                break;
            case 4:
                AbilityDetail();
                break;
            default:
                currentScreenNo = 0;
                batch.draw(Pokemon_Info, 0, upperScreenStartY);
                break;
        }

        batch.draw(BottomScreen, 0, lowerScreenY);
        Button homeButton = new Button(0, 0, new Texture("Pokemon_Screen_BackButton.png"), batch, viewport, () -> {
            game.setScreen(new Home_Screen(game));
        });
        batch.end();
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

    @Override
    public void dispose() {
    }
}
