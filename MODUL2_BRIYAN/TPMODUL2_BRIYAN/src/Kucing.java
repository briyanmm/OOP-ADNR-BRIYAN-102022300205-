public class Kucing extends Hewan {
    private String ras;

    public Kucing(String nama, int umur, String ras) {
        super(nama, umur);
        this.ras = ras;
    }

    public void suara() {
        System.out.println(nama + " suka mengeong ketika meminta makan");
    }

    public void infoHewan() {
        super.infoHewan();
        System.out.println("Ras : " + ras);
    }
}