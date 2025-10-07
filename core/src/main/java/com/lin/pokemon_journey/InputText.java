package com.lin.pokemon_journey;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class InputText {
    private Texture font = new Texture("Text.png");

    //the position has to recalculated
    public void getText(SpriteBatch batch, String text, int x, int y) {
        int fontWidth = 7;
        int fontHeight;
        String[] words = text.split(" ");
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                char character = word.charAt(i);
                int position;
                int line;
                int LRspace = 9;
                int UDspace = 8;
                if (character == '.') {
                    fontHeight = 11;
                    batch.draw(font, x, y, fontWidth, fontHeight, 160, 76, fontWidth, fontHeight, false, false);
                } else if (character == ',') {
                    fontHeight = 12;
                    batch.draw(font, x, y - 1, fontWidth, fontHeight, 167, 76, fontWidth, fontHeight, false, false);
                } else if ((int) character < 58 && (int) character > 47) {
                    position = character - 48;
                    fontHeight = 11;
                    position = position % 13;
                    batch.draw(font, x, y, fontWidth, fontHeight, (fontWidth + LRspace) * position, 76, fontWidth, fontHeight, false, false);
                } else {
                    position = character - 65;
                    fontHeight = 11;
                    if (position < 26) {
                        line = position / 13;
                        position = position % 13;
                        batch.draw(font, x, y, fontWidth, fontHeight, (fontWidth + LRspace) * position, (fontHeight + UDspace) * line, fontWidth, fontHeight, false, false);
                    } else if (position < 58) {
                        position -= 19;
                        fontHeight = 12;
                        if (position < 26) {
                            position = position % 13;
                            batch.draw(font, x, y - 2, fontWidth, fontHeight, (fontWidth + LRspace) * position, 39, fontWidth, fontHeight, false, false);
                        } else {
                            position = position % 13;
                            batch.draw(font, x, y - 2, fontWidth, fontHeight, (fontWidth + LRspace) * position, 58, fontWidth, fontHeight, false, false);
                        }
                    }
                }
                x += fontWidth;
            }
            x += 5; // space between words
        }
    }
}
