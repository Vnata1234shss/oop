package org.example.hw;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс торгового автомата бутилированной воды
 */
public class VendingMachineBottle implements VendingMachine {
    List<BottleOfWater> bottleOfWaterList = new ArrayList<>();


    @Override
    public void initProduct() {
    }

    /**
     *
     * @param bottle Лист экземпляров класса бутилированной воды
     */
    public void initProduct(List<BottleOfWater> bottle) {
        this.bottleOfWaterList = bottle;
    }

    /**
     *  
     * @return null
     */
    @Override
    public String getProduct() {
        return null;
    }

    /*
     *
     * @param name наименование нужной воды
     * @return в строковом виде содержимое экземпляра класса BottleOfWater, или не найдено.
     */
    public String getProduct(String name) {
        for (BottleOfWater el : bottleOfWaterList) {
            if (el.getName().equals(name)) return el.toString();
        }
        return "Не найдено";
    }
}
