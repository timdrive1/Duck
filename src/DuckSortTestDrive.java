import java.util.Arrays;

/**
 * Created by Тим on 05.06.2017.
 */
public class DuckSortTestDrive {

    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("дональд", 8),
                new Duck("кря", 2),
                new Duck("корупе", 7),
                new Duck("ДВШГ ", 2),
                new Duck("тппвьD", 10),
                new Duck("ЫывЫЫЫЫЫЫЫЫЫ", 2)
        };

        System.out.println("До сортировки:");
        display(ducks);

        Arrays.sort(ducks);

        System.out.println("\nПосле сортировки:");
        display(ducks);
    }

    public static void display(Duck[] ducks) {
        for (int i = 0; i < ducks.length; i++) {
            System.out.println(ducks[i]);
        }
    }
}