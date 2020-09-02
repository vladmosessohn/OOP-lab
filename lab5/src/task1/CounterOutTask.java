package task1;

public class CounterOutTask implements Task {
    private static int contor;
    public void execute(){
        contor++;
        System.out.println(contor);
    }
}
