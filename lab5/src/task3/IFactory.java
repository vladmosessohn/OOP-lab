package task3;

import task2.Container;

public interface IFactory {

    /**
     * Creates a Container which implements the strategy given as a parameter.
     *
     * @param strategy The required Strategy.
     * @return a Container which respects the strategy given as a parameter.
     */
    Container createContainer(Strategy strategy);
}
