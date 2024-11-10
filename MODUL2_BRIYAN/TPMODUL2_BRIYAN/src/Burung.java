public class Burung extends Hewan {
    private String warnaBulu;

    public Burung(String nama, int umur, String warnaBulu) {
        super(nama, umur);
        this.warnaBulu = warnaBulu;
    }

    public void suara() {
        System.out.println(nama + " suka berkicau di pagi hari");
    }

    public void infoHewan() {
        super.infoHewan();
        System.out.println("Warna bulu : " + warnaBulu);
    }
}
