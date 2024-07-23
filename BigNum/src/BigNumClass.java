import java.math.*;
public class BigNumClass
{
    public static void main(String[] args)
    {
        BigInteger num1 = new BigInteger("123456789012345678901234567890");
        BigInteger num2 = new BigInteger("987654321098765432109876543210");
        BigInteger sum = num1.add(num2);
        System.out.println("Sum of num1 and num2 is: " + sum);
        BigInteger num3 = num1.multiply(num2);
        int x = 10;
        BigInteger num4 = BigInteger.valueOf(x);
        System.out.println("Product of num1 and num2 is: " + num3);
        System.out.println("num4 is: " + num4);
        BigInteger num5 = num1.divide(num2);
        System.out.println("Division of num1 and num2 is: " + num5);

        BigDecimal num6 = new BigDecimal("123456789012345678901234567890.1234567890");
        BigDecimal num7 = new BigDecimal("987654321098765432109876543210.1234567890");
        System.out.println(num7.divide(num6,RoundingMode.HALF_UP));
    }
}
