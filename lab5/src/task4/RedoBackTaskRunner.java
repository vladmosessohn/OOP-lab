package task4;


import task1.*;
import task2.*;
import task3.ContainerFactory;
import task3.Strategy;
import task4.AbstractTaskRunner;

public class RedoBackTaskRunner extends AbstractTaskRunner {
    private Container reverseContainer;
    public RedoBackTaskRunner(Strategy strategy) {
        super(strategy);
        this.reverseContainer = ContainerFactory.INSTANCE.createContainer(Strategy.LIFO);
    }

    public void redo() {
        while (!this.reverseContainer.isEmpty()) {
            this.reverseContainer.pop().execute();
        }
    }
    @Override
    protected void afterExecution(Task task) {
        this.reverseContainer.push(task);

    }
}