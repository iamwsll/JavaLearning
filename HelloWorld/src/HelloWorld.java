//This is a simple program that prints "Hello,World!"to the console.
//And this is also a program that demonstrates some basic Java syntax（句法规则）.
//I just record the syntax that is different from C++.
public class HelloWorld
{

    public static void main(String[] args)
    {
        System.out.println("Hello,World!");

        System.out.println("println自带换行");
        System.out.print("print不自带换行");

        /* 在java中，这种风格的注释是不能嵌套的。
         * System.out.println("Hello,World!");
         * System.out.println("Hello,World!");
         */

        //java 中，在数字前加0b可以表示二进制数，同时可以用下划线分隔数字，如下：
        int x = 0b1010_1011;
        System.out.println(x);

        //如果我们需要对Byte进行运算，如果有运算时溢出的风险，可以使用Integer.toUnsignedInt()方法
        byte b = (byte) 0b1111_1111;
        byte a = (byte) 0b0000_0001;
        System.out.println(Byte.toUnsignedInt(b)+Byte.toUnsignedInt(a));

        //boolean不能与int进行转换

        //java中如果对于局部变量可以从变量的初始值推断出类型，那么就可以省略类型声明
        var message = "Hello,World!";
        System.out.println(message);

        //final关键字有些类似于c++中的const关键字，但是final关键字只能用于局部变量，不能用于成员变量
        final double CM_PER_INCH = 2.54;
        System.out.println(CM_PER_INCH);

        //枚举类型：
        enum Size
        {
            SMALL, MEDIUM, LARGE, EXTRA_LARGE
        }
        Size asize = Size.SMALL;
        System.out.println(asize);

        //java的数学类中有许多有用的方法,如下面这个可以使用Math.addExact()方法来检查是否溢出
        long ans = Math.addExact(1, 2);
        System.out.println(ans);

        //这是退出的方法
        System.exit(0);
    }
}
