package com.lin.pokemon_journey;

public class UseItem extends BattleMove {
    Item item;
    Pokemon target;
    public UseItem(Item item, Pokemon target) {
        super(10, "Use an item from your bag");
        this.item = item;
        this.target = target;
    }
    @Override
    public void activate() {
        item.use(target);
    }
}
