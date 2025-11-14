package com.lin.pokemon_journey;

public class Fishing_Screen {
    String subtitle;
    public void fishing() {
        int i = new java.util.Random().nextInt(100);
        if (i < 84) {
            //pokemon
        } else if (i < 94) {
            // berries
            subtitle = Main.player.name + "get";
        } else {
            //cd
            subtitle = Main.player.name + "get";
        }
    }
}
