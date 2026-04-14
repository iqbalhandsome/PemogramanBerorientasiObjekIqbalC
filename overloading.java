class OverloadingExample {

    // Method tanpa parameter
    void tampil() {
        System.out.println("Tampil tanpa parameter");
    }

    // Method dengan 1 parameter
    void tampil(String nama) {
        System.out.println("Tampil dengan nama: " + nama);
    }

    // Method dengan 2 parameter
    void tampil(String nama, int umur) {
        System.out.println("Nama: " + nama + ", Umur: " + umur);
    }

    public static void main(String[] args) {
        OverloadingExample obj = new OverloadingExample();

        obj.tampil();
        obj.tampil("Budi");
        obj.tampil("Budi", 20);
    }
}