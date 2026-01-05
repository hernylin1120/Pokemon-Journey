package com.lin.pokemon_journey;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.input.GestureDetector;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import java.util.Map;

public class Bag_Screen implements Screen, GestureDetector.GestureListener  {
    private Game game;
    private SpriteBatch batch;
    private Viewport viewport;
    private OrthographicCamera camera;
    private int screenWidth;
    private int screenHeight;
    private int upperScreenStartY;
    private int lowerScreenY;
    int currentScreenNo = 0;
    private GestureDetector gestureDetector;
    private InputText inputText = new InputText();
    private Texture BottomScreen;
    private Texture Bag_Background;
    private Texture Bag_DescBar;
    private Texture Bag_Items;
    private Texture Bag_Category;
    private Item selectedItem;
    public Bag_Screen(Game game) {
        this.game = game;
    }
    @Override
    public void show() {
        batch = new SpriteBatch();
        camera = new OrthographicCamera();
        lowerScreenY = 0;
        Bag_Background = new Texture("Empty_Bottom_Screen.png");
        Bag_DescBar = new Texture("Bag_DescBar.png");
        Bag_Items = new Texture("Bag_Items.png");
        Bag_Category = new Texture("Bag_Category.png");
        BottomScreen = new Texture("Empty_Bottom_Screen.png");

        upperScreenStartY = BottomScreen.getHeight();
        camera = new OrthographicCamera();
        lowerScreenY = 0;
        screenWidth = Bag_Background.getWidth();
        screenHeight = Bag_Background.getHeight() + BottomScreen.getHeight();
        viewport = new FitViewport(screenWidth, screenHeight, camera);
        gestureDetector = new GestureDetector(this);
        Gdx.input.setInputProcessor(gestureDetector);
    }

    public void setPokemonScreen() {
        batch.draw(Bag_Background, 0, upperScreenStartY);
        batch.draw(Bag_DescBar, 0, upperScreenStartY);
        batch.draw(Bag_Items, screenWidth - Bag_Items.getWidth(), upperScreenStartY + 52);
        batch.draw(Bag_Category, 0, upperScreenStartY + 53);
        int i = 0;
        for (Map.Entry<Item, Integer> entry : Main.player.bag.entrySet()) {
            Item item = entry.getKey();
            int amount = entry.getValue();
            String itemName = item.name;
            inputText.inputText(true, batch, itemName, 112, upperScreenStartY + 160 - (i * 17));
            inputText.inputText(true, batch, "x", 221, upperScreenStartY + 160 - (i * 17));
            inputText.inputText(true, batch, Integer.toString(amount), 240, upperScreenStartY + 160 - (i * 17));
            //the coordinate maybe a bit off
            Rectangle buttonBounds = new Rectangle(112, upperScreenStartY + 160 - (i * 17), 136, 17);
            if (Gdx.input.justTouched()) {
                Vector3 worldCoords = viewport.unproject(new Vector3(Gdx.input.getX(), Gdx.input.getY(), 0));
                if (buttonBounds.contains(worldCoords.x, worldCoords.y)) {
                    selectedItem = item;
                }
            }
            i++;
        }
        if (selectedItem != null) {
            batch.draw(selectedItem.texture, 2, upperScreenStartY + 9);
            inputText.inputText(false, batch, selectedItem.description, 40, upperScreenStartY + 35);
        }
    }

    @Override
    public boolean pan(float x, float y, float deltaX, float deltaY) {
        return false;
    }

    @Override
    public boolean touchDown(float x, float y, int pointer, int button) {
        return false;
    }

    @Override
    public boolean panStop(float x, float y, int pointer, int button) {
        return false;
    }

    @Override
    public boolean fling(float velocityX, float velocityY, int button) {
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

    public void bag() {
    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0f, 0f, 0f, 1f);
        viewport.apply();
        batch.setProjectionMatrix(camera.combined);
        batch.begin();
        setPokemonScreen();
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
