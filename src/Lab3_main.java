import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Lab3_main {
    public static ExamResults exRes = new ExamResults();

    public static int CheckCorrectFunction(String value) {
        int func = -1;
        try {
            func = Integer.parseInt(value);
        } catch (NumberFormatException e) {
            func = -1;
        }

        return func;
    }

    public static void main(String[] args) {
        int function;
        Scanner in = new Scanner(System.in);

        exRes.add(new ExamResult("Beliy", "Max", "Aleksandrovich", 1, "IKS", 2,
                new Mark("Chemistry", "Mendeleev", 5), new Mark("Chemistry", "Mendeleev", 4),
                new Mark("Chemistry", "Mendeleev", 4), new Mark("Chemistry", "Mendeleev", 4),
                new Mark("Chemistry", "Mendeleev", 4)));

        exRes.add(new ExamResult("Ivanov", "Ivan", "Ivanovich", 2, "IRBT", 3,
                new Mark("Chemistry", "Mendeleev", 3), new Mark("Chemistry", "Mendeleev", 5),
                new Mark("Chemistry", "Mendeleev", 4), new Mark("Chemistry", "Mendeleev", 2),
                new Mark("Chemistry", "Mendeleev", 2)));


        do {
            System.out.println("\nСписок функций: ");
            System.out.println("[1] - Вывод массива на экран");
            System.out.println("[2] - Показать отличников");
            System.out.println("[3] - Показать двоечников");
            System.out.println("[4] - Показать дисциплину с наибольшим количеством двоечников");
            System.out.println("[5] - Удаление студентов-двоечников");
            System.out.println("[0] - Выход из программы");
            do {
                System.out.print("Введите номер функции: ");
                function = CheckCorrectFunction(in.nextLine());
            } while (function == -1);

            switch (function) {
                case 1:
                    System.out.println(exRes);
                    break;
                case 2:
                    System.out.println("\nСтуденты отличники: ");
                    exRes.IsExcellent();
                    break;
                case 3:
                    System.out.println("\nСтуденты двоечники: ");
                    exRes.IsBadStudent();
                    break;
                case 4:
                    break;
                case 5:
                    exRes.RemoveBadStudents();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("\nТакой функции нету");
            }
        } while (function != 0);
    }
}
