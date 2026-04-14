class Hewan {
    void suara() {
        System.out.println("Hewan bersuara");
    }
}

class Kucing extends Hewan {
    // Override method dari class Hewan
    @Override
    void suara() {
        System.out.println("Kucing mengeong");
    }
}

public class OverridingExample {
    public static void main(String[] args) {
        Hewan h = new Hewan();
        h.suara();

        Kucing k = new Kucing();
        k.suara();

        // Polymorphism
        Hewan hk = new Kucing();
        hk.suara();
    }
}