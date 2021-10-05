import java.time.LocalDate;

public class Calendar {

    public static void main(String[] args) {

        System.out.println(LocalDate.now().getMonth());
        System.out.println("Mo Tu We Th Fr Sa Su");
        System.out.print("--------------------");
        for (int a = 1; a <= LocalDate.MAX.getDayOfMonth(); a++) {
            TodayAndDayOfMonth(a);
        }
    }

    private static void TodayAndDayOfMonth(int today) {

        if (LocalDate.now().getDayOfMonth() == today) {
            System.out.print("[" + today + "]");
        }
        if (today % 7 == 1) {
            System.out.println();
        }
        if (today <= 9) {
            System.out.print(" ");
        }
        if (LocalDate.now().getDayOfMonth() == today) {
            return;
        }

        System.out.print(today + " ");
    }
}