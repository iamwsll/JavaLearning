public class LearningString
{
    public static void main(String[] args)
    {
        String greeting = "Hello";
        String s = greeting.substring(0, 3);
        System.out.println(s.equals(greeting)); //true
        System.out.println(s);
        System.out.println(greeting);
        System.out.println(greeting.length());
        System.out.println(greeting.compareTo("Hell"));
        System.out.println(greeting.isBlank());
        System.out.println(greeting.isEmpty());
        System.out.println(greeting.indexOf("l"));
        System.out.println(greeting.indexOf("l", 3));

        StringBuilder builder = new StringBuilder();
        builder.append("Hello");
        builder.append(",");
        String completedString = builder.toString();
        System.out.println(completedString);

        builder.setCharAt(0, 'M');
        System.out.println(builder.toString());

        builder.insert(0, "Hello");
        System.out.println(builder.toString());
        builder.delete(0, 5);
        System.out.println(builder.toString());
    }
}
