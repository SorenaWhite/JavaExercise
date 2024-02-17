package L6Class;

public class TeamTest {
    public static void main (String [] args)throws Exception {
        Student s1 = new Student ("Zhao", 96, 98, 97);
        Student s2 = new Student ("Qian", 99, 97, 99);
        Student s3 = new Student ("Sun", 100, 100, 100);
        HWTeam t = new HWTeam (s1, s2, s3);
        System.out.println(t);
        System.out.println("average:"+t.getAverage());
        Student b = t.getBestStudent();
        b.setName("Best");
        System.out.println(b);
        System.out.println("Best student:" + t.getBestStudent());
    }
}
