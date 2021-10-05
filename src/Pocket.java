import java.util.Scanner;

public class Pocket {

    public static void main(String args[]) {

        int[] skarbonka = {1, 2, 5, 10, 20};
        int suma = 0;
        int ilosc =0;

        System.out.println("To twoja skarbonka, dostępne nominały to: 1 zł, 2 zł, 5 zł, 10 zł i 20 zł");
        System.out.println("Podaj kwotę jaką chcesz uzbierać");

        Scanner kwota = new Scanner(System.in);

        int b = kwota.nextInt();

        while (suma<b) {

            int a=0;

            for (int k = 0; k < 1; k++) {

                int los = (int) (Math.random() * skarbonka.length);
                System.out.print("dodano do skarbonki " + skarbonka[los] + " zl, ");
                suma += skarbonka[los];
                System.out.println("w skarbonce jest " + suma + " zl");
            }
            ilosc += a+1;
        }
        System.out.println("Do skarbonki wrzuciłeś " +ilosc +" monet");
        System.out.println("BRAWO, uzbierałes " +suma +" zl, możesz zaszaleć");
    }
}
