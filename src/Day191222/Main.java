package Day191222;

public class Main {
    public static void main(String[] args) {
        Girl mira = new Girl("Mira", 22);
//        mira.name = "Kolya"; is no available because of private type
//        mira.age = 10000; is no available because of private type
        System.out.println(mira.getName());
        mira.setAge(10000);
        System.out.println(mira);
        SuperGirl kat = new SuperGirl("Kat", 25, "fly");
        kat.goToRest("KFC");
        System.out.println(kat);

    }
}
