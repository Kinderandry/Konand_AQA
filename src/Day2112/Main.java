package Day2112;

public class Main {
    public static void main(String[] args) {
        Poly test = new Poly(15, 20);
        int x = 10;
        int y = 10;
        test.meth(x, y);
        System.out.println(x);
        System.out.println(y);
        test.meth(test);
        System.out.println(test.a);
        System.out.println(test.b);

/*
        test();
        test(10);
        test(10, 20);
        test(20.5);
        System.out.println(test("Hi"));
    }

    private static String test(String hi) {
        return "hi";
    }

    private static void test(double v) {
        System.out.println("test(double v)");
    }

    private static void test(int i, int i1) {
        System.out.println("test(int i, int i1)");
    }

//    private static void test(int i) {
//        System.out.println("test(int... i)");
//    }

    private static void test(int... i) {
        System.out.println("test(int... i)");
    }

    private static void test() {
        System.out.println("test()");*/
    }



}
