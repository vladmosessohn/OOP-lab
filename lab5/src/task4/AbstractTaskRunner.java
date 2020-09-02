package task4;

import task1.Task;
import task2.Container;
import task3.ContainerFactory;
import task3.Strategy;

public abstract class AbstractTaskRunner {
    private Container container;

    protected AbstractTaskRunner(Strategy strategy) {
        container = ContainerFactory.INSTANCE.createContainer(strategy);
    }

    public void addTask(Task task) {
        container.push(task);
    }

    public void executeAll() {
        while (!container.isEmpty()) {
            Task task = container.pop();

            task.execute();

            afterExecution(task);
        }
    }

    protected abstract void afterExecution(Task task);
}
