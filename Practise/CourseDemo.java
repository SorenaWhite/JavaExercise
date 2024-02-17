package Practise;

class Course {
    private String courseName;
    private String[] students = new String[20];
    private int number=0;

    Course (String courseName) {
        this.courseName = courseName;
    }

    String getCourseName() {
        return courseName;
    }

    void addStudent(String student) {
        if (number >= 20) {
            System.out.println("Course is full");
            return;
        }
        students[number] = student;
        number++;
    }
    void dropStudent(String student) {
        int index=-1;
        for (int i=0; i< number; i++) {
            if (students[i] == student) {
                index=i;
            }
        }
        if (index==-1) {
            System.out.println("Student not enrolled");
            return;
        }
        for (int i=index; (i+1)<number; i++) {
            students[i] = students[i+1];
        }
        number--;
    }

    String[] getStudents() {
        return students;
    }
    int getNumber() {
        return number;
    }
}

public class CourseDemo {
    public static void main (String [] args) {
        Course cs = new Course("Computer Science");
        cs.addStudent("Zhang");
        cs.addStudent("San");
        cs.addStudent("Li");
        cs.addStudent("Si");
        cs.dropStudent("San");
        System.out.println("There are " + cs.getNumber() + " students");
        String[] names = cs.getStudents();
        for (int i=0; i<cs.getNumber(); i++) {
            
            System.out.printf("%s, ", names[i]);
            
        }
        System.out.println();

        System.out.println((double) (2/4+3));
    }
}
