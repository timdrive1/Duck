import java.util.Arrays;

/**
 * Created by Тим on 05.06.2017.
 */
public class DuckSortTestDrive {

    public static void main(String[] args) {
        Duck[] ducks = {
                new Duck("дональд", 123321),
                new Duck("кря", 12414),
                new Duck("корупе", 187557),
                new Duck("ДВШГ ", 22457542),
                new Duck("тппвьD", 145645),
                new Duck("ЫывЫЫЫЫЫЫЫЫЫ", 3464134ё)
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