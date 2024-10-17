// Don't delete any comments below!!!
// Todo : Import Arraylist and Scanner
import java.util.ArrayList;
import java.util.Scanner;

public class ManajemenInventaris {
    // Todo : Create ArrayList of MakananKering (daftarMakananKering) and MakananBasah (daftarMakananBasah) to store items
    private ArrayList<MakananKering> daftarMakananKering = new ArrayList<>();
    private ArrayList<MakananBasah> daftarMakananBasah = new ArrayList<>();

    public void tambahMakananKering() {
        Scanner scanner = new Scanner(System.in);
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Brand Makanan
        System.out.print("Masukan Nama Makanan : ");
        String nama = scanner.nextLine();
        System.out.print("Masukan Jumlah Makanan");
        int jumlah =  scanner.nextInt();
        System.out.print("Masukan Harga Makanan : ");
        double harga =  scanner.nextDouble();
        System.out.print("Masukan Brand Makanan : ");
        String brand = scanner.nextLine();

        // Todo : Create a new object for MakananKering
        MakananKering Makanan = new MakananKering(nama, jumlah, harga, brand);
        daftarMakananKering.add(new MakananKering(nama, jumlah, harga, brand));

        // Todo : Create Print Notifitaction "Makanan kering berhasil ditambahkan"
        System.out.println("'Makanan kering berhasil ditambahkan");
    }

    public void tambahMakananBasah() {
        Scanner scanner = new Scanner(System.in);
        // Todo : Create input for Nama Makanan, Jumlah Makanan, Harga Makanan, and Bahan Makanan
        System.out.print("Masukan Nama Makanan : ");
        String nama =  scanner.nextLine();
        System.out.print("Masukan Jumlah Makanan");
        int jumlah =  scanner.nextInt();
        System.out.print("Masukan Harga Makanan : ");
        double harga =  scanner.nextDouble();
        System.out.print("Masukan Bahan Makanan : ");
        String bahan =  scanner.nextLine();

        // Todo : Create a new object for MakananBasah
        MakananBasah Makanan = new MakananBasah(nama, jumlah, harga, bahan);
        daftarMakananBasah.add(new MakananBasah(nama, jumlah, harga, bahan));
        // Todo :Create Print Notifitaction "Makanan Basah berhasil ditambahkan"
        System.out.println("Makanan basah berhasil ditambahkan");
    }

    public void tampilkanSemuaMakanan() {
        if (daftarMakananKering.isEmpty() && daftarMakananBasah.isEmpty()) {
            // Todo : Create Print Notification "Tidak ada makanan disini"
            System.out.println("Tidak ada makanan disini");
        } else {
            // Todo : Create print notification for Makanan Kering  
            for (MakananKering Makanan : daftarMakananKering){
                System.out.println("=============");
                Makanan.tampilkanData();            
            }
            // Todo : Create print notification for  Makanan Basah
            for(MakananBasah Makanan : daftarMakananBasah){
                System.out.println("=============");
                Makanan.tampilkanData();  
            }
        }
    }
}
