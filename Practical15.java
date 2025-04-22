class Amaze {
    void sound() {
        System.out.println("its makes happyy");
    }
}


class Honda extends Amaze {
    void model() {
        System.out.println("M5 CS");
    }
}


class HondaCarindiaLtd extends Honda {
    void speed() {
        System.out.println("top speed 300+kmph");
    }
}


public class Main {
    public static void main(String[] args) {
        HondaCarindiaLtd Suiii = new HondaCarindiaLtd();
        Suiii.sound(); 
        Suiii.model();   
        Suiii.speed();
}
}
