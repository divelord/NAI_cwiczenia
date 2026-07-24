package cwiczenia11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        String filePath = "data/plecak.txt";
        int capacity = 0;
        int numOfItems;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String firstLine = br.readLine();
            String[] parts = firstLine.split(" ");
            capacity = Integer.parseInt(parts[0]);
            numOfItems = Integer.parseInt(parts[1]);

            String secondLine = br.readLine();
            String[] valueArr = secondLine.split(",");

            String thirdLine = br.readLine();
            String[] weightArr = thirdLine.split(",");

            for (int i = 0; i < numOfItems; i++) {
                int value = Integer.parseInt(valueArr[i]);
                int weight = Integer.parseInt(weightArr[i]);
                items.add(new Item(value, weight));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        items.sort((item1, item2) -> Double.compare(item2.getRatio(), item1.getRatio()));

        int totalWeight = 0;
        int totalValue = 0;
        List<Item> pickedItems = new ArrayList<>();

        for (Item item : items) {
            if (totalWeight + item.getWeight() <= capacity) {
                pickedItems.add(item);
                totalWeight += item.getWeight();
                totalValue += item.getValue();
            }
        }

        System.out.println("Łączna wartość: " + totalValue);
        System.out.println("Łączna waga: " + totalWeight);
        System.out.println("Zapakowane przedmioty");
        for (Item item : pickedItems) {
            System.out.println(item);
        }
    }
}
