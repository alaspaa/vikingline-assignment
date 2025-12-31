package com.assignment.vikingline.inventory;

import com.assignment.vikingline.models.Item;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.assignment.vikingline.inventory.Inventory.updateInventory;

public class InventoryTest {
    @Test
    public void givenAValidIncomingInventoryList_whenUpdateInventoryIsCalled_thenUpdatedInventoryListIsReturned() {
        List<Item> givenCurrentList = new ArrayList<>(
                Arrays.asList(
                        new Item("Bowlingklot", 21),
                        new Item("FotBoll", 2),
                        new Item("PingisBoll", 1),
                        new Item("Tennisboll", 5)
                )
        );

        List<Item> givenIncomingList = new ArrayList<>(
                Arrays.asList(
                        new Item("StudsBoll", 4),
                        new Item("FotBoll", 5),
                        new Item("Tennisboll", 2),
                        new Item("Bowlingklot", 7),
                        new Item("Badboll", 11)
                )
        );

        List<Item> expectedList = new ArrayList<>(
                Arrays.asList(
                        new Item("Badboll", 11),
                        new Item("Bowlingklot", 28),
                        new Item("FotBoll", 7),
                        new Item("PingisBoll", 1),
                        new Item("StudsBoll", 4),
                        new Item("Tennisboll", 7)
                )
        );

        List<Item> result = updateInventory(givenCurrentList, givenIncomingList);

        Assertions.assertThat(result).isEqualTo(expectedList);
    }

    @Test
    public void givenInventoryContainsDuplicates_wheUpdateInventoryIsCalled_thenUpdatedInventoryListIsReturned() {
        List<Item> givenCurrentList = new ArrayList<>(
                Arrays.asList(
                        new Item("Bowlingklot", 15),
                        new Item("FotBoll", 2),
                        new Item("PingisBoll", 1),
                        new Item("Tennisboll", 5),
                        new Item("Bowlingklot", 6)
                )
        );

        List<Item> givenIncomingList = new ArrayList<>(
                Arrays.asList(
                        new Item("StudsBoll", 4),
                        new Item("FotBoll", 5),
                        new Item("Tennisboll", 2),
                        new Item("Bowlingklot", 7),
                        new Item("Badboll", 7),
                        new Item("Badboll", 4)
                )
        );

        List<Item> expectedList = new ArrayList<>(
                Arrays.asList(
                        new Item("Badboll", 11),
                        new Item("Bowlingklot", 28),
                        new Item("FotBoll", 7),
                        new Item("PingisBoll", 1),
                        new Item("StudsBoll", 4),
                        new Item("Tennisboll", 7)
                )
        );

        List<Item> result = updateInventory(givenCurrentList, givenIncomingList);

        Assertions.assertThat(result).isEqualTo(expectedList);
    }

}
