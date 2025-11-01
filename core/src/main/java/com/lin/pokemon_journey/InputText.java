package com.lin.pokemon_journey;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class InputText {
    private Texture font = new Texture("Text.png");
    int fontWidth;
    int fontHeight;
    int originalX;
    int srcX;
    int srcY;
    int currentY_tuning;
    int space = 0;

    //the position has to recalculated
    //214 is the max pixel
    public void subtitleText(SpriteBatch batch, String text, int x, int y) {
        originalX = x;
        String[] words = text.split(" ");
        for (String word : words) {
            space = 0;
            for (int i = 0; i < word.length(); i++) {
                char character = word.charAt(i);
                if (character == '.') {
                    space += 5;
                } else if (character == ',') {
                    space += 4;
                } else {
                    space += 7;
                }
            }
            if (x + space - originalX > 214) {
                x = originalX;
                y -= 17;
            }
            for (int i = 0; i < word.length(); i++) {
                char character = word.charAt(i);
                int position;
                int line;
                int LRspace = 9;
                int UDspace = 8;
                if (character >= '0' && character <= '9') {
                    fontHeight = 11;
                    fontWidth = 7;
                    srcX = (fontWidth + LRspace) * (character - 48);
                    srcY = 76;
                    currentY_tuning = 0;
                } else if (character == '.') {
                    fontHeight = 11;
                    fontWidth = 5;
                    srcX = 160;
                    srcY = 76;
                    currentY_tuning = 0;
                } else if (character == ',') {
                    fontHeight = 4;
                    fontWidth = 4;
                    srcX = 177;
                    srcY = 85;
                    currentY_tuning = -1;
                } else if ((int) character < 58 && (int) character > 47) {
                    fontHeight = 11;
                    fontWidth = 7;
                    position = character - 48;
                    position = position % 13;
                    srcX = (fontWidth + LRspace) * position;
                    srcY = 76;
                    currentY_tuning = 0;
                } else {
                    fontWidth = 7;
                    position = character - 65;
                    fontHeight = 11;
                    if (position < 26) {
                        line = position / 13;
                        position = position % 13;
                        srcX = (fontWidth + LRspace) * position;
                        srcY = (fontHeight + UDspace) * line;
                        currentY_tuning = 0;
                    } else if (position < 58) {
                        position -= 19;
                        fontHeight = 12;
                        if (position < 26) {
                            position = position % 13;
                            srcX = (fontWidth + LRspace) * position;
                            srcY = 39;
                            currentY_tuning = -2;
                        } else {
                            position = position % 13;
                            srcX = (fontWidth + LRspace) * position;
                            srcY = 58;
                            currentY_tuning = -2;
                        }
                    }
                }
                batch.draw(font, x, y + currentY_tuning, fontWidth, fontHeight, srcX, srcY, fontWidth, fontHeight, false, false);
                x += fontWidth;
            }
            x += 5; // space between words
        }
    }
}
