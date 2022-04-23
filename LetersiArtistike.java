
public class LetersiArtistike implements Liber {

    private String titulli;
    private String autori;
    private int faqet;
    private String kategoria;
    private String zhaneri;
    private int vitiPublikimit;
    private String koment;

    public LetersiArtistike(String titulli, String autori, int faqet, String kategoria, String zhaneri, int viti,
            String koment) {
        this.titulli = titulli;
        this.autori = autori;
        this.faqet = faqet;
        this.kategoria = kategoria;
        this.zhaneri = zhaneri;
        this.vitiPublikimit = viti;
        this.koment = koment;
    }

    @Override
    public void vendosTitullin(String titulli) {
        this.titulli = titulli;
    }

    @Override
    public void vendosAutorin(String autori) {
        this.autori = autori;

    }

    @Override
    public void vendosNumrinEFaqeve(int faqet) {
        this.faqet = faqet;
    }

    @Override
    public void vendosKategorne(String kategoria) {
        this.kategoria = kategoria;
    }

    @Override
    public String merrTitullin() {
        return this.titulli;
    }

    @Override
    public String merrAutorin() {
        return this.autori;
    }

    @Override
    public int merrNumrinEFaqeve() {
        return this.faqet;
    }

    @Override
    public String merrKategorine() {
        return this.kategoria;
    }

    @Override
    public String toString() {
        return "Titulli : " + this.titulli + ", Autori: " + this.autori + ", Numri i faqeve: " + this.faqet
                + ", Kategoria: " + this.kategoria + ", Zhaneri: " + this.zhaneri + ", Viti publikimit: "
                + this.vitiPublikimit + ", Komenti: " + this.koment;
    }

}