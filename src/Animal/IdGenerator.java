package Animal;

import java.util.Random;

public class IdGenerator {
    public static int getId(){
        return new Random().nextInt(Integer.MAX_VALUE);
    }
}
