package com.dojo.gildedrose;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class GildedRoseTest {
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

    @ParameterizedTest
    @ValueSource(strings = {"Sulfuras, hihi", "Sulfuras", "Sulfuras, Hand of Ragnaros"})
    // TODO faire passer tous les cas sulfuras
    void sulfuras_should_not_decrease_in_quantity_and_quality(String sulfuras) {
        // GIVEN
        Item[] baseItems = new Item[]{new Item(sulfuras, 10, 20)};
        var gildedRose = new GildedRose(baseItems);

        // WHEN
        gildedRose.updateQuality();

        // THEN
        Assertions.assertEquals(sulfuras, baseItems[0].name);
        Assertions.assertEquals(10, baseItems[0].sellIn);
        Assertions.assertEquals(20, (baseItems[0].quality));
    }

    //TODO test aged brie case
}