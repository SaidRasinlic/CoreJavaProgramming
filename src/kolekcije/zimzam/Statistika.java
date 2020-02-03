package kolekcije.zimzam;

public class Statistika {

    private int korisnik;
    private int racunar;
    private int brojIgara;
    private int nerijeseno;

    public Statistika() {
        korisnik = 0;
        racunar = 0;
        brojIgara = 0;
        nerijeseno = 0;
    }

    public void rezultat(int k, int r) {
        ++brojIgara;
        if (k == 0) {
            System.out.println("Korisnik je odigrao kamen");

            if (r == 0) {
                System.out.println("Racunar je odigrao kamen");
                nerijeseno++;

            } else if (r == 1) {
                System.out.println("Racunar je odigrao makaze");
                korisnik++;
            } else if (r == 2) {
                System.out.println("Racunar je odigrao papir");
                racunar++;
            }
        }

        if (k == 1) {
            System.out.println("Korisnik je odigrao makaze");
            if (r == 0) {
                System.out.println("Racunar je odigrao kamen");
                racunar++;
            } else if (r == 1) {
                System.out.println("Racunar je odigrao makaze");
                nerijeseno++;
            } else if (r == 2) {
                System.out.println("Racunar je odigrao papir");
                korisnik++;
            }
        }
        if (k == 2) {
            System.out.println("Korisnik je odigrao papir");
            if (r == 0) {
                System.out.println("Racunar je odigrao kamen");
                korisnik++;
            } else if (r == 1) {
                System.out.println("Racunar je odigrao makaze");
                racunar++;
            } else if (r == 2) {
                System.out.println("Racunar je odigrao papir");
                nerijeseno++;
            }
        }
    }

    public void ispisiStatistiku() {
        System.out.println("Odigrano je: " + brojIgara + " meceva.");
        System.out.println("Korisnik je pobijedio " + racunar + " puta" + "\nRacunar je pobijedio " + racunar + " puta"
                + "\nNerijeseno je bilo " + nerijeseno + " puta");
    }

}
