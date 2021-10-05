import java.util.Scanner;

public class BasketShop {

    public static void main(String[] args) {

        String[] towar = {"kombinerki", "nozyczki  ", "srubokret "};

        int[] ilosc = {4, 3, 2};
        int[] kupione = {0, 0, 0};
        double[] cena = {23.58, 9.67, 14.89};
        double suma = 0, suma2, reszta;
        int d;
        String b, c;

        Scanner klient = new Scanner(System.in);
        Scanner wyjscie = new Scanner(System.in);
        Scanner kwota = new Scanner(System.in);

        System.out.println("Witamy w sklepie z narzedziami");
        System.out.println("Jak masz na imie?");
        String a = klient.nextLine();
        System.out.println("Witaj " + a + "! Zobacz co mamy w ofercie: ");

        for (int i = 0; i < 3; i++) {

            System.out.print("- " + towar[i]);
            System.out.print(" - " + ilosc[i] + " szt");
            System.out.println(" - " + cena[i] + " zl/szt");
        }

        System.out.println("co chcialbys kupic?");

        do {
            b = klient.next();
            switch (b) {

                case "kombinerki":

                    if (ilosc[0] > 0) {

                        ilosc[0]--;
                        kupione[0]++;
                        System.out.println("Wybrales: " + b + " - dodano do koszyka");

                    } else {

                        System.out.println("Niestety brak towaru, wybierz cos innego lub przejdz do kasy");
                    }

                    suma = suma + cena[0];
                    break;

                case "nozyczki":
                    if (ilosc[1] > 0) {

                        ilosc[1]--;
                        kupione[1]++;
                        System.out.println("Wybrales: " + b + " - dodano do koszyka");

                    } else {

                        System.out.println("Niestety brak towaru, wybierz cos innego lub przejdz do kasy");
                    }

                    suma = suma + cena[1];
                    break;

                case "srubokret":

                    if (ilosc[2] > 0) {

                        ilosc[2]--;
                        kupione[2]++;
                        System.out.println("Wybrales: " + b + " - dodano do koszyka");

                    } else {

                        System.out.println("Niestety brak towaru, wybierz cos innego lub przejdz do kasy");
                    }
                    suma = suma + cena[2];
                    break;

                default:

                    System.out.println("Niestety, nie ma takiego towaru w ofercie");
            }
            System.out.println("Aktualna wartosc koszyka: " + suma + " zl");
            System.out.println("Czy chcialbys cos jeszcze kupic? [tak/nie]");
            c = wyjscie.next();

            switch (c) {

                case "tak":

                    System.out.println("Dostepne towary:");

                    for (int i = 0; i < 3; i++) {

                        System.out.print("- " + towar[i]);
                        System.out.print(" - " + ilosc[i] + " szt");
                        System.out.println(" - " + cena[i] + " zl/szt");
                    }
                    System.out.println("Co chcesz kupic?");
                    break;

                case "nie":

                    System.out.println("Twoj koszyk: ");

                    for (int i = 0; i < 3; i++) {

                        if (kupione[i] > 0) {

                            System.out.print("- " + towar[i]);
                            System.out.print(" - " + kupione[i] + " szt");
                            suma2 = kupione[i] * cena[i];
                            System.out.println(" - " + suma2 + " zl");

                        } else if (kupione[i] == 0) {

                            continue;
                        }
                    }
                    System.out.println("Wartosc zakupow: " + suma + " zl. Zapraszamy do kasy.");
                    System.out.println("Wpisz kwote:");

                    do {
                        d = kwota.nextInt();
                        reszta = d - suma;
                        if (reszta > 0) {

                            System.out.printf("%s %.2f %s\n", "Twoja reszta: ", reszta, " zl");

                        } else if (reszta < 0) {

                            System.out.println("Niestety, zaplaciles za malo");
                            System.out.println("Wpisz kwote: ");
                        }
                    }
                    while (reszta < 0);
                    System.out.println("Wpisz: koniec");
                    c = wyjscie.next();
                    break;

                default:

                    System.out.println("Dlad, wpisz nazwe towaru lub nie");
            }
        }
        while (!c.equals("koniec"));
        System.out.println("Dziekujemy za zakupy, zapraszamy ponownie!");
    }
}