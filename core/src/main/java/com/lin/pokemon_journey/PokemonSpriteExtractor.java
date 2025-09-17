package com.lin.pokemon_journey;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PokemonSpriteExtractor {
    private Texture spriteSheet;

    // 建構子：加載精靈圖
    public PokemonSpriteExtractor(String spriteSheetPath) {
        this.spriteSheet = new Texture(Gdx.files.internal(spriteSheetPath));
    }

    private Texture extractSubTexture(int x, int y, int width, int height) {
        spriteSheet.getTextureData().prepare();
        Pixmap fullPixmap = spriteSheet.getTextureData().consumePixmap();
        Pixmap subPixmap = new Pixmap(width, height, fullPixmap.getFormat());
        subPixmap.drawPixmap(fullPixmap, 0, 0, x, y, width, height);
        Texture subTexture = new Texture(subPixmap);

        // 釋放 Pixmap 資源
        subPixmap.dispose();
        fullPixmap.dispose();

        return subTexture;
    }

    // 方法：裁剪特定區域的精靈圖
    public Texture[] extractSprite(int id) {
        Texture[] sprites = new Texture[3];
        int width = 80;
        int height = 80;
        int line = id / 9;
        sprites[0] = extractSubTexture(1, 44 + (44 + height * 2) * line, width, height);
        sprites[1] = extractSubTexture(2 + width, 44 + (44 + height * 2) * line, width, height);
        sprites[2] = extractSubTexture(3 + 2 * width, 44 + (44 + height * 2) * line, width, height);
        return sprites;
    }
}
