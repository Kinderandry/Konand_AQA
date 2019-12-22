package Day2212;

public class Girl {
    final private String name;
    private int age;

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 30) this.age = age;
    }

    public void goToRest(String rest) {
        if ("Mac".equalsIgnoreCase(rest)) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }

    public int countInt(int... i) {
        int sum = 0;
        for (int i1 : i) {
            sum += i1;
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
