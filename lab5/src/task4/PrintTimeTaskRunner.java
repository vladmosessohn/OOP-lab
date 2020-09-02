package task4;

import task1.Task;
import task3.Strategy;

import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.time.LocalDateTime;
public class PrintTimeTaskRunner extends AbstractTaskRunner {
    protected PrintTimeTaskRunner(Strategy strategy) {
        super(strategy);
    }

    protected void  afterExecution(Task task){
        Calendar rightNow = Calendar.getInstance();
        System.out.println(rightNow.getTime());
    }
}
