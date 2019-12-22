package Day2212;

public class Main2 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Point point = new Point(10, 10);
        Point point1 = new Point(10, 11);
        System.out.println(point.toString());
        System.out.println(point.hashCode());
        System.out.println(point1.hashCode());
        System.out.println(point.equals(point1));
        System.out.println(point.getClass() == Point.class);
        System.out.println(point.clone());

    }
}
