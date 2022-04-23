public class Enciklopedi implements Liber {
  private String titulli;
  private String autori;
  private int faqet;
  private String kategoria;
  private String subjekti;
  private int vitiProdhimit;
  private String kuriozitet;

  public Enciklopedi(
      String titulli,
      String autori,
      int faqet,
      String kategoria,
      String sub,
      int viti,
      String kuriozitet) {
    this.titulli = titulli;
    this.autori = autori;
    this.faqet = faqet;
    this.kategoria = kategoria;
    this.subjekti = sub;
    this.vitiProdhimit = viti;
    this.kuriozitet = kuriozitet;
  }

  public Enciklopedi() {
  }

  public void vendosKuriozitet(String kuriozitet) {
    this.kuriozitet = kuriozitet;
  }

  public String merrKuriozitet() {
    return this.kuriozitet;
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
    return ("Titulli: " + this.titulli + ", Autori: " + this.autori + ", Numri i faqeve: " + this.faqet
        + ", Kategoria: " + this.kategoria + ", Subjekti: " + this.subjekti + ", Viti i prodhimit: "
        + this.vitiProdhimit + ", Kuriozitet: " + this.kuriozitet);
  }
}
