package task2;

import task1.Task;

import java.util.ArrayList;

public class Stack implements Container {
    ArrayList<Task> list = new ArrayList<Task>();

    public int size(){
        return list.size();
    }
    public Task pop(){
        if (isEmpty()) {
            return null;
        }

        Task t = list.get(list.size() - 1);
        list.remove( list.size() - 1 );
        return t;
    }
    public void push(Task t){
        list.add(t);
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
