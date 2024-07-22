//This is a simple program that prints "Hello,World!"
// to the console.
import static java.lang.Math.*;
public class HelloWorld
{
    public static int DAYS_IN_A_WEEK = 7;
    enum Size {SMALL, MEDIUM, LARGE, EXTRA_LARGE};
    public static void main(String[] args)
    {
        System.out.println("Hello,World!");
        System.out.print("Hello,World!\n");

        Long longValue = 100L;
        int var = 0b1001;
        int var1 = 100_000_100;
        Size s = Size.LARGE;
        System.out.println(longValue+" "+var+" "+var1+" "+s);

        double x = 4;
        double y = sqrt(x);
        System.out.println(y);

        double z = Math.pow(2, 3);
        System.out.println(z);


    }
}
