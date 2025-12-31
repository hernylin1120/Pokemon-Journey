package com.lin.pokemon_journey;

public class UseItem extends BattleMove {
    Item item;
    public UseItem(Item item) {
        super(10, "Use an item from your bag");
        this.item = item;
    }
    @Override
    public void activate() {

    }
}
