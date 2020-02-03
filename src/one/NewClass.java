

package one;

import javax.swing.JOptionPane;


public class NewClass {
    public static void main(String[] args) {
        String korisničkiUnos = JOptionPane.showInputDialog("Unesite neki broj, molim vas.");
    int uneseniBroj = Integer.parseInt(korisničkiUnos);
    String imeDanaUSedmici = "unknown";
    switch (uneseniBroj) {
    case 1:
    imeDanaUSedmici = "Ponedjeljak";
    break;
    case 2:
    imeDanaUSedmici = "Utorak";
    break;
    case 3:
    imeDanaUSedmici = "Srijeda";
    break;
    case 4:
    imeDanaUSedmici = "Četvrtak";
    break;
    case 5:
    imeDanaUSedmici = "Petak";
    break;
    case 6:
    imeDanaUSedmici = "Subota";
    break;
    case 7:
    imeDanaUSedmici = "Nedjelja";
    break;
    default:
    imeDanaUSedmici = "MAMA NE LUPAJJJJ";
    break;
    }
    System.out.println("Ime dana koji odgovara broju "+ uneseniBroj + " je : " + imeDanaUSedmici);
    }

}


        