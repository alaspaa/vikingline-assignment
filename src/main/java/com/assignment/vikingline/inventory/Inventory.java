package com.assignment.vikingline.inventory;

import com.assignment.vikingline.bubblesort.BubbleSort;
import com.assignment.vikingline.models.Item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inventory {
    public static List<Item> updateInventory(List<Item> currentInventory, List<Item> incomingInventory) {

        Map<String, Item> currentInventoryMap = createInventoryMapFromList(currentInventory);

        for (Item incomingItem : incomingInventory) {
            currentInventoryMap.compute(
                    incomingItem.name(),
                    (key, currentInventoryMapItem) ->
                            resolveItemQuantity(incomingItem, currentInventoryMapItem)
            );
        }

        return BubbleSort.bubbleSortByName(
                new ArrayList<>(currentInventoryMap.values())
        );
    }

    private static Map<String, Item> createInventoryMapFromList(List<Item> inventoryList) {
        Map<String, Item> inventoryMap = new HashMap<>(inventoryList.size());
        for (Item item : inventoryList) {
            if (!inventoryMap.containsKey(item.name())) {
                inventoryMap.put(item.name(), item);
            } else {
                inventoryMap.put(
                        item.name(),
                        new Item(
                                item.name(),
                                inventoryMap.get(item.name()).quantity() + item.quantity()
                        )
                );
            }
        }

        return inventoryMap;
    }

    private static Item resolveItemQuantity(Item incomingItem, Item currentItem) {
        if (currentItem == null) {
            return incomingItem;
        }

        return new Item(
                incomingItem.name(),
                currentItem.quantity() + incomingItem.quantity()
        );
    }
}
