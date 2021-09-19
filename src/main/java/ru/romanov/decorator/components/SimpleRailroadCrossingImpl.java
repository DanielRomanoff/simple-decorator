package ru.romanov.decorator.components;

import ru.romanov.decorator.interfaces.IDescriptionRailroadCrossing;

public class SimpleRailroadCrossingImpl implements IDescriptionRailroadCrossing {

    @Override
    public void description() {
        System.out.println("Описание ЖД переезда:\n" + this);
    }

    @Override
    public String toString() {
        return "- Рельсы\n" +
                "- Шлагбаум";
    }
}
