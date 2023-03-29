/* rastgele sayı üretecek olan class */

import java.util.Random;

public class Die {
    int nextRoll() {
        Random rn = new Random();
        int a = rn.nextInt(6) + 1;
        return a;
    }

}