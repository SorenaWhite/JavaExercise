package L7Array;

import L6Class.Student2;

public class ArrayTeam {    
    Student2 [] students; //a team that has three student members
    String name;

    public ArrayTeam (String name, Student2 s1, Student2 s2, Student2 s3) { //constructor
        this.name = name;
        students = new Student2[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
    }

    public Student2 getBestStudent() {
        Student2 bestStudent = students[0];
        for (int i=0; i < students.length; i++)
        {
            int b = bestStudent.getTotal(); // best student is determined by student with greatest total score
            int b1= students[i].getTotal();
            if (b < b1)
            {
                bestStudent = students[i];
            }
        }
        return bestStudent;
    }

    public double getAverage() {
        int total=0;
        for (int i=0; i < students.length; i++)
        {
            total = total + students[i].getTotal();
        }
        double average = total/students.length;
        return average;
    }





    /*Student s1 = new Student ("Zhao", 96, 98, 97);
    Student s2 = new Student ("Qian", 99, 97, 99);
    Student s3 = new Student ("Sun", 100, 100, 100);

    HWTeam [] team = new HWTeam(s1, s2, s3);



    Student bestStudent = s1;
    Student getBestStudent () {
        for (int i=0; i <= 3; i++)
        {
            if (bestStudent < team[i])
            {
                return bestStudent = team[i];
            }
        }
    } */
}
