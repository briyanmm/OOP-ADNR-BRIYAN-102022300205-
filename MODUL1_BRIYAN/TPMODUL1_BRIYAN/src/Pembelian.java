import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Pembelian {
    public static void main(String[] args) {
        ArrayList<Penerbangan> penerbanganList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Penumpang penumpang = null;
        Penerbangan penerbanganTerpilih = null;

        penerbanganList.add(new Penerbangan("GA101", "CGK, Jakarta", "DPS, Bali", "06:30", "08:15", 1200000));
        penerbanganList.add(new Penerbangan("QZ202", "SUB, Surabaya", "KNO, Medan", "09:00", "11:45", 1350000));

        boolean isRunning = true;
        while (isRunning) {
            try {
                System.out.println("\nEAD Ticket Booking System");
                System.out.println("1. Tampilkan Daftar Penerbangan");
                System.out.println("2. Beli Tiket");
                System.out.println("3. Tampilkan Pesanan Tiket");
                System.out.println("4. Exit");
                System.out.print("Silahkan pilih menu: ");
                
                int pilihanMenu = scanner.nextInt();
                scanner.nextLine();
                switch (pilihanMenu) {
                    case 1:
                        System.out.println("\nDaftar Penerbangan:");
                        for (int i = 0; i < penerbanganList.size(); i++) {
                            System.out.print((i + 1) + ". ");
                            penerbanganList.get(i).tampilDaftarPenerbangan();
                            System.out.println();
                        }
                        break;
                    case 2:
                        if (penumpang != null) {
                            System.out.println("Anda sudah memesan tiket. Silakan cek pesanan pada menu 3.");
                            break;
                        }
                        System.out.println("\nSilahkan isi data diri anda terlebih dahulu");
                        System.out.print("Masukkan NIK: ");
                        String NIK = scanner.nextLine();
                        System.out.print("Masukkan Nama Depan: ");
                        String namaDepan = scanner.nextLine();
                        System.out.print("Masukkan Nama Belakang: ");
                        String namaBelakang = scanner.nextLine();

                        penumpang = new Penumpang(NIK, namaDepan, namaBelakang);

                        System.out.println("\nTerima kasih telah mengisi Data Pelanggan. Silahkan pilih tiket penerbangan yang tersedia:");
                        for (int i = 0; i < penerbanganList.size(); i++) {
                            System.out.print((i + 1) + ". ");
                            penerbanganList.get(i).tampilDaftarPenerbangan();
                            System.out.println();
                        }
                        System.out.print("Pilih nomor penerbangan: ");
                        int pilihPenerbangan = scanner.nextInt();
                        scanner.nextLine();

                        if (pilihPenerbangan > 0 && pilihPenerbangan <= penerbanganList.size()) {
                            penerbanganTerpilih = penerbanganList.get(pilihPenerbangan - 1);
                            System.out.println("Pemesanan tiket berhasil dilakukan, cek pesanan tiket pada Menu (3)");
                        } else {
                            System.out.println("Nomor penerbangan tidak valid.");
                        }
                        break;
                    case 3:
                        if (penumpang == null || penerbanganTerpilih == null) {
                            System.out.println("Pembelian Tiket Tidak Ada");
                        } else {
                            System.out.println("\nDetail Tiket Penerbangan");
                            penumpang.tampilDaftarPenumpang();
                            penerbanganTerpilih.tampilDaftarPenerbangan();
                        }
                        break;
                    case 4:
                        System.out.println("Terima kasih!");
                        isRunning = false;
                        break;
                    default:
                        System.out.println("Pilihan tidak valid, silahkan coba lagi.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Menu tidak valid, silahkan isi dengan angka.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}