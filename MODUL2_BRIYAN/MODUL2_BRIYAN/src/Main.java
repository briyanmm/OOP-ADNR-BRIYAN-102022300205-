public class Main {
    public static void main(String[] args) {

        // To do: Buatlah sebuah Objek baru dari class Komputer
        Komputer komputer1 = new Komputer (20, "Warnet Gaming X", 5000);

        // To do: Panggillah Method Informasi dari class Komputer
        komputer1.informasi();
        System.out.println();


        // To do: Buatlah sebuah Objek baru dari class KomputerVIP 
        KomputerVIP komputer2 = new KomputerVIP(15, "Warnet Gaming X", 7000, true);

        // To do: Panggillah Method Informasi dari class KomputerVIP
        komputer2.informasi();
        // To do: Panggillah Method Login
        komputer2.Login("Asep");
        // To do: Panggillah Method Bermain 2x agar dapat melakukan polymorphism overloading
        komputer2.Bermain(0);
        komputer2.Bermain(0, 0);
        

        System.out.println();
        // To do: Buatlah sebuah Objek baru dari class KomputerPremium
        KomputerPremium komputer3 = new KomputerPremium(5, "Warnet Gaming X", 10000, true);
        // To do: Panggillah Method Informasi dari class KomputerPremium
        komputer3.informasi();
        // To do: Panggillah Method Pesan
        komputer3.pesan(5);
        // To do: Panggillah Method TambahLayanan 2x agar dapat melakukan polymorphism overloading
        komputer3.TambahLayanan("Mie Goreng");
        komputer3.TambahLayanan("Mie Goreng", "Es TEh");

    }
}