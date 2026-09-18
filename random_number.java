/**
 * random_number
 */
import java.util.Random;
public class random_number {

    public static void main(String[] args) {
        
        Random random = new Random();
        int x = random.nextInt(10)+1;
        double y = random.nextDouble(21);
        boolean z = random.nextBoolean();
        System.out.println(x);
        System.out.println(y); 
        System.out.println(z);
    }
}