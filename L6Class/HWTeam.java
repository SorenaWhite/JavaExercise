package L6Class;

public class HWTeam {
    Student s1;
    Student s2;
    Student s3;

    public void Team(Student s1, Student s2, Student s3){
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
    }

    public HWTeam (Student s1, Student s2, Student s3) {
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
    }

    public Student getBestStudent(){
        int b1 = s1.getTotal();
        int b2 = s2.getTotal();
        int b3 = s3.getTotal();
        Student bestStudent = null;
        if (b1 >= b2 && b1 >= b3){
            bestStudent = this.s1;
        }
        else if (b2 >= b1 && b2 >= b3) {
            bestStudent = this.s2;
        }
        else {
            bestStudent = this.s3;
        }
        return bestStudent;
    }

    public double getAverage() {
        int total = s1.getTotal();
        total += s2.getTotal();
        total += s3.getTotal();
        return total/3;
    }

    public String toString() {
        return "Team [s1]]=" + s1 + ", s2=" + s2 + ", s3=" + s3 + "]";
    }
}
