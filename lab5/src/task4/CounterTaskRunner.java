package task4;

import task1.Task;
import task3.Strategy;

public class CounterTaskRunner extends AbstractTaskRunner {
    private int contor;

    protected CounterTaskRunner(Strategy strategy) {
        super(strategy);
        contor = 0;
    }

    protected void  afterExecution(Task task){
        contor++;
        System.out.println(contor);
    }
}
