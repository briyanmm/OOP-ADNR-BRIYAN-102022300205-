class KomputerPremium extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean ruangPrivat;
    // To do: Buatlah constructor pada class KomputerPremium
    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPivat){
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.ruangPrivat = ruangPivat;
    }
    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    @Override
    public void informasi(){
        super.informasi();
        if (ruangPrivat){
            System.out.println("Ruangan ber-AC pribadi");
            System.out.println("Sofa gaming Exclusive");
            System.out.println("Komputer spesifikasi tinggi");
            System.out.println("Koneksi internet decicated 100mbps");
        }
        else{
            System.out.println("Ruangan gerah");
            System.out.println("Sofa Majapahit");
            System.out.println("Komputer spesifikasi rendah");
            System.out.println("Koneksi internet dedicate 1mbps");
        }

    }
    // To do: Buatlah method Pesan sesuai dengan ketentuan
    public void pesan(int nomorKomputer){
        System.out.println("Memesa komputer nomor: " + nomorKomputer);
    }
    // To do: Buatlah method TambahLayanan sesuai dengan ketentuan
    public void TambahLayanan(String makanan){
        System.out.println("Menambah layanan makanan: " + makanan);
    }
    // To do: Buatlah method TambahLayanan memakai Polymorphism Overloading sesuai dengan ketentuan
    public void TambahLayanan(String makanan, String minuman){
        System.out.println("Menambah layanan makanan: " + makanan);
        System.out.println("Menambah layanan makanan: "+ makanan + " dan " + minuman);
    }
}
