package utils;

import enums.Category;
import enums.ComputerAndNetworkSubcategories;

import java.util.ArrayList;
import java.util.List;

public class Utilities {
    public static List<String> getCategoriesNames() {
        List<String> allCategoriesName = new ArrayList<String>();
        Category[] values = Category.values();
        for (Category value : values) {
            allCategoriesName.add(value.getName());
        }
        return allCategoriesName;
    }

    public static List<String> getComputerAndNetworkSubcategoriesNames() {
        List<String> subcategoriesName = new ArrayList<String>();
        ComputerAndNetworkSubcategories[] values = ComputerAndNetworkSubcategories.values();
        for (ComputerAndNetworkSubcategories value : values) {
            subcategoriesName.add(value.getName());
        }
        return subcategoriesName;
    }

    public static void sleep(int second) {
        try {
            Thread.sleep(second * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
