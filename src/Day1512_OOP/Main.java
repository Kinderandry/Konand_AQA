package Day1512_OOP;

public class Main {
    public static void main(String[] args) {
        Girl girl = new Girl("Ira", 25);
        System.out.println(girl);
        Girl girl1 = new Girl("Mira", 22);
        System.out.println(girl1);
        System.out.println(girl.name);
        System.out.println(girl1.name);
        girl.goToCinema();
        girl1.goToCinema();
        System.out.println(girl.goToRest("Mac"));
        System.out.println(girl.goToRest("Kulinichi"));
        System.out.println(girl.countInts(3, 5, 6, 7, 8, 9));
        girl = null;
        System.gc();
    }
}
