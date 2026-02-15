public class HelloWorld{
    public static void main(String[] args){
        System.out.println("Hello Sonu welcome Back to java programming");
        int a = 102;
        boolean isJavaFun = true;
        byte b = 100;
        short s = 1000;
        long l = 100000;
        float f = 3.14f;
        double d = 3.14159d;

        System.out.println("Integer value: " + a);
        System.out.println("Boolean value: " + isJavaFun);
        System.out.println("Byte value: " + b);
        System.out.println("Short value: " + s);
        System.out.println("Long value: " + l);
        System.out.println("Float value: " + f);
        System.out.println("Double value: " + d);

        // implicit conversion
        int x = 12;
        long y = x; // implicit conversion

        // explicit conversion
        long longValue = 100;
        int intValue = (int)longValue;
    }
}
