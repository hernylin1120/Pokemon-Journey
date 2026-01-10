package com.lin.pokemon_journey;

public abstract class BattleMove {
    int priority;
    String[] subtitle;
    String effect = null;
    public BattleMove(int priority, String[] subtitle) {
        this.subtitle = subtitle;
        this.priority = priority;
    }
    public abstract void activate();
}
