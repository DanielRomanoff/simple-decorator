package ru.romanov.decorator.decorators;

import ru.romanov.decorator.interfaces.IDescriptionRailroadCrossing;

import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.inject.Inject;

@Decorator
public class TrafficLightsDecorator implements IDescriptionRailroadCrossing {

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
        return "- Светофор на переезде";
    }
}
