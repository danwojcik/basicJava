import java.util.Scanner;

public class Calculator {

        public static void main(String[] args) {

            System.out.println("wybierz dzialanie: suma-roznica-mnozenie-dzielenie");

            Scanner wejscie = new Scanner(System.in);
            String dzialanie = wejscie.nextLine();

            int wynik = 0;

            if (dzialanie.equals("suma")) {

                System.out.println("wybrales sumowanie");
                wpiszPierwszaWartosc();
                Scanner wartosc1 = new Scanner(System.in);
                int a = wartosc1.nextInt();
                wpiszDrugaWartosc();
                Scanner wartosc2 = new Scanner(System.in);
                int b = wartosc2.nextInt();
                wynik = a + b;
                System.out.println("Wynik "+ a +" + "+ b +" = " + wynik);
            }
            else if (dzialanie.equals("roznica")) {

                System.out.println("wybrales roznica");
                wpiszPierwszaWartosc();
                Scanner wartosc1 = new Scanner(System.in);
                int a = wartosc1.nextInt();
                wpiszDrugaWartosc();
                Scanner wartosc2 = new Scanner(System.in);
                int b = wartosc2.nextInt();
                wynik = a - b;
                System.out.println("Wynik "+ a +" - "+ b +" = " + wynik);
            }
            else if (dzialanie.equals("mnozenie")) {

                System.out.println("wybrales mnozenie");
                wpiszPierwszaWartosc();
                Scanner wartosc1 = new Scanner(System.in);
                int a = wartosc1.nextInt();
                wpiszDrugaWartosc();
                Scanner wartosc2 = new Scanner(System.in);
                int b = wartosc2.nextInt();
                wynik = a * b;
                System.out.println("Wynik "+ a +" * "+ b +" = " + wynik);
            }
            else if (dzialanie.equals("dzielenie")) {

                System.out.println("wybrales dzielenie");
                wpiszPierwszaWartosc();
                Scanner wartosc1 = new Scanner(System.in);
                int a = wartosc1.nextInt();
                wpiszDrugaWartosc();
                Scanner wartosc2 = new Scanner(System.in);
                int b = wartosc2.nextInt();
                wynik = a / b;
                System.out.println("Wynik "+ a +" / "+ b +" = " + wynik);
            }
            if(wynik %2 == 0) {

                System.out.println("wynik jest liczba parzysta");
            }
            else {

                System.out.println("wynik jest liczba nieparzysta");
            }
            System.out.println("podaj liczbe do sprawdzenia dzielenia bez reszty");
            Scanner podzielna = new Scanner(System.in);

            int a = podzielna.nextInt();

            if (wynik %a == 0) {

                System.out.println("wynik jest podzielny przez " + a);
            }
            else {

                System.out.println("wynik nie jest podzielny przez " + a);
            }
        }

        private static void wpiszPierwszaWartosc() {
            System.out.println("wpisz pierwsza wartosc");
        }

        private static void wpiszDrugaWartosc() {
            System.out.println("wpisz druga wartosc");
        }
}
