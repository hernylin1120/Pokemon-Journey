package com.lin.pokemon_journey;

public class UseItem extends BattleMove {
    Item item;
    Pokemon target;
    public UseItem(Item item, Pokemon target, String[] subtitle) {
        super(10, subtitle);
        this.item = item;
        this.target = target;
    }
    @Override
    public void activate() {
        item.use(target);
    }
}
