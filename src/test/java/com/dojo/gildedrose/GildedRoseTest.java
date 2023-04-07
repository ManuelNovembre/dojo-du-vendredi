package com.dojo.gildedrose;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;class GildedRoseTest {
    @Test
    void foo() {
        Item[] items = new Item[]{new Item("foo", 0, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("fixme", app.items[0].name);
    }

    @Test
    void items_quality_should_decrease() {
        // GIVEN
        Item[] baseItems = new Item[]{new Item("Base Item", 10, 20)};
        var gildedRose = new GildedRose(baseItems);

        // WHEN
        gildedRose.updateQuality();

        // THEN
        Assertions.assertEquals("Base Item", baseItems[0].name);
        Assertions.assertEquals(9, baseItems[0].sellIn);
        Assertions.assertEquals(19, (baseItems[0].quality));
    }
//TODO test sulfuras case  (with prefix)
//TODO test aged brie case
}