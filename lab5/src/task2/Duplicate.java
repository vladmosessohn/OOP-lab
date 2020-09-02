package task2;

import task1.Task;

import java.util.ArrayList;

public class Duplicate implements Container {
    ArrayList<Task> list = new ArrayList<Task>();
    @Override
    public Task pop() {
        return null;
    }

    @Override
    public void push(Task task) {
        list.add(task);
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void transferFrom(Container container) {

    }
}
