public class ExamResults {
    ExamResult[] examResults;

    public ExamResults(int quantity) {
        this.examResults = new ExamResult[quantity];
    }

    public boolean IsExcellent(int position) {
        boolean Check = false;
        for (int j = 0; j < 5; j++) {
            if (examResults[position].result[j].getMark() > 3) {
                Check = true;
            } else {
                return false;
            }

        }
        return Check;
    }
    public boolean IsBadStudent(int position) {
        boolean isTwo = false;
        for (int j = 0; j < 5; j++) {
            if (examResults[position].result[j].getMark() == 2) {
                return true;
            } else {
                isTwo = false;
            }

        }
        return isTwo;
    }

}
