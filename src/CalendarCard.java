import java.time.LocalDate;
import java.time.LocalTime;

public class CalendarCard {

    public static void main (String [] args) {

        System.out.println("Dzisiaj jest " + LocalDate.now());
        System.out.println("Jest godzina " + LocalTime.now());
        System.out.println();
        System.out.print("godzina: ");

        for (int a = 0; a < LocalTime.now().getHour(); a++) {

            if (a %10 == 0) {

                System.out.println();
            }

            System.out.print("*");
        }

        System.out.println();
        System.out.println();
        System.out.print("minuta: ");

        for (int a = 0; a < LocalTime.now().getMinute(); a++) {

            if (a %10 == 0) {
                System.out.println();
            }

            System.out.print("*");
        }

        System.out.println();
        System.out.println();
        System.out.print("sekunda: ");

        for (int a = 0; a < LocalTime.now().getSecond(); a++) {

            if (a %10 == 0){
                System.out.println();
            }

            System.out.print("*");
        }
    }
}
