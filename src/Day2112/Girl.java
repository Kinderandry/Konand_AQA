package Day2112;

public class Girl {
    String name;
    int age;

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String goToRest(String rest) {
        if ("Mac".equalsIgnoreCase(rest)) {
            return "No";
        } else {
            return "Yes";
        }
    }

    public int countInt(int... i) {
        int sum = 0;
        for (int i1 : i) {
            sum += i1;
        }
        return sum;
    }
}
