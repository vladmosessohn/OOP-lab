package task3;

import task2.Container;
import task2.Queue;
import task2.Stack;

public class ContainerFactory implements IFactory {
    public static final ContainerFactory INSTANCE = new ContainerFactory();

    private ContainerFactory() {
    }

    public Container createContainer(Strategy strategy) {
        if(strategy.equals("FIFO")) return new Stack();
            else return new Queue();
    }
}