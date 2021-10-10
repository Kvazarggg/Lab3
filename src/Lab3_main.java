import java.util.Scanner;

public class Lab3_main {

    public static void main(String[] args) {
        //ArrayList marks = new ArrayList();
        //ArrayList<Integer> marks = new ArrayList<>(0);
        //ArrayList<ExamResult> exRes = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int function;
        System.out.print("Введите количество студентов: ");
        int countStudRes = in.nextInt();

        in.nextLine();
        ExamResults res = new ExamResults(countStudRes);
        //ExamResult[] res = new ExamResult[1];
        int trueMark = -1;

        for (int i = 0; i < res.examResults.length; i++) {
            res.examResults[i] = new ExamResult();
            System.out.print("Введите Фамилию: ");
            res.examResults[i].setF(in.nextLine());
            System.out.print("Введите Имя: ");
            res.examResults[i].setI(in.nextLine());
            System.out.print("Введите Отчество: ");
            res.examResults[i].setO(in.nextLine());
            System.out.print("Введите Номер зачетки: ");
            res.examResults[i].setNumberGradeBook(in.nextInt());
            in.nextLine();
            System.out.print("Введите Наименование факультета: ");
            res.examResults[i].setFacultyName(in.nextLine());
            System.out.print("Введите Курс: ");
            res.examResults[i].setCourse(in.nextInt());
            in.nextLine();
            for (int j = 0; j < 5; j++){
                res.examResults[i].result[j] = new Mark();
                System.out.print("Введите Название предмета: ");
                res.examResults[i].result[j].setSubjectName(in.nextLine());
                System.out.print("Введите Фамилию преподавателя: ");
                res.examResults[i].result[j].setTeacherName(in.nextLine());
                do {
                    System.out.print("Введите Оценку: ");
                    trueMark = Mark.CheckCorrectMark("" + in.nextLine());
                    if (trueMark == -1) {
                        System.out.println("Ошибка! Вы ввели неверное значение.");
                    } else {
                        res.examResults[i].result[j].setMark(trueMark);
                    }
                } while (trueMark == -1);
                //in.nextLine();
            }
            System.out.println();
        }

        for (int i = 0; i < res.examResults.length; i++) {
            System.out.println(res.examResults[i].toString());
            for (int j = 0; j < 5; j++)
            {
                System.out.println(res.examResults[i].result[j].toString());
            }
            System.out.println();
        }

        do {
            System.out.println("\nСписок функций: ");
            System.out.println("[1] - Показать отличников");
            System.out.println("[2] - Показать двоечников");
            System.out.println("[3] - Показать дисциплину с наибольшим количеством двоечников");
            System.out.println("[4] - Удаление студентов-двоечников");
            System.out.println("[0] - Выход из программы");
            System.out.print("Введите номер функции: ");
            function = in.nextInt();

            switch (function) {
                case 1:
                    System.out.println("\nОтличники: ");
                    for (int i = 0; i < res.examResults.length; i++) {
                        if (res.IsExcellent(i) == true) {
                                System.out.println(res.examResults[i].toString());
                                for (int j = 0; j < 5; j++) {
                                    System.out.println(res.examResults[i].result[j].toString());
                                }

                        } /*else {
                            System.out.println("Нету отличников");
                        }*/
                    }
                    break;
                case 2:
                    System.out.println("\nСтуденты имеющие двойки: ");
                    for (int i = 0; i < res.examResults.length; i++) {
                        if (res.IsBadStudent(i) == true) {
                            System.out.println(res.examResults[i].toString());
                            for (int j = 0; j < 5; j++) {
                                System.out.println(res.examResults[i].result[j].toString());
                            }

                        } /*else {
                            System.out.println("Нету двоечников");
                        }*/
                    }
                    break;
                case 3:
                    System.out.println("Третья функция");
                    break;
                case 4:
                    System.out.println("Четвертая функция");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("\nТакой функции нету");
            }
        } while (function != 0);
    }
}
