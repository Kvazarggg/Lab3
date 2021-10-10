import java.util.Arrays;

public class ExamResult {
    String f;
    String i;
    String o;
    int numberGradeBook;
    String facultyName;
    int course;
    Mark[] result = new Mark[5];

    public String getF() {
        return f;
    }

    public void setF(String f) {
        this.f = f;
    }

    public String getI() {
        return i;
    }

    public void setI(String i) {
        this.i = i;
    }

    public String getO() {
        return o;
    }

    public void setO(String o) {
        this.o = o;
    }

    public int getNumberGradeBook() {
        return numberGradeBook;
    }

    public void setNumberGradeBook(int numberGradeBook) {
        this.numberGradeBook = numberGradeBook;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Mark[] getResult() {
        return result;
    }

    public void setResult(Mark[] result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "ExamResult{" +
                "f='" + f + '\'' +
                ", i='" + i + '\'' +
                ", o='" + o + '\'' +
                ", numberGradeBook=" + numberGradeBook +
                ", facultyName='" + facultyName + '\'' +
                ", course=" + course +
                '}';
    }
}

