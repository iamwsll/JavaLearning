import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;
import java.io.Console;
import java.util.Date;
public class LearningIO
{
    public static void main(String[] args)
    {
//        Scanner in = new Scanner(System.in);
//        System.out.println("What's your name?");
//        String name = in.nextLine();
//        String firstName = in.next();
//        System.out.println("How old are you?");
//        int age = in.nextInt();
//        System.out.println("Hello, " + name + ". Next year, you'll be " + (age + 1) + ".");
//        in.close();
        //以下代码只能在控制台执行而不能在IDEA中执行。
//        Console cons = System.console();
//        String username = cons.readLine("User name: ");
//        char[] passwd = cons.readPassword("Password: ");
//        System.out.println("username: " + username + " passwd: " + new String(passwd));
//
//        System.out.printf("Hello, %s. Next year, you'll be %d.\n", name, age + 1);
//        String message = String.format("Hello, %s. Next year, you'll be %d.\n", name, age + 1);
//        System.out.println(message);
        System.out.printf("%tc \n",new Date());
        System.out.printf("%1$s %2$tB %2$te, %2$tY\n","Due date: \n",new Date());
        System.out.printf("%s %tB %<te, %<tY\n","Due date: \n",new Date());

  //有空再来测试文件IO
    }
}
