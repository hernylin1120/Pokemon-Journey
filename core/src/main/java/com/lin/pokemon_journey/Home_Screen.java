package com.lin.pokemon_journey;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;

public class Home_Screen implements Screen {
    private Game game;
    private SpriteBatch batch;
    private Viewport viewport;
    private OrthographicCamera camera;
    private Texture image;
    private Texture buttonTexture;
    private Rectangle buttonBounds;
    private Texture battleButtonTexture;
    private Texture pokemonButtonTexture;
    private Texture bagButtonTexture;
    private float buttonX = 0;
    private float buttonY = Gdx.graphics.getHeight() - 400;
    private int screenWidth;
    private int screenHeight;

    public Home_Screen(Game game) {
        this.game = game;
    }

    @Override
    public void show() {
        batch = new SpriteBatch();
        battleButtonTexture = new Texture("Quest_Icon.png");
        pokemonButtonTexture = new Texture("Pokemon_Icon.png");
        bagButtonTexture = new Texture("Bag_Icon.png");
        camera = new OrthographicCamera();
        screenHeight = 395;
        screenWidth = 256;
        viewport = new FitViewport(screenWidth, screenHeight, camera);
//        image = new Texture("libgdx.png");
//        buttonTexture = new Texture("9926cea75b7feebf809ee0d9bf576f21.png");
//
//        buttonBounds = new Rectangle(buttonX, buttonY, buttonTexture.getWidth(), buttonTexture.getHeight());
    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0f, 0f, 0f, 1f);
        viewport.apply();
        batch.setProjectionMatrix(camera.combined);

        batch.begin();
        ScreenUtils.clear(0f, 0f, 0f, 1f);
        Button battleButton = new Button(32, 0, battleButtonTexture, batch, viewport, () -> {
            game.setScreen(new Battle_Screen(game));
        });
        Button pokemonButton = new Button(64, 0, pokemonButtonTexture, batch, viewport, () -> {
            game.setScreen(new Pokemon_Screen(game));
        });
        Button bagButton = new Button(96, 0, bagButtonTexture, batch, viewport, () -> {
            game.setScreen(new Bag_Screen(game));
        });
        batch.end();
        // 檢查點擊
//        if (Gdx.input.justTouched()) {
//            float touchX = Gdx.input.getX();
//            float touchY = Gdx.graphics.getHeight() - Gdx.input.getY(); // 翻轉 Y 座標
//
//            if (buttonBounds.contains(touchX, touchY)) {
//                game.setScreen(new Battle_Screen(game));
//            }
//        }
//
//        batch.begin();
////        batch.draw(image, 140, 210);
//        batch.draw(buttonTexture, buttonX, buttonY); // 繪製按鈕
//        batch.end();
    }

    @Override
    public void dispose() {
        if (batch != null) batch.dispose();
        if (image != null) image.dispose();
        if (buttonTexture != null) buttonTexture.dispose();
    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width, height, true);
    }
    @Override public void pause() {}
    @Override public void resume() {}
    @Override public void hide() {}
}
