package ru.romanov.decorator;

import ru.romanov.decorator.components.SimpleRailroadCrossingImpl;
import ru.romanov.decorator.interfaces.IDescriptionRailroadCrossing;

import javax.enterprise.inject.se.SeContainer;
import javax.enterprise.inject.se.SeContainerInitializer;

/**
 * Создать интерфейс Описание железнодорожного переезда, описывающий оборудование переезда.
 * Создать класс, описывающий простой не регулируемый переезд.
 * Создать декоратор, добавляющий в описание светофор на переезде и декоратор, добавляющий в описание автоматически срабатывающие препятствия.
 * Продемонстрировать описание с различным набором декораторов.
 * */

public class App {
    public static void main(String[] args) {
        SeContainerInitializer initializer = SeContainerInitializer.newInstance();
        SeContainer container = initializer.initialize();
        IDescriptionRailroadCrossing crossing = container.select(SimpleRailroadCrossingImpl.class).get();
        crossing.description();
    }
}
