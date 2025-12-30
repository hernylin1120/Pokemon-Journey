package com.lin.pokemon_journey;

public class BattleMove {
    int priority;
    String subtitle;
    String effect = null;
    public BattleMove(int priority, String subtitle) {
        this.subtitle = subtitle;
        this.priority = priority;
    }
    public void activate() {
    }
}
