package L6Class;

class student {
    int score1;
    int score2;
    int score3;

    int getAverage(int score1, int score2, int score3) {
        return (score1+score2+score3)/3;
    }
}

public class HWStudent {
    student student1 = new student();
    student student2 = new student();
    student student3 = new student();

    int stu1 = student1.getAverage(48,56,24);
    int stu2 = student2.getAverage(48,34,94);
    int stu3 = student3.getAverage(34,56,76);

    String getBestStudent(int stu1, int stu2, int stu3){
        if (stu1 > stu2 && stu1 > stu3){
            return "student1";
        }
        else if (stu1 == stu2 && stu1 > stu3){
            return "both student1 and student2";
        }
        else if (stu1 > stu2 && stu1 == stu3){
            return "both student1 and student3";
        }
        else if (stu2 > stu1 && stu2 > stu3){
            return "student2";
        }
        else if (stu2 == stu3 && stu2 > stu1){
            return "both student2 and student3";
        }
        else{
            return "student3";
        }
    }

    //public String toString(){
    //    return "The best student is " + getBestStudent() + " with an average score of " 
        /*need average score here */;
    //}
}

