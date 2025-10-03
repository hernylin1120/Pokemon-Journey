package com.lin.pokemon_journey;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.ScreenUtils;

public class Home_Screen implements Screen {
    private Game game;
    private SpriteBatch batch;
    private Texture image;
    private Texture buttonTexture;
    private Rectangle buttonBounds;
    private float buttonX = 100;
    private float buttonY = 100;

    public Home_Screen(Game game) {
        this.game = game;
    }

    @Override
    public void show() {
        batch = new SpriteBatch();
//        image = new Texture("libgdx.png");
        buttonTexture = new Texture("9926cea75b7feebf809ee0d9bf576f21.png");

        buttonBounds = new Rectangle(buttonX, buttonY, buttonTexture.getWidth(), buttonTexture.getHeight());
    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0f, 0f, 0f, 1f);

        // 檢查點擊
        if (Gdx.input.justTouched()) {
            float touchX = Gdx.input.getX();
            float touchY = Gdx.graphics.getHeight() - Gdx.input.getY(); // 翻轉 Y 座標

            if (buttonBounds.contains(touchX, touchY)) {
                game.setScreen(new Battle_Screen(game));
            }
        }

        batch.begin();
//        batch.draw(image, 140, 210);
        batch.draw(buttonTexture, buttonX, buttonY); // 繪製按鈕
        batch.end();
    }

    @Override
    public void dispose() {
        if (batch != null) batch.dispose();
        if (image != null) image.dispose();
        if (buttonTexture != null) buttonTexture.dispose();
    }

    @Override public void resize(int width, int height) {}
    @Override public void pause() {}
    @Override public void resume() {}
    @Override public void hide() {}
}
