// Don't delete any comments below!!!

public class Makanan {
    // Todo : Create private attribute of Makanan (nama, jumlah, and harga)
    private String nama;
    private int jumlah;
    private double harga;

    // Todo : Create Constructor of Makanan
    public Makanan(String nama, int jumlah, double harga){
        this.nama = nama;
        this.jumlah = jumlah;
        this.harga = harga;
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
}
