public class Album {
    private String judul;
    private String artis;
    private int available;
    private int total;

    public Album(String judul, String artis, int total, int available) {
        this.judul = judul;
        this.artis = artis;
        this.total = total;
        this.available = available;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getArtis() {
        return artis;
    }

    public void setArtis(String artis) {
        this.artis = artis;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
