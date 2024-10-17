// Don't delete any comments below!!!
public class MakananBasah {
    // Todo : Create private attribute of MakananKering (nama, jumlah, harga, and bahan)
    private String nama;
    private int jumlah;
    private double harga;
    private String bahan;

    // Todo : Create Constructor of MakananBasah
    public MakananBasah(String nama, int jumlah, double harga, String bahan){
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
        this.bahan = bahan;
    }
    // Todo : Create Getter and Setter
    public String getName(){
        return nama;
    }
    public void setName(String nama){
        this.nama = nama; 
    }
    public int getJumlah(){
        return jumlah;
    }
    public void getJumlah(int jumlah){
        this.jumlah = jumlah;
    }
    public double setHarga(){
        return harga;
    }
    public void getHarga(double harga){
        this.harga = harga;
    }
    public String getBahan(){
        return bahan;
    }
    public void setBahan(String bahan){
        this.bahan = bahan;    
    }      
    // Todo : Create Method ShowData
    public void tampilkanData(){
        System.out.println("Nama Makanan" + nama);
        System.out.println("Jumlah : " + jumlah);
        System.out.println("Harga : " + harga);
        System.out.println("bahan : " + bahan);
    }
}

