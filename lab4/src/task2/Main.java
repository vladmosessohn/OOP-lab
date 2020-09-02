package task2;

public class Main {
    public static void main(String[] args){
        PassMaker pass = PassMaker.getInstance("vlad");
        String s = pass.getPassword();
        System.out.println(s);
    }
}
