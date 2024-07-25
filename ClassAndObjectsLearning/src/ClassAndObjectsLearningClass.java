import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;

public class ClassAndObjectsLearningClass
{
    public static void main(String[] args)
    {
        Date today = new Date();
        System.out.println("Today is: " + today);
        String str = today.toString();
        System.out.println("Today is: " + str);

        //java中的对象全部默认是对某个对象的引用，这点与c++不同
        //我们理解为对象变量是一个指针，指向对象的内存地址
        //由于指针是可以有null的，因此java的对象也可以是null
        //也就是说Date birthday; birthday = null;是合法的
        //上面这句话实际上也是类似于c++的Date *birthday = nullptr;
        //因此java中的Date today = new Date();与c++的Date *today = new Date();是等价的
        //因此c++中的深拷贝在java中必须通过clone()方法来实现

        //LocalDate类
        LocalDate today2 = LocalDate.now();
        System.out.println("Today is: " + today2);
        LocalDate newYear = LocalDate.of(2020, 1, 1);
        int year = newYear.getYear();
        int month = newYear.getMonthValue();
        int day = newYear.getDayOfMonth();
        System.out.println("Year: " + year + " Month: " + month + " Day: " + day);

        //LocalDate类的plusDays()方法
        LocalDate nextYear = newYear.plusDays(365);
        year = nextYear.getYear();
        month = nextYear.getMonthValue();
        day = nextYear.getDayOfMonth();
        System.out.println("Year: " + year + " Month: " + month + " Day: " + day);

        //我们尝试使用这个类来实现一个有意思的日历
        LocalDate date = LocalDate.now();
        int nowMonth = date.getMonthValue();
        int nowToday = date.getDayOfMonth();
        date = date.minusDays(nowToday - 1);//将日期变成这个月的第一天
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();//这里实际上是得到了一个1-7的数字，1 代表星期一，7 代表星期日
        //因为getDayOfWeek()返回的是一个DayOfWeek枚举类型，而DayOfWeek枚举类型有一个getValue()方法
        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for(int i = 1; i < value; i++)
        {
            System.out.print("    ");
        }
        while(date.getMonthValue() == nowMonth)
        {
            System.out.printf("%3d", date.getDayOfMonth());
            if(date.getDayOfMonth() == nowToday)
            {
                System.out.print("*");
            }
            else
            {
                System.out.print(" ");
            }
            date = date.plusDays(1);
            if(date.getDayOfWeek().getValue() == 1)
            {
                System.out.println();
            }
        }
        if(date.getDayOfWeek().getValue() != 1)
        {
            System.out.println();
        }
    }
}
