package org.example.hw;

import java.math.BigDecimal;

/**
 * Класс горячих напитков
 */
public class HotDrinks extends Drinkables {
    private int temp;

    /**
     * Перегруженный конструктор класса горячих напитков
     * @param temp   Температура напитка
     */
    public HotDrinks(String name, BigDecimal price, Double volume, int temp) {
        super(name, price, volume);
        this.temp = temp;
    }

    /**
     * @return температуру напитка
     */
    public int getTemp() {
        return temp;
    }

    /**
     
     * @return наименование продукта, стоимость, объем и температуру.
     */
    @Override
    public String toString() {
        return super.toString() + "температура напитка = " + temp;
    }
}
