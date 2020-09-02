package task1;

public class RandomOutTask implements Task {
    int a;
    RandomOutTask(){
        a = (int) Math.random();
    }
    public void execute(){
        System.out.println(a);
    }
}
