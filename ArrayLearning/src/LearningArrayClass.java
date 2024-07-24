import java.util.Arrays;
public class LearningArrayClass
{
    public static void main(String[] args)
    {
        //创建数组的两种方式
        int[] arr1 = new int[3];
        int[] arr2 = {9, 2, 3};
        //事实上c++风格的int arr[3]也是可以的，但是java中似乎喜欢采用上面的写法。

        //匿名数组：
        //new int[]{1, 2, 3};

        //数组是可以赋值的。
        arr1 = arr2;

        //数组自带一些方法。
        for(int i = 0; i < arr1.length; i++)
        {
            System.out.println(arr1[i]+" ");
        }

        //数组默认值是0/null/false   这点与c++不同，c++需要手动清零

        //数组也有c++式的for-each循环
        for(int i : arr1)
        {
            System.out.println(i+" ");
        }

        //有一种叫做to_string的方法，可以将数组转化为字符串。
        //数组打印出来之间显示的是逗号分隔的。
        System.out.println(Arrays.toString(arr1));

        //前面的数组拷贝实际上是引用了同一个数组
        arr1[0] = 100;
        System.out.println(Arrays.toString(arr2));

        //如果要真正的拷贝一个数组，可以使用Arrays.copyOf方法
        int[] arr3 = Arrays.copyOf(arr2, arr2.length);
        arr3[0] = 100;
        System.out.println(Arrays.toString(arr2));

        //这种方法其实也可以用来扩容数组
        arr3 = Arrays.copyOf(arr3, arr3.length+1);
        //扩容之后多出来的部分会被赋值为0/null/false

        //数组默认是会进行越界检查的

        //注意args数组是不会包括程序名和java这两个字符的，也就是
        //java LearningArrayClass -h world这样的话args数组的长度是2,只包含-h和world
        System.out.println(Arrays.toString(args));

        //数组排序
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        //Math.random()返回一个0-1之间的随机数
        System.out.println((int)(Math.random()*100));

        //数组的二分查找,如果找到返回索引，否则返回负数
        //还有一个int binarySearch(int[] a, int fromIndex, int toIndex, int key)方法
        //如果未找到，则返回一个负数，该负数的绝对值减1即为为使得数组有序，新元素应插入的位置
        System.out.println(Arrays.binarySearch(arr2, 2));

        //数组还有equals方法，可以用来比较两个数组是否相等
        System.out.println(Arrays.equals(arr2, arr3));

        //多维数组与c++类似，现在仅仅列出不同的部分。
        int[][] arr4 = new int[3][3];
        //这样创建的数组是一个3*3的数组，每个元素都是0

        //有一种快速打印二维数组的方式，格式如下：
        System.out.println(Arrays.deepToString(arr4));
        //打印结果为[[0, 0, 0], [0, 0, 0], [0, 0, 0]]

        //如果我们想实现不规则的多维数组，只需要在new的时候第二个括号不填，然后后续再分配即可
        int[][] arr5 = new int[3][];
        //这句话实际上是创建了三个指针数组，但是指针数组的元素都是null
        arr5[0] = new int[1];
        arr5[1] = new int[2];
        System.out.println(Arrays.deepToString(arr5));

        //好了，现在基础的部分已经结束，我们即将进入面向对象部分了。
    }
}
