package task1;

public class Main {
    public static void main(String[] args){
        PasswordMaker pass = new PasswordMaker("vlad");
        String s = pass.getPassword();
        System.out.println(s);
    }
}
