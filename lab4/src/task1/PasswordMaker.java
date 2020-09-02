package task1;

import java.util.ArrayList;
import java.util.Random;

public class PasswordMaker {
    public int MAGIC_NUMBER = 7;
    public String MAGIC_STRING = "gfdsfsdfdf";
    public String name;
    PasswordMaker(String name){
        this.name = name;
    }
    String RandomStringGenerator(){
        Random rnd = new Random();
        ArrayList<Character> alphabet = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            Character c = MAGIC_STRING.charAt(rnd.nextInt(MAGIC_STRING.length()));
            alphabet.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < MAGIC_NUMBER; i++)
            sb.append(alphabet.get(rnd.nextInt(alphabet.size())));
        return sb.toString();
    }
    String getPassword(){
        Random r = new Random();
        int low = 0;
        int high = 100;
        return RandomStringGenerator() + (name.length()) + r.nextInt(high-low) + low;
    }
}
