class BMW {
    String name;

    BMW(String name) {
        this.name = name;
    }

    void Drift() {
        System.out.println(name + " makes perfect Drift");
    }
}

class M4_CS extends BMW {

    M4_CS(String name) {
        super(name);
    }

    void speed() {
        System.out.println(name + " top speed 300+ kmph");
    }
}

public class Main {
    public static void main(String[] args) {
        M4_CS Suii = new M4_CS("BMW M3");

        Suii.Drift();
        Suii.speed();
    }
}
