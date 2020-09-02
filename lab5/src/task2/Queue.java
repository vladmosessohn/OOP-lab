package task2;

import task1.Task;

import java.util.ArrayList;

public class Queue extends Duplicate implements Container {
    ArrayList<Task> list = new ArrayList<Task>();
    public int size(){
        return list.size();
    }
    public void push(Task t){
        list.add(t);
    }
    public Task pop(){
        if(isEmpty()) return null;
        Task t = list.get(0);
        list.remove(0);
        return t;
    }
    public boolean isEmpty(){
        if(list.isEmpty()) return true;
        return false;
    }
    public void transferFrom(Container c){
        while (!c.isEmpty())
            list.add(c.pop());
    }
}
