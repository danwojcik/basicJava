import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

public class CalendarInfo {

    public static void main(String[] args) {

        System.out.println("Pierwszy napis\n");

        int rzut = (int) (Math.random() * 6 + 1);

        System.out.println(rzut);

        switch (rzut) {

            case 1:
            case 3:
            case 5:
                System.out.println("wyrzuciles cyfre nieparzysta");
                break;

            case 2:
            case 4:
                System.out.println("wyrzuciles cyfre parzysta");
                break;

            case 6:
                System.out.println("wyrzuciles cyfre parzysta");
                System.out.println("WYGRALES");
                break;
        }
        System.out.println();

        LocalTime poradnia = LocalTime.parse("02:06:00");
        System.out.println("Jest godzina: " + poradnia);

        if (poradnia.getHour() > 5 && poradnia.getHour() <= 8) {

            System.out.println("Pora dnia: RANO");

        } else if (poradnia.getHour() > 8 && poradnia.getHour() <= 12) {

            System.out.println("Pora dnia: PRZED POLUDNIU");

        } else if (poradnia.getHour() > 12 && poradnia.getHour() <= 17) {

            System.out.println("Pora dnia: PO POLUDNIEM");

        } else if (poradnia.getHour() > 17 && poradnia.getHour() <= 22) {

            System.out.println("Pora dnia: PO POLUDNIEM");

        } else {

            System.out.println("Pora dnia: NOC");
        }
        LocalDate dzien = LocalDate.parse("2020-12-13");

        if (dzien.getDayOfWeek() == DayOfWeek.SUNDAY) {

            System.out.println("NIEDZIELA - swieto, dzien wolny");

        } else if (dzien.getDayOfWeek() == DayOfWeek.SATURDAY) {

            System.out.println("SOBOTA, dzien wolny");

        } else {

            System.out.println("Weekend sie skonczyl - Dzien pracujacy");
        }
        //LocalDate wyplata  = LocalDate.parse("2020-02-11");
        if (dzien.getDayOfMonth() >= 1 && dzien.getDayOfMonth() <= 10) {

            System.out.println("Poczatek miesiaca, czas wyplaty");

        } else {

            System.out.println("Niestety, jest juz po wyplacie");
        }
        //LocalDate poraroku = LocalDate.parse("2020-12-04");
        if (dzien.getMonthValue() >= 1 && dzien.getMonthValue() <= 3) {

            System.out.println("jest ZIMA, ubierz sie cieplo");

        } else if (dzien.getMonthValue() >= 4 && dzien.getMonthValue() <= 6) {

            System.out.println("jest WIOSNA, wyciagnij rower");

        } else if (dzien.getMonthValue() >= 7 && dzien.getMonthValue() <= 9) {

            System.out.println("jest LATO, grzeje slonce");

        } else if (dzien.getMonthValue() >= 10 && dzien.getMonthValue() <= 12) {

            System.out.println("jest JESIEN, poszukaj czapki i rekawiczek");

        }
    }
}
