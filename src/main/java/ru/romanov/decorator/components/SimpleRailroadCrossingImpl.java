package ru.romanov.decorator.components;

import ru.romanov.decorator.interfaces.IDescriptionRailroadCrossing;

public class SimpleRailroadCrossingImpl implements IDescriptionRailroadCrossing {

    @Override
    public void description() {
        System.out.println("Описание ЖД переезда:\n" + this);
    }

    @Override
    public String toString() {
        final String RAILS = "Рельсы";
        final String BARRIER = "Шлагбаум";
        return "- " + RAILS + "\n" +
                "- " + BARRIER;
    }
}
