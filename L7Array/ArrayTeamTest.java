package L7Array;

import L6Class.Student2;

public class ArrayTeamTest {
    public static void main (String [] args) {
        Student2 s1 = new Student2 ("Zhao", 38, 46, 29);
        Student2 s2 = new Student2 ("Qian", 89, 43, 59);
        Student2 s3 = new Student2 ("Li", 45, 96, 34);
        ArrayTeam team = new ArrayTeam ("noName", s1, s2, s3);
        System.out.println(team);
        System.out.println("Average score of team is: " + team.getAverage());
        System.out.println("Best student of team is: " + team.getBestStudent());
        Student2 best = team.getBestStudent();
        String name = best.getName();
        best.setName("Best " + name);
        System.out.println(best);


    }
}
