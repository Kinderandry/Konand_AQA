package Day191221;

public class Poly {
    int a;
    int b;

    public Poly(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void meth(int x , int y) {
        x *= 2;
        y /= 2;
        System.out.println();
    }

    public void meth(Poly test) {
        test.a *= 2;
        test.b /= 2;
        System.out.println();
    }
}
