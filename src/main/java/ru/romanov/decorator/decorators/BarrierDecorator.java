package ru.romanov.decorator.decorators;

import ru.romanov.decorator.interfaces.IDescriptionRailroadCrossing;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

@Decorator
public class BarrierDecorator implements IDescriptionRailroadCrossing {

    @Inject
    @Delegate
    IDescriptionRailroadCrossing simpleRailRoad;

    @Override
    public void description() {
        simpleRailRoad.description();
        System.out.println(this);
    }

    @Override
    public String toString() {
        final String BARRIER = "Автоматически срабатывающие препятствия";
        return "- " + BARRIER;
    }
}
