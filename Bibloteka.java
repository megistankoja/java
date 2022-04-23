public class Bibloteka {

  public static void main(String[] args) {

    /*
     * 
     * Bibloteken e perzgjedhim te kete 5 rrjeshta dhe 10 kolona,
     * ku rrjeshtat simbolizojne raftet dhe kolonat ndarjet ne nje raft
     * 
     */

    Liber[][] libra = new Liber[5][10];

    libra[0][1] = new Enciklopedi();
    libra[0][1].vendosTitullin("Njohuria");
    libra[0][1].vendosAutorin("Arben Muka");
    libra[0][1].vendosNumrinEFaqeve(74);
    libra[0][1].vendosKategorne("Femije");

    libra[2][3] = new Enciklopedi("Natyra", "Ralf Emerson", 250, "Per te rritur", "Vlerat e natyres ", 2009,
        "I shkruar ne vitet e fundit te jetes se autorit.");

    libra[4][2] = new Fjalor("Fjalori i Gjuhes Shqipe", "Jani Thomai", 500, "Per te rritur", 40000, "Pergjithshem",
        true);

    libra[1][4] = new LetersiArtistike("I huaj", "Albert Kamy", 260, "Per te rritur", "Roman", 1941,
        "Liber shume depertues. Shpalos konceptin e abusrdit ne menyre te shkelqyer.");

    System.out.println("\n");
    System.out.println(Liber.bibloteka);

    System.out.println("\n");
    System.out.println("Enciklopedi, libri i dyte ne raftin e pare => " + libra[0][1].toString());
    System.out.println("\n");
    System.out.println("Enciklopedi, libri i katert ne raftin e trete => " + libra[2][3].toString());
    System.out.println("\n");
    System.out.println("Fjalor, libri i trete ne raftin e peste => " + libra[4][2].toString());
    System.out.println("\n");
    System.out.println("Letersi Artistike, libri i peste ne raftin e dyte => " + libra[1][4].toString());
    System.out.println("\n");

  }
}
