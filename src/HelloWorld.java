import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int weight;
        String breed = "Golden Retriever";

        weight = 40;
        breed  = "Puppy";

        long longNum;

        longNum = 123L;

        System.out.println(weight);

        System.out.println("Sherman is a " + breed + " and weighs " + weight + "lbs");

        int x = 10;
        int y = 2;
//        x = x / y;
//        y = y - x;
//        System.out.println(x);
        y -= (x/y);
        System.out.println(y);
    }
}