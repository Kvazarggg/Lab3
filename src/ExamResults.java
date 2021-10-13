import java.util.ArrayList;

public class ExamResults {

    ArrayList<ExamResult> examResults;

    public ExamResults() {
        this.examResults = new ArrayList<>();
    }

    void add(ExamResult examRes) {
        examResults.add(examRes);
    }

    public void IsExcellent() {
        boolean Check = false;
        for (ExamResult object : examResults) {
            for (int i = 0; i < 5; i++) {
                if (object.result[i].getMark() > 3) {
                    Check = true;
                } else {
                    Check = false;
                    break;
                }
            }
            if (Check == true) {
                System.out.println(object);
            }
        }
    }

    public void IsBadStudent() {
        boolean Check = false;
        for (ExamResult object : examResults) {
            for (int i = 0; i < 5; i++) {
                if (object.result[i].getMark() == 2) {
                    Check = true;
                    break;
                } else {
                    Check = false;
                }
            }
            if (Check == true) {
                System.out.println(object);
            }
        }
    }

    public void RemoveBadStudents() {
        boolean flag = false;
        for (ExamResult object : examResults) {
            for (int i = 0; i < 5; i++) {
                if (object.result[i].getMark() == 2) {
                    examResults.remove(object);
                    flag = true;
                    break;
                }
            }
            if (flag == true) {
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "ExamResults{" +
                examResults +
                '}';
    }
}

