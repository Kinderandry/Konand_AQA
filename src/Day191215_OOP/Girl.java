package Day191215_OOP;

class Girl {
    String name;
    int age;

    public Girl(String name, int age) {
        this();
        this.name = name;
        this.age = age;
    }

    public Girl() {
        this.name = "Default name";
        this.age = 18;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void goToCinema() {
        System.out.println("Go to cinema! say - " + name);
    }

    public String goToRest(String rest) {
        if ("Mac".equalsIgnoreCase(rest)) {
            return "No";
        } else {
            return "Go";
        }
    }

    public int countInts(int ... i) {
        int sum = 0;
        for (int a : i) {
            sum += a;
        }
        return sum;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Good bye");
    }
}
