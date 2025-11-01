package com.lin.pokemon_journey;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.viewport.Viewport;

public class Button {
    Rectangle buttonBounds;
    Texture texture;
    Runnable onClick;
    public Button(int X, int Y, Texture texture, SpriteBatch batch, Viewport viewport, Runnable onClick) {
        this.texture = texture;
        this.onClick = onClick;
        this.buttonBounds = new Rectangle(X, Y, texture.getWidth(), texture.getHeight());
        batch.draw(texture, buttonBounds.x, buttonBounds.y, buttonBounds.width, buttonBounds.height);
        if (Gdx.input.justTouched()) {
//            float touchX = Gdx.input.getX();
//            float touchY = Gdx.graphics.getHeight() - Gdx.input.getY();
            Vector3 worldCoords = viewport.unproject(new Vector3(Gdx.input.getX(), Gdx.input.getY(), 0));
            if (buttonBounds.contains(worldCoords.x, worldCoords.y)) {
                onClick.run();
            }
        }
    }
}
