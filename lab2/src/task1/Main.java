package task1;

public class Main {
    public static void main(String[] args){
        Complex nr = new Complex();
        Complex nr2 = new Complex(2,3);
        nr.AddWithComplex(nr2);
        nr.ShowNumber();
    }
}
