public class Main {
    public static void main(String[] args) {
        Kucing kucing = new Kucing("Neko", 3, "British shorthair");
        System.out.println("Ini adalah " + kucing.nama);
        kucing.suara();
        kucing.makan();
        kucing.makan("ikan");

        Burung burung = new Burung("Beo", 2, "Biru");
        System.out.println("\nIni adalah " + burung.nama);
        burung.suara();
        burung.makan();
        burung.makan("pisang");

        System.out.println();
        kucing.infoHewan();
        burung.infoHewan();
    }
}