
public class Fjalor implements Liber {

    private String titulli;
    private String autori;
    private int faqet;
    private String kategoria;
    private int numriFjaleve;
    private String termat;
    private boolean njegjuhesor;

    public Fjalor(String titulli, String autori, int faqet, String kategoria, int numri, String terma,
            boolean njegjuhesor) {
        this.titulli = titulli;
        this.autori = autori;
        this.faqet = faqet;
        this.kategoria = kategoria;
        this.numriFjaleve = numri;
        this.termat = terma;
        this.njegjuhesor = njegjuhesor;
    }

    public boolean eshteFjalorNjeGjuhesor() {
        return this.njegjuhesor;
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
                + ", Kategoria: " + this.kategoria + ", Numri i fjaleve: " + this.numriFjaleve
                + "Termat ne kete fjalor jane: " + this.termat + ", Njegjuhesor: " + this.njegjuhesor;
    }

}
