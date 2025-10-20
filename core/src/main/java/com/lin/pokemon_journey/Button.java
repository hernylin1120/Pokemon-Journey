package com.lin.pokemon_journey;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public class Button {
    Rectangle buttonBounds;
    Texture texture;
    Runnable onClick;
    public Button(int X, int Y, Texture texture, SpriteBatch batch, Runnable onClick) {
        this.texture = texture;
        this.onClick = onClick;
        this.buttonBounds = new Rectangle(X, Y, texture.getWidth(), texture.getHeight());
        batch.draw(texture, buttonBounds.x, buttonBounds.y, buttonBounds.width, buttonBounds.height);
        if (Gdx.input.justTouched()) {
            float touchX = Gdx.input.getX();
            float touchY = Gdx.graphics.getHeight() - Gdx.input.getY();
            if (buttonBounds.contains(touchX, touchY)) {
                onClick.run();
            }
        }
    }
}
