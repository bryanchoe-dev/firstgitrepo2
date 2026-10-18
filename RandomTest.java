import java.util.Arrays;
import java.util.Random;

public class RandomTest {
  public static void main(String[] args) {
    Random rand = new Random();

    int i = rand.nextInt();
    int i100 = rand.nextInt(100);
    long l = rand.nextLong();
    float f = rand.nextFloat();
    double d = rand.nextDouble();
    boolean b = rand.nextBoolean();
    double g = rand.nextGaussian();
    char c = (char) ('A' + rand.nextInt(26));

    byte[] bytes = new byte[5];
    rand.nextBytes(bytes);

    System.out.println("int            : " + i);
    System.out.println("int (0~99)     : " + i100);
    System.out.println("long           : " + l);
    System.out.println("float (0~1)    : " + f);
    System.out.println("double (0~1)   : " + d);
    System.out.println("boolean        : " + b);
    System.out.println("gaussian       : " + g);
    System.out.println("char (A~Z)     : " + c);
    System.out.println("byte[5]        : " + Arrays.toString(bytes));
  }
}
