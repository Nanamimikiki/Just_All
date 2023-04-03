package segments;

import java.security.SecureRandom;

public class Dot {

    SecureRandom rand = new SecureRandom();
    private int a = rand.nextInt(9);
    private int b = rand.nextInt(9);

    public int getA(){
        return a;
    }
    public int getB(){
        return b;
    }
}
